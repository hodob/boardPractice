package com.boardPractice.project.dto.board;

import java.time.LocalDateTime;

import com.boardPractice.project.entity.board.Board;

import lombok.Getter;
//게시판 목록,상세조회에 필요한 필드를 정의 board Entity를 지금 클래시에 맞게 변환하는 생성자 생성
@Getter
public class BoardResponseDto {
	private Long id;
	private String title;
	private String content;
	private int readCnt;
	private String registerId;
	private LocalDateTime registerTime;
	
	
	public BoardResponseDto(Board entity) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.readCnt = readCnt;
		this.registerId = registerId;
		this.registerTime = registerTime;
	}


	@Override
	public String toString() {
		return "BoardResponseDto [id=" + id + ", title=" + title + ", content=" + content + ", readCnt=" + readCnt
				+ ", registerId=" + registerId + ", registerTime=" + registerTime + "]";
	}
	
}
