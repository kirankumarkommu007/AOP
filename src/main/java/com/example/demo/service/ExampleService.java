package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExampleService {

    private List<String> users = new ArrayList<>();

    // Create a new user
    public void createUser(String username) {
        System.out.println("Before executing createUser");

        users.add(username);
        System.out.println("User created: " + username);

        System.out.println("After executing createUser");
    }

    // Delete an existing user
    public void deleteUser(String username) {
        System.out.println("Before executing deleteUser");

        if (users.remove(username)) {
            System.out.println("User deleted: " + username);
        } else {
            System.out.println("User not found: " + username);
        }

        System.out.println("After executing deleteUser");
    }

    // List all users (for testing purposes)
    public void listUsers() {
        System.out.println("Listing all users:");
        for (String user : users) {
            System.out.println("Username: " + user);
        }
    }
}
