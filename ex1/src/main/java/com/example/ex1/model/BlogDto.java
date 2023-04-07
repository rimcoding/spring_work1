package com.example.ex1.model;

import java.util.List;

import lombok.Data;

@Data
public class BlogDto {

	private String title;
	private String content;
	private List<ReplyDto> replyList;
	
}
