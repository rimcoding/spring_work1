package com.example.ex1.model;

import java.util.List;

import lombok.Data;

@Data
public class ReplyDto {

	private String nickname;
	private String content;
	private List<RereplyDto> rereplyList;
}
