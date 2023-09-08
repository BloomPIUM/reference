package com.example.gohome.data.dao;

import com.example.gohome.data.entity.Board;

public interface BoardDAO {

    Board insertBoard(Board board);

    Board selectBoard(Long board_id);

    Board updateBoardName(Long board_id, String title) throws Exception;

    void deleteBoard(Long board_id) throws Exception;

}
