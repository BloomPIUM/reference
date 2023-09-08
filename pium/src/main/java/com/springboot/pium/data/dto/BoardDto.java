package com.springboot.pium.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardDto {

//    private Integer board_id;
    private String title;
    private String content;
    private Integer view_cnt;
    private Integer like_cnt;

}
