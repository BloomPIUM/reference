package com.helchang.exercise_matching.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardDto {

    private String title;

    private String content;
}