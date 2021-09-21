package com.synesisit.courseManagement.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Department")
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id", nullable = false)
    private Long departmentId;
    @Column(name = "department_name", nullable = false)
    private String departmentName;
    @Column(name = "department_code", nullable = false)
    private String departmentCode;

    // Entity Relations



}
