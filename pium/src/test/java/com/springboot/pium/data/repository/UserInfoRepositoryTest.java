package com.springboot.pium.data.repository;

import com.springboot.pium.data.entity.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class UserInfoRepositoryTest {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Test
    void findByUsernameTest() {
//        UserInfo user1 = new UserInfo();
//        user1.setUsername("1번 userID");
//        user1.setName("김김김");
//        user1.setGender("성별");
//
//        UserInfo user2 = new UserInfo();
//        user2.setUsername("2번 userID");
//        user2.setName("이이이");
//        user2.setGender("성별");
//
//        UserInfo user3 = new UserInfo();
//        user3.setUsername("3번 userID");
//        user3.setName("박박박");
//        user3.setGender("성별");
////
//        UserInfo savedUserInfo1 = userInfoRepository.save(user1);
//        UserInfo savedUserInfo2 = userInfoRepository.save(user2);
//        UserInfo savedUserInfo3 = userInfoRepository.save(user3);



        System.out.println("findByUsernameLike" + userInfoRepository.findByUsernameLike("1번 user"));
        System.out.println("findByUsernameContaining" + userInfoRepository.findByUsernameContaining("번"));
        System.out.println("findByUsernameStartingWith" + userInfoRepository.findByUsernameStartingWith("1번"));
        System.out.println("findByUsernameEndingWith" + userInfoRepository.findByUsernameEndingWith("user"));



        System.out.println("findByNameLike" + userInfoRepository.findByNameLike("이이이"));
        System.out.println("findByNameContaining" + userInfoRepository.findByNameContaining("이"));
        System.out.println("findByNameStartingWith" + userInfoRepository.findByNameStartingWith("이"));
        System.out.println("findByTitleEndingWith" + userInfoRepository.findByNameEndingWith("이"));

    }

}
