package com.example.demo10.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo10.dto.User;

@Controller
public class UserController {
	
	@GetMapping("/loginPage")
	public String LoginPage() {
		
		return "login.html";	// 내부에서 이동
		
	}
	@PostMapping("/login-proc")
	public String loginProc(HttpServletRequest request,HttpServletResponse response,User user) {
		
		HttpSession session = request.getSession();
		session.setAttribute("princiapal", user);
		return "redirect:/auth/infoPage";	
	}
	/*
	 * 인증된 사용자만 들어 올 수 있게 막을 예정
	 * AuthInterceptory 동작 시킬려면 주소 설계를 /auth/**
	 * */
	@GetMapping("/auth/infoPage")
	public String infoPage(HttpServletRequest request) {
		// 테스트
		//todo
		// 1. 아래 부분 삭제 예정
		// 2. 인터셉터가 동작 하도록 주소 변경 예정
		
		
//		HttpSession session = request.getSession();
//		Object principal = session.getAttribute("principal");
//		if (principal == null) {
//			return "redirect:/loginpage";
//		}
		System.out.println("컨트롤러!!");
		// 상대 위치 들어왔으면 현재 그 시점에서 맞게 설계 해야한다.
		// 위치에서 상대 경로로 찾을지 절대 경로로 찾을지 결정
		// 시점이 /auth/infoPage 예의 입장에서 찾으면 같은 라인에서 찾으면 auth 폴더안에 있는애를 찾으면 상대경로인데
		// 밖에 있어서 절대경로로 해줘야 했음
		
		// --> http://localhost:8080/info.html URL 컨트롤러를 안거친다.
		// --> http://localhost:8080/auth/info URI
		// redirect <-- 어디까지 갔다 오냐면 (브라우저로 돌아 갔다 옴)
		// 새로운 request 와 response 객체가 만들어 진다.
		return "redirect:/auth/info.html";
	}

}
