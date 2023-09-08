package com.example.gohome.data.dao.impl;

import com.example.gohome.data.dao.BoardDAO;
import com.example.gohome.data.entity.Board;
import com.example.gohome.data.repository.BoardRepository;
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
    public Board selectBoard(Long number) {
        Board selectedBoard = boardRepository.getById(number);

        return selectedBoard;
    }

    @Override
    public Board updateBoardName(Long number, String name) throws Exception {
        Optional<Board> selectedProduct = boardRepository.findById(number);

        Board updatedBoard;
        if (selectedProduct.isPresent()) {
            Board board = selectedProduct.get();

            board.setTitle(name);
            board.setCreated_date(LocalDateTime.now());

            updatedBoard = boardRepository.save(board);
        } else {
            throw new Exception();
        }

        return updatedBoard;
    }

    @Override
    public void deleteBoard(Long board_id) throws Exception {
        Optional<Board> selectedBoard = boardRepository.findById(board_id);

        if(selectedBoard.isPresent()) {
            Board board = selectedBoard.get();

            boardRepository.delete(board);
        } else {
            throw new Exception();
        }
    }



}
