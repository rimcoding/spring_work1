package com.example.demo6.handler;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo6.dto.CustomError;

@RestControllerAdvice // Ioc 대상이 된다.(스프링 컨테이너에 들어가고 싱글톤 패턴이 만들어진다)
@ControllerAdvice
public class GlobalControllerAdvice {

	// 모든 예외를 여기서 처리 하고 싶다면
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<?> exception(Exception e){
		
		System.out.println("===============");
		System.out.println(e.getClass());
		System.out.println(e.getMessage());
		System.out.println("=================");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
	}
	
	// 특정 예외를 잡아서 다르게 응답 처리 하고 싶다면 !!!
	// 오버라이드랑 비슷한 개념
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException e){
		
		// StringBuilder 사용 했었음 !
		// 데이터 가공해서 적절하게 응답 만들어
		
			
			List<CustomError> errorList = new ArrayList<>();
			e.getAllErrors().forEach(error ->{
				System.out.println(error.getCode());
				System.out.println(error.getDefaultMessage());
				String field = error.getCode();
				String message = error.getDefaultMessage();
				CustomError customError = new CustomError();
				customError.setField(field);
				customError.setMessage(message);
				errorList.add(customError);
			});;
			
		
		// 디버깅
		// 필드가 잘못 되엇는지
		// 메세지
		// String 값으로 재 정의해서 응답 처리 해주세요.
			
		System.out.println("잘못된 값을 나에게 전달 했어");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorList);
	}
	
	@ExceptionHandler(value = HttpMessageNotReadableException.class)
	public ResponseEntity<?> httpMessageNotReadableException(HttpMessageNotReadableException e){
		System.out.println("잘못된 형식 : 제이슨 문법 아직도 모르니?");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}
	@ExceptionHandler(value = BindException.class)
	public ResponseEntity<?> bindException(BindException e){
		System.out.println("GET 방식으로 값을 던질 때 잘못 보냈네!!");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}
	
	
}
