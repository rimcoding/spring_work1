package com.example.demo5.controller;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5.dto.User;

@RestController
@Validated // GET 방식일 때 반드시 선언 해주어야 유효성 검사를 시작 한다.
public class UserController {

	// GET 방식일 때 파라미터 앞에 어떤 유효성 검사를 할 지
	// 당연히 지정해 주어야 한다.
	
	
	//http://localhost:8080/user?name=홍&age=1
	//GET 방식일 때 valid 처리
	
	@GetMapping("/user")
	public User user(@Size(min = 2) @RequestParam String name,
			@NotNull @Min(1) @RequestParam Integer age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		return user;
	}
	// 문제 GET 유효성 검사 직접 만들어 보기
	
	//http://localhost:8080/user2?name=홍아&age=25&email=a@naver.com
	@GetMapping("/user2")
	public User user2(@NotNull @Size(min = 2,max = 10) @RequestParam String name,
			@NotNull @Min(1) @Max(100) @RequestParam Integer age,
			@NotNull @Email @RequestParam String email) {
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setEmail(email);
		return user;
	}
	
	@GetMapping("/user3")
	// object mapper 통해서 파싱 처리 하고 싶다면
	public User user3(@Validated User user) {
		return user;
	}
}
