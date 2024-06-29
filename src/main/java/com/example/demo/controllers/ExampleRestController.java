package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EaxmpleService;

@RestController
public class ExampleRestController {
	@Autowired
	private EaxmpleService myService;

	@GetMapping("/")
	public void get() {
		 myService.createUser();
	}
	
}