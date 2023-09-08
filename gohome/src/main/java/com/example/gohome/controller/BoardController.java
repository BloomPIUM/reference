package com.example.gohome.controller;

import com.example.gohome.data.dto.ChangeBoardNameDto;
import com.example.gohome.data.dto.BoardDto;
import com.example.gohome.data.dto.BoardResponseDto;
import com.example.gohome.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping()
    public ResponseEntity<BoardResponseDto> getBoard(Long board_id) {
        BoardResponseDto boardResponseDto = boardService.getBoard(board_id);

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @PostMapping()
    public ResponseEntity<BoardResponseDto> createBoard(@RequestBody BoardDto boardDto) {
        BoardResponseDto boardResponseDto = boardService.saveBoard(boardDto);

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @PutMapping()
    public ResponseEntity<BoardResponseDto> changeBoardName(@RequestBody ChangeBoardNameDto changeBoardNameDto) throws Exception {
        BoardResponseDto boardResponseDto = boardService.changeBoardName(
                changeBoardNameDto.getBoard_id(),
                changeBoardNameDto.getTitle());

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);

    }

    @DeleteMapping()
    public ResponseEntity<String> deleteBoard(Long board_id) throws Exception {
        boardService.deleteBoard(board_id);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }
}
