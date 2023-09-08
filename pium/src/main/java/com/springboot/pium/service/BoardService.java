package com.springboot.pium.service;

import com.springboot.pium.data.dto.BoardDto;
import com.springboot.pium.data.dto.BoardResponseDto;

public interface BoardService {

    BoardResponseDto getBoard(Integer board_id);

    BoardResponseDto saveBoard(BoardDto boardDto);

    BoardResponseDto changeBoardTitle(Integer board_id, String title) throws Exception;

    BoardResponseDto changeBoardContent(Integer board_id, String content) throws Exception;

    void deleteBoard(Integer board_id) throws Exception;

}
