package com.synesisit.courseManagement.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class StudentServiceAspect {

    Logger logger = LoggerFactory.getLogger(StudentServiceAspect.class);

    @Before(value = "execution(* com.synesisit.courseManagement.service.StudentService.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("Hello From Aspect");
        logger.info("Log Message from StudentServiceAspect");
        System.out.println("Before method:" + joinPoint.getSignature());
        logger.info("**** Staring - " + joinPoint.getSignature().getName());
        logger.info("**** With parameter - " + Arrays.toString(joinPoint.getArgs()));
    }
}
