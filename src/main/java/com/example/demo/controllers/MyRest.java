package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;
import com.example.demo.service.MyService2;

@RestController
public class MyRest {
	@Autowired
	private MyService myService;
	
	@Autowired
	private MyService2  myService2;

	@GetMapping("/1")
	public String get() {
		return myService.performTask1();
	}
	
	@GetMapping("/2")
	public String get2() {
		return myService.performTask2();
	}
	
	
	@GetMapping("/A")
	public String getA() {
		return myService2.performTaskA();
	}
	
	@GetMapping("/B")
	public String getB() {
		return myService2.performTaskB();
	}
	
}
