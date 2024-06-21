package com.example.demo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.example.demo.service.MyService.*(..))")
    private void serviceMethods() {}

    @Before("serviceMethods()")
    public void logBeforeServiceMethods() {
        System.out.println("Before executing service method");
    }

    @AfterReturning("serviceMethods()")
    public void logAfterServiceMethods() {
        System.out.println("After executing service method");
    }
}
