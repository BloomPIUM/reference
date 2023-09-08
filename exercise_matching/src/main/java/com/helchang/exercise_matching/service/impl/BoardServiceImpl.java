package com.helchang.exercise_matching.service.impl;

import com.helchang.exercise_matching.data.dto.BoardDto;
import com.helchang.exercise_matching.data.dto.BoardResponseDto;
import com.helchang.exercise_matching.data.entity.Board;
import com.helchang.exercise_matching.data.repository.BoardRepository;
import com.helchang.exercise_matching.service.BoardService;
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
    public BoardResponseDto getBoard(Long number) {
        LOGGER.info("[getBoard] input number : {}", number);
        Board board = boardRepository.findById(number).get();

        LOGGER.info("[getBoard] input number : {}, Title : {}", board.getNumber(), board.getTitle());

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setNumber(board.getNumber());
        boardResponseDto.setTitle(board.getTitle());
        boardResponseDto.setContent(board.getContent());
        boardResponseDto.setView_cnt(board.getView_cnt());
        boardResponseDto.setLike_cnt(board.getLike_cnt());

        return boardResponseDto;
    }

    @Override
    public BoardResponseDto saveBoard(BoardDto boardDto) {
        LOGGER.info("[saveBoard] boardDTO : {}", boardDto.toString());
        Board board = new Board();
        board.setTitle(boardDto.getTitle());
        board.setContent(boardDto.getContent());
        board.setCreatedAt(LocalDateTime.now());
        board.setUpdatedAt(LocalDateTime.now());

        Board savedBoard = boardRepository.save(board);
        LOGGER.info("[saveBoard] savedBoard : {}", savedBoard);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setNumber(savedBoard.getNumber());
        boardResponseDto.setTitle(savedBoard.getTitle());
        boardResponseDto.setContent(savedBoard.getContent());

        return boardResponseDto;
    }

    @Override
    public BoardResponseDto modifyBoard(Long number, String title, String content) {
        Board foundBoard = boardRepository.findById(number).get();
        foundBoard.setTitle(title);
        Board changedBoard = boardRepository.save(foundBoard);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setNumber(changedBoard.getNumber());
        boardResponseDto.setTitle(changedBoard.getTitle());
        boardResponseDto.setContent(changedBoard.getContent());

        return boardResponseDto;
    }

    @Override
    public void deleteBoard(Long number) {
        boardRepository.deleteById(number);
    }
}
