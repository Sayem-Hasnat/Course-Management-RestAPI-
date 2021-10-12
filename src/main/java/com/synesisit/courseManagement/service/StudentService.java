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
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    public Student addStudent(Student studentRequest) {
        return studentRepository.save(studentRequest);


    }

    public List<Student> addStudentList(List<Student> studentRequest) {
        return studentRepository.saveAll(studentRequest);
    }

    public List<Student> getStudentAll() {
        return studentRepository.findAll();
    }

    public Student getSingleStudent(Long studentId) {
        //  studentRepository.findById(studentId).get();
        Student student = null;

        if (studentRepository.findById(studentId).get().isExist() == true) {
            student = studentRepository.findById(studentId).get();
        } else {
            System.out.println("This Id Is not Active or doesn't Exist");
        }
        return student;
    }

    public Student updateStudent(Long studentId, Student studentRequest) {

        Student student = studentRepository.getById(studentId);
        student.setStudentFirstName(studentRequest.getStudentFirstName());
        student.setStudentLastName(studentRequest.getStudentLastName());

        student.setDepartment(studentRequest.getDepartment());
        student.setCourseList(studentRequest.getCourseList());

        return studentRepository.save(student);
    }


<<<<<<< HEAD
    // Service for Criteria API

    public List<Student> findByFirstNameLastName(String firstName, String lastName) {
        List<Student> studentByFirstNameLastName = studentRepository.findStudentByStudentFirstNameAndStudentLastName(firstName, lastName);
        return studentByFirstNameLastName;
=======
    public List<Student> findByFirstNameLastName(String studentFirstName,String studentLastName) {
        return studentRepository.findStudentByStudentFirstNameAndStudentLastName(studentFirstName, studentLastName);
>>>>>>> office
    }


    public Student addDepartmentToStudent(Long studentId, Long departmentId) {
        Student student = studentRepository.findById(studentId).get();
        Department department = departmentRepository.findById(departmentId).get();
        student.setDepartment(department);
        department.enrolledStudents(student);
        departmentRepository.save(department);
        return studentRepository.save(student);

    }
}

