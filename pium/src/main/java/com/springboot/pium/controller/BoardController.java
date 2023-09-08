package com.springboot.pium.controller;


import com.springboot.pium.data.dto.BoardDto;
import com.springboot.pium.data.dto.BoardResponseDto;
import com.springboot.pium.data.dto.ChangeBoardTitleDto;
import com.springboot.pium.service.BoardService;
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
    public ResponseEntity<BoardResponseDto> getBoard(Integer board_id) {
        BoardResponseDto boardResponseDto = boardService.getBoard(board_id);

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @PostMapping()
    public ResponseEntity<BoardResponseDto> createBoard(@RequestBody BoardDto boardDto) {
        BoardResponseDto boardResponseDto = boardService.saveBoard(boardDto);

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @PutMapping()
    public ResponseEntity<BoardResponseDto> changeBoardTitle(@RequestBody ChangeBoardTitleDto changeBoardTitleDto) throws Exception {
        BoardResponseDto boardResponseDto = boardService.changeBoardTitle(
                changeBoardTitleDto.getBoard_id(),
                changeBoardTitleDto.getTitle());

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);

    }
    //changeBoardContent

    @DeleteMapping()
    public ResponseEntity<String> deleteBoard(Integer board_id) throws Exception {
        boardService.deleteBoard(board_id);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }
}
