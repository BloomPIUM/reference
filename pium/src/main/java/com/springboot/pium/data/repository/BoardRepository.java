package com.springboot.pium.data.repository;

import com.springboot.pium.data.entity.Board;
import com.springboot.pium.data.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findAllByTitle(String title);
//    List<UserInfo> findAllByUsername(String username);

    @Query("SELECT b.title, b.content FROM Board b WHERE b.title = :title")
    List<Object[]> findByTitleParam(@Param("title") String title);

    //부분 일치 키워드를 사용한 쿼리 메서드 ( , %문자열%, %문자열, 문자열%)
    List<Board> findByTitleLike(String title);
    List<Board> findByTitleContaining(String title);
    List<Board> findByTitleStartingWith(String title);
    List<Board> findByTitleEndingWith(String title);








}
