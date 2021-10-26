package com.synesisit.courseManagement.controller;

import com.synesisit.courseManagement.entity.Teacher;
import com.synesisit.courseManagement.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/teacher")
    public Teacher addTeacher(@RequestBody Teacher teacherRequest) {
        teacherService.addTeacher(teacherRequest);
        return teacherRequest;
    }

    @PostMapping("/teachers")
    public List<Teacher> addTeacherList(@RequestBody List<Teacher> teacherRequest) {
        teacherService.addTeacherList(teacherRequest);
        return teacherRequest;
    }

    @GetMapping("/teacher/list")
    public List<Teacher> getTeacherAll() {
        return teacherService.getTeacherAll();
    }

    @GetMapping("/teacher/{teacherId}")
    public Teacher getSingleTeacher(@PathVariable("teacherId") Long teacherId) {
        return teacherService.getSingleTeacher(teacherId);
    }

    @PutMapping("/teacher/{teacherId}")
    public Teacher updateTeacher(@PathVariable("teacherId") Long teacherId,
                                 @RequestBody Teacher teacherRequest) {
        return teacherService.updateTeacher(teacherId, teacherRequest);
    }


    @PutMapping("/{teacherId}/teacher/{departmentId}")
    Teacher addDepartmentToTeacher(
            @PathVariable Long teacherId,
            @PathVariable Long departmentId
    ) {
        return teacherService.addDepartmentToTeacher(teacherId, departmentId);
    }


}
