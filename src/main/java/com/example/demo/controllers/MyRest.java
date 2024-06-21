package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;

@RestController
public class MyRest {
	@Autowired
	private MyService myService;

	@GetMapping("/1")
	public String get() {
		return myService.performTask1();
	}
	
	@GetMapping("/2")
	public String get2() {
		System.out.println("2");
		return myService.performTask2();
	}
	
	
}
