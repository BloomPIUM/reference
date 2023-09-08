package com.example.gohome.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardResponseDto {

    private Long board_id;
    private String title;
    private String content;
    private Long view_cnt;
    private Long like_cnt;
}
