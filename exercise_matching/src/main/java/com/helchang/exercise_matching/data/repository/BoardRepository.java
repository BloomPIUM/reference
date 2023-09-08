package com.helchang.exercise_matching.data.repository;

import com.helchang.exercise_matching.data.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

// 예제 6.6
public interface BoardRepository extends JpaRepository<Board, Long> {
}
