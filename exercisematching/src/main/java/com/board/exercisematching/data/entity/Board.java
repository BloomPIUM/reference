package com.board.exercisematching.data.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "Board")
public class Board {


    @Id //PK(PrimaryKey) 선언
    @Column(nullable = false)
    private BigInteger board_id;

    /*@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;*/
    //(게시글 번호) ERD 설계에는 없지만 필요할 것 같아 작성함 일단 주석처리.

    @Column(nullable = false /*varchar = 50*/)
    private String title;

    @Column(nullable = false /*varchar = 255*/)
    private String content;

    private LocalDateTime created_date;

    private LocalDateTime modified_date;

    @Column(nullable = false)
    private BigInteger view_cnt;

    @Column(nullable = false)
    private BigInteger like_cnt;
    //@OneToMany //외래키(foreign key) Annotation.
    @Column(nullable = false)
    private BigInteger user_id;


    public void created_date(LocalDateTime now) {
    }

    public void modified_date(LocalDateTime now) {
    }
}
