package com.example.demo10.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

//AuthInterceptor는 request 요청이 앞에 /auth/**로 요청한
// 주소에서만 동작 하도록 설계 할 예정
@Component	// Ioc 처리 확인
public class AuthInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Auth인터셉터 거쳐서 간다!!!");
		//세션 여부 확인
		HttpSession session = request.getSession();
		Object principal = session.getAttribute("princiapal");
		if (principal == null) {
			System.out.println("인증 안된 사용자");
			response.sendRedirect("/loginPage");
			return false;
		}
		return true;
	}
}
