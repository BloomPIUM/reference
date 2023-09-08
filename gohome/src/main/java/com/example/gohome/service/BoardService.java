package com.example.gohome.service;

import com.example.gohome.data.dto.BoardDto;
import com.example.gohome.data.dto.BoardResponseDto;

public interface BoardService {

    BoardResponseDto getBoard(Long board_id);

    BoardResponseDto saveBoard(BoardDto boardDto);

    BoardResponseDto changeBoardName(Long board_id, String title) throws Exception;

    void deleteBoard(Long board_id) throws Exception;

}
