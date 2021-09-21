package com.synesisit.courseManagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Course {
    @Id
    @Column(name = "course_id", nullable = false)
    private Long courseId;
    @Column(name = "course_name", nullable = false)
    private String courseName;
    @Column(name = "course_code", nullable = false)
    private String courseCode;
    @Column(name = "course_credit", nullable = false)
    private double courseCredit;


}
