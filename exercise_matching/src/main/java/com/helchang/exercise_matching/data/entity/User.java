package com.helchang.exercise_matching.data.entity;

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
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 회원번호

    @Column(nullable = false, unique = true)
    private String user_id; // 사용자의 고유한 ID

    @Column(nullable = false)
    private String password; // 비밀번호

    @Column(nullable = false)
    private String name; // 사용자 이름

    @Column(nullable = false)
    private boolean gender; // 성별

    @Column(nullable = false)
    @Pattern(regexp = "01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$")
    private String phoneNumber; // 전화번호

    @Column(nullable = false)
    private boolean status; // 상태
}
