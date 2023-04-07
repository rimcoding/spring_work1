package com.example.ex1.model;

import java.util.List;

import lombok.Data;

@Data
public class UserDto {

	private String email;
	private String password;
	private List<BlogDto> blogList;
	private List<ShopingDto> shopingList;
	private List<tubeDto> tubeList;
}
