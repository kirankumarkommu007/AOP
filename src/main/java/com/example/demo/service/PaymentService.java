package com.example.demo.service;


import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void processPayment(String paymentId) {
        System.out.println("Payment processed: " + paymentId);
    }
}
