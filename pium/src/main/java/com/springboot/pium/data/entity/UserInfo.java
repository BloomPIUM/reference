package com.springboot.pium.data.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "UserInfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id; // 회원번호

    @Column(nullable = false, unique = true)
    private String username; // 사용자 ID

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Pattern(regexp = "01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$")
    private String phone; // 전화번호

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String status; // 회원 상태

}
