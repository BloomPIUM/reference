package com.board.exercisematching.service;


import com.board.exercisematching.data.dto.BoardDto;
import com.board.exercisematching.data.dto.BoardResponseDto;

public interface BoardService {

    BoardResponseDto getBoard(Long number);

    BoardResponseDto saveBoard(BoardDto boardDto);

    BoardResponseDto modifyBoard(Long number, String title, String content) throws Exception;

    void deleteBoard(Long number) throws Exception;

}