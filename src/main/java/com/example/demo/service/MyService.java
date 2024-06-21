package com.example.demo.service;


import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String performTask1() {
		System.out.println("1");
       return "Executing performTask1";
    }

    public String performTask2() {
		System.out.println("2");
        return "Executing performTask2";
     }
}
