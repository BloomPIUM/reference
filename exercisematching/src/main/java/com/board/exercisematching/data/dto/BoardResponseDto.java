package com.board.exercisematching.data.dto;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardResponseDto {

    private BigInteger board_id;

    private String title;

    private String content;

    private BigInteger view_cnt;

    private BigInteger like_cnt;

}


