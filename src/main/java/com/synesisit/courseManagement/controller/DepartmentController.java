package com.synesisit.courseManagement.controller;

import com.synesisit.courseManagement.entity.Course;
import com.synesisit.courseManagement.entity.Department;
import com.synesisit.courseManagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/department")
    public List<Department> addDepartment(@RequestBody List<Department> departmentRequestList) {
        return departmentService.saveAllDepartment(departmentRequestList);
    }


    @GetMapping("/department")
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @GetMapping("/department/{departmentId}")
    public Department getDepartment(@PathVariable Long departmentId) {
        return departmentService.getSingleDepartment(departmentId);
    }

    @PutMapping("/{departmentId}/department/{studentId}")
    Department addStudentToDepartment(
            @PathVariable Long departmentId,
            @PathVariable Long studentId
    ) {
        return departmentService.addStudentToDepartment(departmentId, studentId);
    }

    @PutMapping("/{departmentId}/department/{courseId}")
    Department addCourseToDepartment(
            @PathVariable Long departmentId,
            @PathVariable Long courseId
    ) {
        return departmentService.addCourseToDepartment(departmentId, courseId);
    }


}
