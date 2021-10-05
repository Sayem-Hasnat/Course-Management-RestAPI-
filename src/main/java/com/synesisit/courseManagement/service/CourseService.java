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

    public List<Course> getAllCourse() {
        return courseRepository.findAllByIsExistTrue();
    }

    public Course save(Course courseRequest) {
        courseRepository.save(courseRequest);
        return courseRequest;
    }

    public List<Course> saveCourseList(List<Course> courseListRequest) {
        return courseRepository.saveAll(courseListRequest);
    }


    public Course getCourseById(Long courseId) {
        return courseRepository.findById(courseId).get();
    }

    public Course updateCourseById(Long courseId, Course courseRequestBody) {
        Course course = courseRepository.findById(courseId).get();
        course.setCourseCode(courseRequestBody.getCourseCode());
        course.setCourseName(courseRequestBody.getCourseName());
        course.setCourseId((long) courseRequestBody.getCourseCredit());
        course.setExist(courseRequestBody.getExist());

        course.setDepartmentList(courseRequestBody.getDepartmentList());
        course.setStudentList(courseRequestBody.getStudentList());
        
        courseRepository.save(course);
        return courseRepository.findById(courseId).get();
    }
}

