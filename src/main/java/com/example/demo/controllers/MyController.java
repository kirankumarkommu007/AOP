package com.example.demo.controllers;

import com.example.demo.service.OrderService;
import com.example.demo.service.PaymentService;
import com.example.demo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	@Autowired
	private OrderService orderService;

	@Autowired
	private PaymentService paymentService;

	@Autowired
	private NotificationService notificationService;

	@GetMapping("/order")
	public String placeOrder() {
		orderService.placeOrder("123");
		return "Order placed successfully";
	}

	@GetMapping("/payment")
	public String processPayment() {
		paymentService.processPayment("456");
		return "Payment processed successfully";
	}

	@GetMapping("/notification")
	public String sendNotification() {
		notificationService.sendNotification("789");
		return "Notification sent successfully";
	}
}
