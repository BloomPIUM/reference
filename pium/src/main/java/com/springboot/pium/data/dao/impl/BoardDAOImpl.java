package com.springboot.pium.data.dao.impl;

import com.springboot.pium.data.dao.BoardDAO;
import com.springboot.pium.data.entity.Board;
import com.springboot.pium.data.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class BoardDAOImpl implements BoardDAO {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardDAOImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Board insertBoard(Board board) {
        Board savedBoard = boardRepository.save(board);

        return savedBoard;
    }

    @Override
    public Board selectBoard(Integer board_id) {
        Board selectedBoard = boardRepository.getById(board_id);

        return selectedBoard;
    }

    @Override
    public Board updateBoardTitle(Integer board_id, String title) throws Exception {
        Optional<Board> selectedBoard = boardRepository.findById(board_id);

        Board updatedBoard;
        if (selectedBoard.isPresent()) {
            Board board = selectedBoard.get();

            board.setTitle(title);
            board.setModified_date(LocalDateTime.now());

            updatedBoard = boardRepository.save(board);
        } else {
            throw new Exception();
        }

        return updatedBoard;
    }

    @Override
    public Board updateBoardContent(Integer board_id, String content) throws Exception {
        Optional<Board> selectedBoard = boardRepository.findById(board_id);

        Board updatedBoard;
        if (selectedBoard.isPresent()) {
            Board board = selectedBoard.get();

            board.setContent(content);
            board.setModified_date(LocalDateTime.now());

            updatedBoard = boardRepository.save(board);
        } else {
            throw new Exception();
        }

        return updatedBoard;
    }

    @Override
    public void deleteBoard(Integer board_id) throws Exception {
        Optional<Board> selectedBoard = boardRepository.findById(board_id);

        if(selectedBoard.isPresent()) {
            Board board = selectedBoard.get();

            boardRepository.delete(board);
        } else {
            throw new Exception();
        }
    }
}
