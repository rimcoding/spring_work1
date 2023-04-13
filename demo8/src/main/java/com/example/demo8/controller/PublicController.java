package com.example.demo8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Ioc 대상
@Controller
public class PublicController {

	// http://localhost:8080/hello
	@GetMapping("/hello")
	public String hello() {
		System.out.println("Controller 에서 메서드 실행");
		return "hello";
	}
}
