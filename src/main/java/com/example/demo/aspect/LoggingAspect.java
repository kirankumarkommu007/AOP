package com.example.demo.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Before("execution(* com.example.demo.service.*.*(..))")
    public void logBefore() {
        logger.info("Executing method...");
    }

    @AfterReturning(pointcut = "execution(* com.example.demo.service.*.*(..))", returning = "result")
    public void logAfterReturning(Object result) {
        logger.info("Method execution successful. Result: " + result);
    }

//    // within
//    @Before("within(com.example.demo.service.*)")
//    public void logWithin() {
//        logger.info("Within service package...");
//    }
//
//    // this
//    @Before("this(com.example.demo.service.UserService)")
//    public void logThis() {
//        logger.info("Proxy is UserService instance...");
//    }
//
//    // target
//    @Before("target(com.example.demo.service.UserService)")
//    public void logTarget() {
//        logger.info("Target object is UserService instance...");
//    }
//
//    // args
//    @Before("args(java.lang.String, ..)")
//    public void logArgs() {
//        logger.info("Method with String argument...");
//    }
//
//    // @annotation
//    @Before("@annotation(org.springframework.transaction.annotation.Transactional)")
//    public void logAnnotation() {
//        logger.info("@Transactional method...");
//    }
//
//    // @within
//    @Before("@within(org.springframework.stereotype.Service)")
//    public void logAtWithin() {
//        logger.info("Within @Service class...");
//    }
//
//    // @target
//    @Before("@target(org.springframework.stereotype.Service)")
//    public void logAtTarget() {
//        logger.info("Target object within @Service class...");
//    }
//
//    // @args
//    @Before("@args(com.example.demo.annotation.Validated)")
//    public void logAtArgs() {
//        logger.info("Method with @Validated argument...");
//    }
}
