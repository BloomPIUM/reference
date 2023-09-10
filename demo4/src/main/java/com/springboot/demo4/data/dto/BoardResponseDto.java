package com.springboot.demo4.data.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardResponseDto {
    private Long number;
    private String title;
    private String content;
    private String writer;

    public BoardResponseDto(){}
    public BoardResponseDto(Long number, String title, String content, String writer){
        this.number = number;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}
