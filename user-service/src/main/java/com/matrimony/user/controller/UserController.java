package com.matrimony.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user")
	public String regUser() {

		return "Registration Successfull Buddy";
	}

}
