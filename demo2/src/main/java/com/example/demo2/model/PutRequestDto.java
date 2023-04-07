package com.example.demo2.model;

import java.util.List;

import lombok.Data;

@Data
public class PutRequestDto {
	
	private String name;
	private String age;
	
	private List<CarDto> carList;
}
