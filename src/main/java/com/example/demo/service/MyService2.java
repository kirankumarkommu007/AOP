package com.example.demo.service;


import org.springframework.stereotype.Service;

@Service
public class MyService2 {

    public String performTaskA() {
		System.out.println("A");
       return "Executing performTaskA";
    }

    public String performTaskB() {
		System.out.println("B");
        return "Executing performTaskB";
     }
}
