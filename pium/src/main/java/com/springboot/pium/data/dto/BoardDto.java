package com.springboot.pium.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardDto {

//    private Long board_id;
    private String title;
    private String content;
//    private int view_cnt;
//    private int like_cnt;

}
