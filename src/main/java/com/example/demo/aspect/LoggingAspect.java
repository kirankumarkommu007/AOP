package com.example.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Pointcut("execution(* com.example.demo.service.UserService.*(..))")
    public void userServiceMethods() {}

    @Before("userServiceMethods()")
    public void beforeTransaction() {
        logger.info("Starting transaction");
    }

    @After("userServiceMethods()")
    public void afterTransaction() {
        logger.info("Committing transaction");
    }

    @AfterThrowing("userServiceMethods()")
    public void afterTransactionFailure() {
        logger.severe("Transaction failed, rolling back");
    }
}
