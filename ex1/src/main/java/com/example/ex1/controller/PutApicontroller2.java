package com.example.ex1.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex1.model.UserDto;

@RestController
@RequestMapping("/api2")
public class PutApicontroller2 {

	@PutMapping("/putput1")
	public UserDto put(@RequestBody UserDto dto) {
		System.out.println("dto : " + dto);
		return dto;
	}
}
