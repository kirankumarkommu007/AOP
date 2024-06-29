package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExampleService {

	
	public String createUser() {
		return "Created user";
	}
	
	
	public String deleteUser() {
		return "Deleted user";
	}
}
