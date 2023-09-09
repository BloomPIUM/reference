package com.helchang.exercise_matching.service;

import com.helchang.exercise_matching.data.dto.BoardDto;
import com.helchang.exercise_matching.data.dto.BoardResponseDto;

public interface BoardService {

    BoardResponseDto getBoard(Long number);

    BoardResponseDto saveBoard(BoardDto boardDto);

    BoardResponseDto modifyBoard(Long number, String title, String content) throws Exception;

    void deleteBoard(Long number) throws Exception;

}
