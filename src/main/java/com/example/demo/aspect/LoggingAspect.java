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
    private void myserviceMethods() {}
    
    @Pointcut("execution(* com.example.demo.service.MyService2.performTaskB(..))")
    private void myservice2Methods() {}
    

    @Before("myserviceMethods()")
    public void logBeforeServiceMethods() {
        System.out.println("Before executing service method");
    }


    @Before("myservice2Methods()")
    public void logBeforeServiceMethods2() {
        System.out.println("Before executing 2nd service method");
    }
    
    @AfterReturning("myserviceMethods()")
    public void logAfterServiceMethods() {
        System.out.println("After executing service method");
    }
    
    @AfterReturning("myservice2Methods()")
    public void logAfterServiceMethods2() {
        System.out.println("After executing 2nd service method");
    }
}
