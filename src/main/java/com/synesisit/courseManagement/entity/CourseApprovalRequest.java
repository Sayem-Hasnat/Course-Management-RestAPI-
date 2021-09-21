package com.synesisit.courseManagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Approval_Form")
@Getter
@Setter
public class CourseApprovalRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Course_Request")
    @SequenceGenerator(name = "Course_Request", sequenceName = "Course_Approval", allocationSize = 1)
    @Column(name = "approval_id", nullable = false)
    private Long approvalId;
    @Column(name = "student_Id", nullable = false)
    private Long studentId;
    @Column(name = "course_id", nullable = false)
    private Long courseId;
    @Column(name = "Approval_Status", nullable = false)
    private Boolean isApprove = false;


}
