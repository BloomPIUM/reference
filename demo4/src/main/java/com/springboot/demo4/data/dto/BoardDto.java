package com.springboot.demo4.data.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class BoardDto {
    private String title;
    private String content;
    private String writer;
}