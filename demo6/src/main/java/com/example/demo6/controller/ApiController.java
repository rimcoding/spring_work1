package com.example.demo6.controller;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo6.dto.User;

@RestController
@RequestMapping("/api")
@Validated // 하나씩 key=value 검사는 명시 해야 한다. 단 dto는 방식 예외(get 방식)
public class ApiController {
	
	@GetMapping("/test")
	public String test() {
		return "TEST ";
	}
	
	// 문제 유효성 검사 동작하도록 코드 변경 하시오.
	@GetMapping("/user")
	public User get(@NotNull @Min(2) @Max(10) @RequestParam String name, 
			@NotNull @Min(1) @Max(100) @RequestParam Integer age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		return user;
	}
	
	// 구분 : http body 데이터 전달 방식
	// 1. json 형식으로 넣어서 서버로 전달 (@RequestBody 선언 해야함)
	// 2. form 태그 활용해서 key=value 구조 (Query String) (@RequestBody 선언 x)
	@PostMapping("/user")
	public User post(@Validated @RequestBody User user) {
		System.out.println(user.toString());
		return user;
	}
	
	// 두번째 연습
	//application/x-www-form-urlencoded
	@GetMapping("/user2")
	public User get2(@Valid  User requser) {
		return requser;
	}
}
