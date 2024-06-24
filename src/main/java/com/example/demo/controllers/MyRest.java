package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;

@RestController
public class MyRest {
	@Autowired
	private MyService myService;

	@GetMapping("/")
	public void get() {
		 myService.createUser();
	}
	
}
