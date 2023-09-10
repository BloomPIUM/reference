package com.springboot.demo4.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeBoardNameDto {

    private Long number;

    private String content;

    public ChangeBoardNameDto(Long number, String content){
        this.number = number;
        this.content = content;
    }

    public ChangeBoardNameDto(){

    }

}
