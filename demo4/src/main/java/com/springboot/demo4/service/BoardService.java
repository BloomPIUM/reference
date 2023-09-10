package com.springboot.demo4.service;

import com.springboot.demo4.data.dto.BoardDto;
import com.springboot.demo4.data.dto.BoardResponseDto;

public interface BoardService {
    BoardResponseDto getBoard(Long number);
    BoardResponseDto saveBoard(BoardDto boarDto);
    BoardResponseDto changeBoardName(Long number, String content) throws Exception;

    void deleteBoard(Long number) throws Exception;
}
