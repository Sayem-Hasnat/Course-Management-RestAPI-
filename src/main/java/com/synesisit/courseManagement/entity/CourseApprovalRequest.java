package com.synesisit.courseManagement.entity;



import javax.persistence.*;

@Entity(name = "Approval_Form")

public class CourseApprovalRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Course_Request")
    @SequenceGenerator(name = "Course_Request", sequenceName = "Course_Approval", allocationSize = 1)
    @Column(name = "approval_id", nullable = false)
    private Long approvalId;
    @Column(name = "student_Id", nullable = false)
    private Long studentId;
    @Column(name = "course_id", nullable = false)
    private Long courseId; // want by course name by using criteria query
    @Column(name = "Approval_Status", nullable = false)
    private Boolean isApprove = false;

    public Long getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Boolean getApprove() {
        return isApprove;
    }

    public void setApprove(Boolean approve) {
        isApprove = approve;
    }
}
