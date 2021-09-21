package com.synesisit.courseManagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "User_Details")
@Getter
@Setter
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_pass", nullable = false)
    private String userPass;

    @Column(name = "user_mail", nullable = false)
    private String userMail;

    
}
