package com.example.demo3.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.controller.dto.User;

// Ioc <- 스프링 컨테이너에 싱글톤 패턴으로 올라간다 - BEAN 객체
@RestController
@RequestMapping("/api")
public class ApiController {
	
	// 80 포트 번호는 주소창에서 생략 가능 합니다.
	// http://localhost:80/api/hello
	// http://localhost/api/hello
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	// MEME TYPE 타입 : text/plain 으로 응답 처리 해주세요.
	// http://localhost/api/text
	// 응답 결과 -> 응답 : text/plain
	// http://localhost/api/text
	@GetMapping("/text")
	public String text() {
		return "응답 : text/plain";
	}
	
	// response json 형식으로 내려주기
	// import가 잘못 연결 되어있으면 주소가 붙으니 컨트롤 + 알트 + o를 써주자.
	@PostMapping("/json")
	public User json (@RequestBody User user){
		System.out.println(user.toString());
		// 응답 Object type;
		return user;
		
	}
	// /api/put
	@PutMapping("/put")
	public ResponseEntity<User> put(@RequestBody User user){
		System.out.println(user.toString());
		// HTTP 메시지 코드 200 직접 세팅
		// HTTP 메시지 body에 데이터를 --> user.object
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(user); 
	}
	/*
	 * 백엔드 개발자 위치
	 * 클라이언트 (모바일) -> 요청(http 통신)
	 * 데이터로 반환 처리 (json 형식)
	 * 매번 새로운 요청 마다 다른 형식으로 리턴을 해주면 api 계속 개발
	 * 일괄적인 형식을 만들어서 던져 주면 api 개발 좋아한다.
	 * 
	 * 자바스크립트 ajax 통신 처리
	 * 
	 * */
	
	@PutMapping("/put2")
	public ResponseEntity<String> put2(@RequestBody User user){
		
		// 정상적인 값이 들어 왔는지 확인, 인증된 사용자 인지 확인
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		// 201 생성, 수정
		return new ResponseEntity<>(user.toString(), headers, HttpStatus.CREATED);
	}
	
	//문제
	// ResponseEntity 활용해서 응답을 내려보자
	@PutMapping("/put3")
	public ResponseEntity<String> put3(@RequestBody User user){
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		return new ResponseEntity<>(user.toString(), headers, HttpStatus.OK);
	}
	
}
