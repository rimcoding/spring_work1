package com.example.greenblog.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

	
	
	@GetMapping({"/","index"})
	public String indexPage() {
		
		return "index";
	}
}
