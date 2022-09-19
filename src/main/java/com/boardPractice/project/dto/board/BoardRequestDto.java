package com.boardPractice.project.dto.board;

import com.boardPractice.project.entity.board.Board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//게시판 요정 데이터를 담당
public class BoardRequestDto {
	private Long id;
	private String title;
	private String content;
	private String registerId;
	
	public Board toEntity() {
		return Board.builder()
				.title(title)
				.content(content)
				.registerId(registerId)
				.build();
	}
	
}
