package com.synesisit.courseManagement.service;

import com.synesisit.courseManagement.entity.Course;
import com.synesisit.courseManagement.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public  List<Course> getAllCourse(){
            return courseRepository.findAllByIsExistTrue();
        }

    public void save(Course courseRequest) {
        courseRepository.save(courseRequest);
    }
}

