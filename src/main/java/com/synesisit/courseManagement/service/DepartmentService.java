package com.synesisit.courseManagement.service;

import com.synesisit.courseManagement.entity.Course;
import com.synesisit.courseManagement.entity.Department;
import com.synesisit.courseManagement.entity.Student;
import com.synesisit.courseManagement.repository.CourseRepository;
import com.synesisit.courseManagement.repository.DepartmentRepository;
import com.synesisit.courseManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CourseRepository courseRepository;


    public Department save(Department departmentRequest) {
        return departmentRepository.save(departmentRequest);
    }

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    public Department getSingleDepartment(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    public List<Department> saveAllDepartment(List<Department> departmentRequestList) {
        return departmentRepository.saveAll(departmentRequestList);
    }

    public Department addStudentToDepartment(Long departmentId, Long studentId) {
        Department department = departmentRepository.findById(departmentId).get();
        Student student = studentRepository.findById(studentId).get();
        department.enrolledStudents(student);
        return departmentRepository.save(department);
    }

    // if need to add course from department
    public Department addCourseToDepartment(Long departmentId, Long courseId) {
        Department department = departmentRepository.findById(departmentId).get();
        Course course = courseRepository.findById(courseId).get();
        department.enrolledCourseList(course);
        return departmentRepository.save(department);
    }


}
