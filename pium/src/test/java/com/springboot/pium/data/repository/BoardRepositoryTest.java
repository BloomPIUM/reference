package com.springboot.pium.data.repository;

import com.springboot.pium.data.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;

    @Test
    void findByTitleTest() {
        Board board1 = new Board();
        board1.setTitle("제목");
        board1.setContent("내용1");
        board1.setCreated_date(LocalDateTime.now());
        board1.setModified_date(LocalDateTime.now());

        Board board2 = new Board();
        board2.setTitle("제목");
        board2.setContent("내용2");
        board2.setCreated_date(LocalDateTime.now());
        board2.setModified_date(LocalDateTime.now());

        Board board3 = new Board();
        board3.setTitle("제목");
        board3.setContent("내용3");
        board3.setCreated_date(LocalDateTime.now());
        board3.setModified_date(LocalDateTime.now());

        Board savedBoard1 = boardRepository.save(board1);
        Board savedBoard2 = boardRepository.save(board2);
        Board savedBoard3 = boardRepository.save(board3);


        System.out.println("findAllByTitle" + boardRepository.findAllByTitle("제목"));
        System.out.println("findByTitleParam" + boardRepository.findByTitleParam("제목"));
        System.out.println("findByTitleLike" + boardRepository.findByTitleLike("제목"));
        System.out.println("findByTitleContaining" + boardRepository.findByTitleContaining("제목"));
        System.out.println("findByTitleStartingWith" + boardRepository.findByTitleStartingWith("제목"));
        System.out.println("findByTitleEndingWith" + boardRepository.findByTitleEndingWith("제목"));

    }

}
