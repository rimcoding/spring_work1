package com.example.ex2.controller;

import javax.validation.constraints.Pattern;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex2.dto.User;

@RestController
@Validated
public class UserController {

	@GetMapping("/user")
	public User user(@RequestParam String id, @Pattern(regexp = "[a-zA-Z1-9]{6,12}",message = "비밀번호는 영어와 숫자로 포함해서 6~12자리 이내로 입력해주세요.")@RequestParam String password) {
		
		User user = new User();
		user.setId(id);
		user.setPassword(password);
		
		return user;
		
	}
}
