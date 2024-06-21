package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    
    public void performTask1() {
        System.out.println("Executing performTask1");
    }

    public void performTask2() {
        System.out.println("Executing performTask2");
    }

    public void performTaskWithException() throws Exception {
        System.out.println("Executing performTaskWithException");
        throw new Exception("Exception in performTaskWithException");
    }
}
