package com.springboot.pium.controller;


import com.springboot.pium.data.dto.BoardDto;
import com.springboot.pium.data.dto.BoardResponseDto;
import com.springboot.pium.data.dto.ModifyBoardDto;
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

    @PostMapping
    public ResponseEntity<BoardResponseDto> createBoard(@RequestBody BoardDto boardDto) {
        BoardResponseDto boardResponseDto = boardService.saveBoard(boardDto);

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @GetMapping()
    public ResponseEntity<BoardResponseDto> getBoard(Long board_id) {
        BoardResponseDto boardResponseDto = boardService.getBoard(board_id);

        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }



    @PutMapping()
    public ResponseEntity<BoardResponseDto>modifyBoard(@RequestBody ModifyBoardDto modifyBoard) throws Exception {
        BoardResponseDto boardResponseDto = boardService.modifyBoard(
                modifyBoard.getBoard_id(),
                modifyBoard.getTitle(),
                modifyBoard.getContent());


        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteBoard(Long board_id) throws Exception {
        boardService.deleteBoard(board_id);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }
}
