package com.springboot.pium.service.impl;

import com.springboot.pium.data.dto.BoardDto;
import com.springboot.pium.data.dto.BoardResponseDto;
import com.springboot.pium.data.entity.Board;
import com.springboot.pium.data.repository.BoardRepository;
import com.springboot.pium.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BoardServiceImpl implements BoardService {

    private final Logger LOGGER = LoggerFactory.getLogger(BoardServiceImpl.class);
    private final BoardRepository boardRepository;

    @Autowired
    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public BoardResponseDto getBoard(Long board_id) {
        LOGGER.info("[getBoard] input board_id : {}", board_id);
        Board board = boardRepository.findById(board_id).get();

        LOGGER.info("[getBoard] input board_id : {}, Title : {}", board.getBoard_id(), board.getTitle());

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setBoard_id(board.getBoard_id());
        boardResponseDto.setTitle(board.getTitle());
        boardResponseDto.setContent(board.getContent());
        boardResponseDto.setView_cnt(board.getView_cnt());
        boardResponseDto.setLike_cnt(board.getLike_cnt());

        return boardResponseDto;

    }

    @Override
    public BoardResponseDto saveBoard (BoardDto boardDto) {
        LOGGER.info("[saveBoard] boardDto : {}", boardDto.toString());
        Board board = new Board();
        board.setTitle(boardDto.getTitle());
        board.setContent(boardDto.getContent());
        board.setCreated_date(LocalDateTime.now());
        board.setModified_date(LocalDateTime.now());

        Board savedBoard = boardRepository.save(board);
        LOGGER.info("[saveBoard] savedBoard : {}", savedBoard);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setBoard_id(savedBoard.getBoard_id());
        boardResponseDto.setTitle(savedBoard.getTitle());
        boardResponseDto.setContent(savedBoard.getContent());

        return boardResponseDto;

    }

    @Override
    public BoardResponseDto modifyBoard(Long board_id, String title, String content) {
        Board foundBoard = boardRepository.findById(board_id).get();
        foundBoard.setTitle(title);
        Board changedBoard = boardRepository.save(foundBoard);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setBoard_id(changedBoard.getBoard_id());
        boardResponseDto.setTitle(changedBoard.getTitle());
        boardResponseDto.setContent(changedBoard.getContent());

        return boardResponseDto;
    }



    @Override
    public void deleteBoard(Long board_id) {
        boardRepository.deleteById(board_id);
    }


}
