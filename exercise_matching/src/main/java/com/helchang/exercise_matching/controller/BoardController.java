package com.helchang.exercise_matching.controller;

import com.helchang.exercise_matching.data.dto.ModifyBoardDto;
import com.helchang.exercise_matching.data.dto.BoardDto;
import com.helchang.exercise_matching.data.dto.BoardResponseDto;
import com.helchang.exercise_matching.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Board")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping
    public ResponseEntity<BoardResponseDto> createBoard(@RequestBody BoardDto boardDto) {
        BoardResponseDto boardResponseDto = boardService.saveBoard(boardDto);

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @GetMapping()
    public ResponseEntity<BoardResponseDto> getBoard(Long number) {
        BoardResponseDto boardResponseDto = boardService.getBoard(number);

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @PutMapping()
    public ResponseEntity<BoardResponseDto> modifyBoard(
            @RequestBody ModifyBoardDto modifyBoard) throws Exception {
        BoardResponseDto boardResponseDto = boardService.modifyBoard(
                modifyBoard.getNumber(),
                modifyBoard.getTitle(),
                modifyBoard.getContent());

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteBoard(Long number) throws Exception {
        boardService.deleteBoard(number);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }
}
