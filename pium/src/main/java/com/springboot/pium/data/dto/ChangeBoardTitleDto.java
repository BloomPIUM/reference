package com.springboot.pium.data.dto;

import lombok.Data;

@Data
public class ChangeBoardTitleDto {

    private Integer board_id;
    private String title;

    public ChangeBoardTitleDto(Integer board_id, String title) {
        this.board_id = board_id;
        this.title = title;
    }

    public ChangeBoardTitleDto() {
    }
}
