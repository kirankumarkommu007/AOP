package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Pointcut for all methods in OrderService
    @Pointcut("execution(* com.example.demo.service.OrderService.*(..))")
    private void orderServiceMethods() {}

    // Pointcut for a specific method in PaymentService
    @Pointcut("execution(* com.example.demo.service.PaymentService.processPayment(..))")
    private void paymentServiceProcessPayment() {}

    // Pointcut for all methods in NotificationService
    @Pointcut("execution(* com.example.demo.service.NotificationService.*(..))")
    private void notificationServiceMethods() {}

    @Before("orderServiceMethods()")
    public void logBeforeOrderService() {
        System.out.println("Before executing OrderService method");
    }

    @Before("paymentServiceProcessPayment()")
    public void logBeforePaymentService() {
        System.out.println("Before executing PaymentService processPayment");
    }

    @Before("notificationServiceMethods()")
    public void logBeforeNotificationService() {
        System.out.println("Before executing NotificationService method");
    }
}
