package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

// 기본생성자
@NoArgsConstructor

// 모든생성자
@AllArgsConstructor
public class PostReqDto {
	private String name;
	private String email;
	private int age;
	private int hobby;
	//@JsonProperty("phone_number")
	private String phoneNumber;
	
}
