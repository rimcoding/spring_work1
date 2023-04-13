package com.example.demo8.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*
 * 
 * 1. WebMvcConfigurer 구현 처리 하기
 * 2. addInterceptors 를 구현 해야 한다.
 * 
 * */

@Configuration	// 1개 이상 빈으로 등록 해야 할 때
public class WebMvcConfig implements WebMvcConfigurer {

	
	//DI를 사용하는 코드로 변경 해 보자.
	@Autowired
	private LoggingInterceptor loggingInterceptor;
	
//	public WebMvcConfig(LoggingInterceptor loggingInterceptor) {
//		this.loggingInterceptor = loggingInterceptor;
//	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 우리가 직접 만든 인터셉터 구현클래스를 등록 처리 합니다.
		registry.addInterceptor(loggingInterceptor);
	}
	
}
