package com.helchang.exercise_matching.data.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

// 예제 7.2
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "Board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private int view_cnt; // 조회수

    @Column(nullable = false)
    private int like_cnt; // 추천수

    private LocalDateTime createdAt;  // 작성일

    private LocalDateTime updatedAt;  // 수정일

}
