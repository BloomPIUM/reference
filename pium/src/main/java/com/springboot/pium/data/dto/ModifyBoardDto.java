package com.springboot.pium.data.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ModifyBoardDto {

    private Long board_id;
    private String title;
    private String content;

    public ModifyBoardDto(Long board_id, String title, String content) {
        this.board_id = board_id;
        this.title = title;
        this.content = content;
    }

    public ModifyBoardDto() {
    }
}
