package com.board.exercisematching.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDto {

    private String user_id;

    private String login_id;

    private String login_password;

    private String name;

    private String gender;
    // gender는 범수님이 Boolean 타입에서 String 으로 변경

    private String phoneNumber;

    private String status;
}