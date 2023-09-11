package com.board.exercisematching.data.dao.impl;

import com.board.exercisematching.data.dao.BoardDAO;
import com.board.exercisematching.data.entity.Board;
import com.board.exercisematching.data.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardDAOImpl implements BoardDAO {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardDAOImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Board insertBoard(Board board) {
        Board SavedBoard = boardRepository.save(board);
        return null;
    }

    @Override
    public Board selectBoard(Long number) {
        return null;
    }

    @Override
    public Board updateBoardName(Long number, String name) throws Exception {
        return null;
    }

    @Override
    public void deleteBoard(Long number) throws Exception {

    }


}
