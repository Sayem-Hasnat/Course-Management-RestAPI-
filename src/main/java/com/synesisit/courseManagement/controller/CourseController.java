package com.synesisit.courseManagement.controller;

import com.synesisit.courseManagement.entity.Course;
import com.synesisit.courseManagement.repository.CourseRepository;
import com.synesisit.courseManagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("/course/addCourse")
    public void addCourse(@RequestBody Course courseRequest) {
        courseService.save(courseRequest);
    }

    @GetMapping("/course/getAll")
    public List<Course> getAllCourse() {

        return courseService.getAllCourse();
    }
}

