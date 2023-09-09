package com.springboot.pium.service;

import com.springboot.pium.data.dto.BoardDto;
import com.springboot.pium.data.dto.BoardResponseDto;

public interface BoardService {

    BoardResponseDto getBoard(Long board_id);

    BoardResponseDto saveBoard(BoardDto boardDto);

    BoardResponseDto modifyBoard(Long board_id, String title, String content) throws Exception;


    void deleteBoard(Long board_id) throws Exception;

}
