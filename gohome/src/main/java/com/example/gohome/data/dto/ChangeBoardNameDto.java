package com.example.gohome.data.dto;

import lombok.Data;

@Data
public class ChangeBoardNameDto {

    private Long board_id;
    private String title;

    public ChangeBoardNameDto(Long board_id, String title) {
        this.board_id = board_id;
        this.title = title;
    }

    public ChangeBoardNameDto() {
    }
}
