package com.example.gohome.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardDto {

    private String title;
    private String content;
    private Long view_cnt;
    private Long like_cnt;

}
