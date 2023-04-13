package com.example.blogex.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BlogController {

	@GetMapping({"/","index"})
	public String indexPage() {
		
		return "index";
	}
}
