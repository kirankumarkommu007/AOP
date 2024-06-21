package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(String notificationId) {
        System.out.println("Notification sent: " + notificationId);
    }
}
