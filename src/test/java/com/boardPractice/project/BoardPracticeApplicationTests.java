package com.boardPractice.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boardPractice.project.dto.board.BoardRequestDto;
import com.boardPractice.project.service.board.BoardService;

@SpringBootTest
class BoardPracticeApplicationTests {

	@Autowired
	private BoardService boardService;
	
	
	@Test
	void contextLoads() {

	}
	void save() {
		BoardRequestDto boardsaveDto = new BoardRequestDto();
		
		boardsaveDto.setTitle("제목입니다.");
		boardsaveDto.setContent("내용입니다.");

		
		
		
		
	}
	
	
	

}
