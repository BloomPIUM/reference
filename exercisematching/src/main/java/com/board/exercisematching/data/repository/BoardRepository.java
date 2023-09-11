package com.board.exercisematching.data.repository;

import com.board.exercisematching.data.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> { //Board 가 생성한 데이터 베이스에 접근하는 데 사용됨.
}
