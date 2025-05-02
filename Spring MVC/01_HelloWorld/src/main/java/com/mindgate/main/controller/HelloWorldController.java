package com.mindgate.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	public HelloWorldController() {
		System.out.println("HelloWorldController default constructor");
	}

	@GetMapping("home")
	public String showHomePage() {
		System.out.println("showHomePage() called");
		return "index";
	}
	
	

}
