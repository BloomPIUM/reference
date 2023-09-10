package com.springboot.demo4.data.dao;

import com.springboot.demo4.data.entity.Board;

public interface BoardDao {
    Board insertBoard(Board board);

    Board  selectBoard(Long number);

    Board updateBoard(Long number, String content) throws Exception;

    void deleteBoard(Long number) throws Exception;
}
