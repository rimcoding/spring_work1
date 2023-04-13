package com.example.blogex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

	@GetMapping({"/","index"})
	public String indexPage() {
		
		return "index";
	}
	@GetMapping({"NewFile"})
	public String NewFile() {
		
		return "NewFile";
	}
}
