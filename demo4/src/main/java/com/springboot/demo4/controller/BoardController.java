package com.springboot.demo4.controller;

import com.springboot.demo4.data.dto.BoardDto;
import com.springboot.demo4.data.dto.BoardResponseDto;
import com.springboot.demo4.data.dto.ChangeBoardNameDto;
import com.springboot.demo4.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService){
        this.boardService = boardService;
    }

    @GetMapping()
    public ResponseEntity<BoardResponseDto> getBoard(Long number){
        BoardResponseDto boardResponseDto = boardService.getBoard(number);

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @PostMapping()
    public ResponseEntity<BoardResponseDto> createBoard(@RequestBody BoardDto boardDto){
        BoardResponseDto boardResponseDto = boardService.saveBoard(boardDto);

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @PutMapping()
    public ResponseEntity<BoardResponseDto> changeBoardName(
            @RequestBody ChangeBoardNameDto changeBoardNameDto) throws Exception{
        BoardResponseDto boardResposeDto = boardService.changeBoardName(
                changeBoardNameDto.getNumber(),
                changeBoardNameDto.getContent());

                return ResponseEntity.status(HttpStatus.OK).body(boardResposeDto);
    }

    @DeleteMapping
    public ResponseEntity<String>deleteBoard (Long number) throws Exception{
        boardService.deleteBoard(number);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다");
    }

}
