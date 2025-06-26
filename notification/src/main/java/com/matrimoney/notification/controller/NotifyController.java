package com.matrimoney.notification.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotifyController {

	@GetMapping("")
	public String sendNotification() {
		
		return "Notification Sent Successfully";
	}
	
}
