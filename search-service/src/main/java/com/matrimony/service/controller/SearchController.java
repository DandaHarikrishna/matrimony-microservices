package com.matrimony.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	@GetMapping("")
	public String searchProfiles() {
		
		return "Welcome to Search Service";
	}

}
