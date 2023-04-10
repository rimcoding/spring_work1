package com.example.demo4.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect	// Aop 라이브러리를 넣어줘서 쓸수 있게된 녀석
@Component 	// Ioc 관리 대상이 된다. (싱글톤으로 올라감)
public class AopParameter {
	
	// 포인트 컷
	// role 설정
	//execution 표현식
	// *.*(..)) 모든클래스와 모든 메서드를 지켜보겠다.
	// 앞의 별표 모든 프라이벗을 다 쓰겠다.
	@Pointcut("execution(* com.example.demo4.controller..*.*(..))")
	private void cut() {}
	
	// cut() 메서드가 실행 되는 지점 이전에 before() 메서드를 실행
	// execution 가 지켜보고 있어서 메서드가 실행이 되기전에 befor를 실행시켜라
	@Before("cut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("before 수행!!!!");
		
		// 활용 - 어떤 메서드가 동작 되었는지 확인
		MethodSignature methodSignature 
		= (MethodSignature) joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		
		Object[] args = joinPoint.getArgs();
		
		// 매개 변수 출력
		for (Object obj : args) {
			System.out.println("type : " + obj.getClass().getSimpleName());
			System.out.println("value : " + obj);
		}
	
		
//		System.out.println("사용된 method 확인 ");
//		System.out.println("method : " + method.getName());
		// controller -> /api/get 호출 하기전에 수행 되는 녀석
		// 어떤 메서드가 수행 되었는지 알아 보는 방법
		
	}
	
	@AfterReturning(value = "cut()", returning = "obj" )
	public void afterReturn(JoinPoint joinPoint, Object obj) {
		System.out.println("=================");
		System.out.println("return obj");
		System.out.println("obj " + obj);
	}
	
}
