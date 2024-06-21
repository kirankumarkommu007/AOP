package com.example.demo.controllers;

import com.example.demo.model.DemoResponse;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/process/{input}")
    public DemoResponse processInput(@PathVariable String input) {
        String result = demoService.processData(input);
        return new DemoResponse(result);
    }
}
