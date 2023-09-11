package com.board.exercisematching.data.dao;

import com.board.exercisematching.data.entity.Board;

public interface BoardDAO {

    Board insertBoard(Board board);

    Board selectBoard(Long number);

    Board updateBoardName(Long number, String name) throws Exception;

    void deleteBoard(Long number) throws Exception;

}
