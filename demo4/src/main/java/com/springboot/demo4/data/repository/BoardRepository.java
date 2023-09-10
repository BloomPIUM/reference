package com.springboot.demo4.data.repository;

import com.springboot.demo4.data.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
