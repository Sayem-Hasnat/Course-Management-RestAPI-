package com.synesisit.courseManagement.controller;

import com.synesisit.courseManagement.entity.Student;
import com.synesisit.courseManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student studentRequest) {
        System.out.println("worked");
        studentService.addStudent(studentRequest);
        return studentRequest;
    }

    @PostMapping("/student/list")
    public List<Student> addStudentList(@RequestBody List<Student>  studentRequest) {
        studentService.addStudentList(studentRequest);
        return studentRequest;
    }

    @GetMapping("/student/list")
    public List<Student> getStudentAll(){
      return  studentService.getStudentAll();
    }

    @GetMapping("/student/{studentId}")
    public Student getSingleStudent(@PathVariable("studentId") Long studentId){
      return  studentService.getSingleStudent(studentId);
    }

    @PutMapping("/student/{studentId}")
    public Student updateStudent(@PathVariable("studentId") Long studentId,
                                 @RequestBody Student studentRequest){
        return  studentService.updateStudent(studentId,studentRequest);
    }

    @GetMapping("/student/{firstname}/{lastname}")
    public List<Student> findStudentByFirstNameLastName(@PathVariable("firstName") String firstName,
                                                        @PathVariable("lastName") String lastName){

        return studentService.findByFirstNameLastName(firstName,lastName);
    }



}
