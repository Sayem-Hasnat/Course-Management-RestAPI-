package com.synesisit.courseManagement.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentServiceAspect {

    @Before(value = "execution(* com.synesisit.courseManagement.service.StudentService.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("Hello From Aspect");

    }
}
