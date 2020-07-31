package com.wipro.unittesting.unittesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
	
	@GetMapping("/hello-world")
	public String helloWord() {
		
		return "Hello World";
	}
}