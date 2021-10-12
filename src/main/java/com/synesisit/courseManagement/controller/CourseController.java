package com.synesisit.courseManagement.controller;

import com.synesisit.courseManagement.entity.Course;
import com.synesisit.courseManagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("/course")
    public Course addCourse(@RequestBody Course courseRequest) {
        return courseService.save(courseRequest);
    }

    @PostMapping("/course/list")
    public List<Course> addCourseList(@RequestBody List<Course> courseListRequest) {
        return courseService.saveCourseList(courseListRequest);
    }

    @GetMapping("/course")
    public List<Course> getAllCourse() {
        return courseService.getAllCourse();
    }

    @GetMapping("/course/{courseId}")
    public Course getCourseById(@PathVariable Long courseId) {
        return courseService.getCourseById(courseId);
    }

    @PutMapping("/course/{courseId}")
    public Course updateCourseById(@PathVariable("courseId") Long courseId,
                                   @RequestBody Course courseRequestBody) {
        return courseService.updateCourseById(courseId, courseRequestBody);
    }

    @PutMapping("/{courseId}/students/{studentId}")
    Course addStudentToCourse(
            @PathVariable Long courseId,
            @PathVariable Long studentId
    ) {
        return courseService.addStudentToCourse(courseId, studentId);
    }

    @PutMapping("/{courseId}/students/{departmentId}")
    Course addDepartmentToCourse(
            @PathVariable Long courseId,
            @PathVariable Long departmentId
    ) {
        return courseService.addStudentToCourse(courseId, departmentId);
    }


}

