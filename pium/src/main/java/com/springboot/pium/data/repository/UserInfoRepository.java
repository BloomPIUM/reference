package com.springboot.pium.data.repository;

import com.springboot.pium.data.entity.Board;
import com.springboot.pium.data.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {


    // 부분 일치 키워드 사용해서 유저 검색 (사용자 아이디)( , %문자열%, %문자열, 문자열%)
    List<UserInfo> findByUsernameLike(String username);
    List<UserInfo> findByUsernameContaining(String Username);
    List<UserInfo> findByUsernameStartingWith(String Username);
    List<UserInfo> findByUsernameEndingWith(String Username);

    // 부분 일치 키워드 사용해서 유저 검색 (사용자 이름)( , %문자열%, %문자열, 문자열%)
    List<UserInfo> findByNameLike(String name);
    List<UserInfo> findByNameContaining(String name);
    List<UserInfo> findByNameStartingWith(String name);
    List<UserInfo> findByNameEndingWith(String name);

}
