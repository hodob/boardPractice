package com.boardPractice.project.entity.board;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.boardPractice.project.dto.board.BoardRequestDto;

public interface BoardRepository  extends JpaRepository<Board, Long>{

	String UPDATE_BOARD = "UPDATE Board " +
	"SET TITLE = :#{#boardRequestDto.title}, CONTENT = :#{#boardRequestDto.content}, UPDATE_TIME = NOW() WHERE ID = :#{#boardRequestDto.id}" ;
	
	@Transactional
	@Modifying
	@Query(value = UPDATE_BOARD, nativeQuery = true)
	public int updateBoard(@Param("boardRequestDto") BoardRequestDto boardRequestDto);
	
	
}
