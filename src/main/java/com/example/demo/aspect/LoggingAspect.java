package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.example.demo.service.MyService.*(..))")
    private void serviceMethods() {}

    @Before("serviceMethods()")
    public void logBefore() {
        System.out.println("Before executing service method");
    }

    @After("serviceMethods()")
    public void logAfter() {
        System.out.println("After executing service method");
    }

    @AfterReturning("serviceMethods()")
    public void logAfterReturning() {
        System.out.println("After successfully executing service method");
    }

    @AfterThrowing("serviceMethods()")
    public void logAfterThrowing() {
        System.out.println("After throwing exception in service method");
    }

    @Around("serviceMethods()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around before executing service method");
        Object result;
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("Around after throwing exception in service method");
            throw throwable;
        }
        System.out.println("Around after successfully executing service method");
        return result;
    }
}

