package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ExampleService;

@RestController
public class ExampleRestController {
	@Autowired
	private ExampleService myService;

	@GetMapping("/")
	public void get() {
		 myService.createUser(null);
	}
	
}
