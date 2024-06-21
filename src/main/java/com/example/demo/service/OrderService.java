package com.example.demo.service;



import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void placeOrder(String orderId) {
        System.out.println("Order placed: " + orderId);
    }
}
