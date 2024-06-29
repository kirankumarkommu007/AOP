package com.example.demo.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    // Define the pointcut for all methods in the service package
    @Pointcut("execution(* com.example.demo.service.*.*(..))")
    public void serviceMethods() {}

    @Before("serviceMethods()")
    public void logBefore() {
        logger.info("Executing method...");
    }

    @AfterReturning(pointcut = "serviceMethods()", returning = "result")
    public void logAfterReturning(Object result) {
        logger.info("Method execution successful. Result: " + result);
    }
}
