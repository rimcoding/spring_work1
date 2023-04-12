package com.example.demo5_1.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Animal {

	@NotNull(message = "값을 넣어주세요")
	private String name;
	private String type;
	@Min(1)
	@Max(20)
	private int age;
}
