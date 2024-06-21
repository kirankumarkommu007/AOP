package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String processData(String input) {
        // Simulate some business logic
        return "Processed: " + input;
    }
}
