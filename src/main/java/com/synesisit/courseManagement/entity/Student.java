package com.synesisit.courseManagement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private Long studentId;
    @Column(name = "student_name", nullable = false)
    private String studentName;

    @Column(name = "department_name", nullable = false)
    private Department departmentName;

    @Column(name = "course_list", nullable = false)
    private List<Course> courseList;


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
