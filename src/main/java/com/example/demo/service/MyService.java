package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {



	    public void createUser() {
	        System.out.println("Before executing createUser");
	        // Logic to create user
	        System.out.println("After executing createUser");
	    }

	    public void deleteUser() {
	        System.out.println("Before executing deleteUser");
	        // Logic to delete user
	        System.out.println("After executing deleteUser");
	    }
	

}
