package com.helchang.exercise_matching.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardResponseDto {

    private Long number;

    private String title;

    private String content;

    private int view_cnt;

    private int like_cnt;
}