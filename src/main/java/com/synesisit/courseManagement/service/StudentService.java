package com.synesisit.courseManagement.service;

import com.synesisit.courseManagement.entity.Student;
import com.synesisit.courseManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student studentRequest) {
        return studentRepository.save(studentRequest);
    }

    public List<Student> getStudentAll() {
        return studentRepository.findAll();
    }

    public Student getSingleStudent(Long studentId) {
        Student student = studentRepository.findById(studentId).get();
        if (student.isExist() == true) {
            return studentRepository.save(student);
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

    public List<Student> addStudentList(List<Student> studentRequest) {
        return studentRepository.saveAll(studentRequest);
    }

    public List<Student> findByFirstNameLastName(String firstName, String lastName) {
        List<Student> studentByFirstNameLastName = studentRepository.findStudentByStudentFirstNameAndStudentLastName(firstName, lastName);
        return studentByFirstNameLastName;
    }


}
