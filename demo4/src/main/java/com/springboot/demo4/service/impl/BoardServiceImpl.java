package com.springboot.demo4.service.impl;

import com.springboot.demo4.data.dao.BoardDao;
import com.springboot.demo4.data.dto.BoardDto;
import com.springboot.demo4.data.dto.BoardResponseDto;
import com.springboot.demo4.data.entity.Board;
import com.springboot.demo4.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BoardServiceImpl implements BoardService {
    private final BoardDao boardDao;


    @Autowired
    public BoardServiceImpl(BoardDao boardDao){
        this.boardDao = boardDao;
    }

    @Override
    public BoardResponseDto getBoard(Long number){
        Board board = boardDao.selectBoard(number);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setNumber(board.getNumber());
        boardResponseDto.setTitle(board.getTitle());
        boardResponseDto.setContent(board.getContent());
        boardResponseDto.setWriter(board.getWriter());

        return boardResponseDto;

    }

    @Override
    public BoardResponseDto saveBoard(BoardDto boardDto){
        Board board = new Board();
        board.setTitle(boardDto.getTitle());
        board.setContent(boardDto.getContent());
        board.setWriter(boardDto.getWriter());
        board.setCreatedAt(LocalDateTime.now());
        board.setUpdatedAt(LocalDateTime.now());

        Board savedBoard = boardDao.insertBoard(board);
        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setNumber(savedBoard.getNumber());
        boardResponseDto.setTitle(savedBoard.getTitle());
        boardResponseDto.setContent(savedBoard.getContent());
        boardResponseDto.setWriter(savedBoard.getWriter());

        return boardResponseDto;
    }

    @Override
    public BoardResponseDto changeBoardName(Long number, String content) throws Exception{
        Board changedBoard = boardDao.updateBoard(number, content);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setNumber(changedBoard.getNumber());
        boardResponseDto.setTitle(changedBoard.getTitle());
        boardResponseDto.setContent(changedBoard.getContent());
        boardResponseDto.setWriter(changedBoard.getWriter());

        return boardResponseDto;
    }

    @Override
    public void deleteBoard(Long number) throws Exception{
        boardDao.deleteBoard(number);
    }
}
