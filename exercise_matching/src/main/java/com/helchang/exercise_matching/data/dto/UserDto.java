package com.helchang.exercise_matching.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDto {

    private String user_id;

    private String password;

    private String name;

    private boolean gender;

    private String phoneNumber;

    private boolean status;
}