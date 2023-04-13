package com.example.ex3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

	@GetMapping("/hello")
	public String hello() {
		System.out.println("Controller 에서 메서드 실행");
		return "hello";
	}
}
