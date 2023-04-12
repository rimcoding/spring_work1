package com.example.demo5_1.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5_1.dto.Animal;

@RestController
@RequestMapping("/api")
public class Apicontroller {
	
	@PostMapping("/animal")
	public ResponseEntity<?> animal(@Valid @RequestBody Animal animal,
			BindingResult bindingResult){
		
		if (bindingResult.hasErrors()) {
			
			StringBuilder sb = new StringBuilder();
			
			bindingResult.getAllErrors().forEach(error ->{
				
				sb.append("field : " + error.getCode());
				sb.append("\n");
				sb.append("message : " + error.getDefaultMessage());
				sb.append("\n");
			});
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
					
		}
		
		return ResponseEntity.ok(animal);
	}
}
