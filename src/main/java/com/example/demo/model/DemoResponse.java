package com.example.demo.model;


public class DemoResponse {

    private String message;

    public DemoResponse() {
    }

    public DemoResponse(String message) {
        this.message = message;
    }

    // Getter and Setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
