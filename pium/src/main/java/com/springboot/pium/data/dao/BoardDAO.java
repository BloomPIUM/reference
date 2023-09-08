package com.springboot.pium.data.dao;

import com.springboot.pium.data.entity.Board;

public interface BoardDAO {
    Board insertBoard(Board board);

    Board selectBoard(Integer board_id);

    Board updateBoardTitle(Integer board_id, String title) throws Exception;

    Board updateBoardContent(Integer board_id, String content) throws Exception;

    void deleteBoard(Integer board_id) throws Exception;
}
