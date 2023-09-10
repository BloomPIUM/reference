package com.springboot.pium.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserInfoDto {

    private String username; // 사용자 ID

    private String password;

    private String name;

    private String phone; // 전화번호

    private String gender;

    private String status;

}
