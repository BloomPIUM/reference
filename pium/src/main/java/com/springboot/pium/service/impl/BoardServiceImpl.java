package com.springboot.pium.service.impl;

import com.springboot.pium.data.dao.BoardDAO;
import com.springboot.pium.data.dto.BoardDto;
import com.springboot.pium.data.dto.BoardResponseDto;
import com.springboot.pium.data.entity.Board;
import com.springboot.pium.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardDAO boardDAO;

    @Autowired
    public BoardServiceImpl(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }

    @Override
    public BoardResponseDto getBoard(Integer board_id) {
        Board board = boardDAO.selectBoard(board_id);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
//        boardResponseDto.setBoard_id(board.getBoard_id());
        boardResponseDto.setTitle(board.getTitle());
        boardResponseDto.setContent(board.getContent());
        boardResponseDto.setView_cnt(board.getView_cnt());
        boardResponseDto.setLike_cnt(board.getLike_cnt());

        return boardResponseDto;

    }

    @Override
    public BoardResponseDto saveBoard (BoardDto boardDto) {
        Board board = new Board();
//        board.setBoard_id(boardDto.getBoard_id());
        board.setTitle(boardDto.getTitle());
        board.setContent(boardDto.getContent());
        board.setView_cnt(boardDto.getView_cnt());
        board.setLike_cnt(boardDto.getLike_cnt());
        board.setCreated_date(LocalDateTime.now());
        board.setModified_date(LocalDateTime.now());

        Board savedBoard = boardDAO.insertBoard(board);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setBoard_id(savedBoard.getBoard_id());
        boardResponseDto.setTitle(savedBoard.getTitle());
        boardResponseDto.setContent(savedBoard.getContent());
        boardResponseDto.setView_cnt(savedBoard.getView_cnt());
        boardResponseDto.setLike_cnt(savedBoard.getLike_cnt());

        return boardResponseDto;

    }

    @Override
    public BoardResponseDto changeBoardTitle(Integer board_id, String title) throws Exception {
        Board changedBoard = boardDAO.updateBoardTitle(board_id, title);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setBoard_id(changedBoard.getBoard_id());
        boardResponseDto.setTitle(changedBoard.getTitle());
        boardResponseDto.setContent(changedBoard.getContent());
        boardResponseDto.setView_cnt(changedBoard.getView_cnt());
        boardResponseDto.setLike_cnt(changedBoard.getLike_cnt());

        return boardResponseDto;
    }

    @Override
    public BoardResponseDto changeBoardContent(Integer board_id, String content) throws Exception {
        Board changedBoard = boardDAO.updateBoardContent(board_id, content);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setBoard_id(changedBoard.getBoard_id());
        boardResponseDto.setTitle(changedBoard.getTitle());
        boardResponseDto.setContent(changedBoard.getContent());
        boardResponseDto.setView_cnt(changedBoard.getView_cnt());
        boardResponseDto.setLike_cnt(changedBoard.getLike_cnt());

        return boardResponseDto;
    }

    @Override
    public void deleteBoard(Integer board_id) throws Exception {
        boardDAO.deleteBoard(board_id);
    }


}
