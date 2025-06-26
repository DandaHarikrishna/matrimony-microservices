package com.matrimony.matching.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/match")
public class MatchingController {
	
	@GetMapping("")
	public String getMatching() {
		
		return "Thanks for calling Matching Service";
	}

}
