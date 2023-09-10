package com.springboot.demo4.data.dao.impl;

import com.springboot.demo4.data.dao.BoardDao;
import com.springboot.demo4.data.entity.Board;
import com.springboot.demo4.data.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class BoardDaoImpl implements BoardDao {
    private final BoardRepository boardRepository;

    @Autowired
    public BoardDaoImpl(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }

    @Override
    public Board insertBoard(Board board){
        Board savedBoard = boardRepository.save(board);
        return savedBoard;
    }
    @Override
    public Board selectBoard(Long number){
        Board selectedBoard = boardRepository.getById(number);
        return selectedBoard;
    }
    @Override
    public Board updateBoard(Long number,String content) throws Exception{
        Optional<Board> selectedBoard = boardRepository.findById(number);

        Board updatedBoard;
        if (selectedBoard.isPresent()) {
            Board board = selectedBoard.get();

            board.setContent(content);
            board.setUpdatedAt(LocalDateTime.now());

            updatedBoard = boardRepository.save(board);
        } else{
            throw new Exception();

        }
        return updatedBoard;
    }
    @Override
    public void deleteBoard(Long number) throws Exception{
        Optional<Board> selectedBoard = boardRepository.findById(number);

        if(selectedBoard.isPresent()){
            Board board = selectedBoard.get();

            boardRepository.delete(board);

        } else{
            throw new Exception();
        }
    }

}
