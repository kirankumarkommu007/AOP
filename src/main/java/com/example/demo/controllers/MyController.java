package com.example.demo.controllers;

import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/task1")
    public String performTask1() {
        myService.performTask1();
        return "Task1 executed successfully";
    }

    @GetMapping("/task2")
    public String performTask2() {
        myService.performTask2();
        return "Task2 executed successfully";
    }

    @GetMapping("/taskWithException")
    public String performTaskWithException() {
        try {
            myService.performTaskWithException();
        } catch (Exception e) {
            return "Exception occurred: " + e.getMessage();
        }
        return "Task with exception executed successfully";
    }
}
