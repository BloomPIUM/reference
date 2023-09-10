package com.project.pium.controller;

import com.project.pium.data.entity.User;
import com.project.pium.data.repository.UserRepository;
import com.project.pium.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupController {
    @Autowired
    private UserRepository userRepository; // UserRepository는 사용자 정보를 다루는 JPA Repository

    @Autowired
    private SignupService signupService;

    @PostMapping("/signup")
    public String signup(@RequestParam("username") String username,
                         @RequestParam("login_pw") String password,
                         @RequestParam("name") String name,
                         @RequestParam("phone") String phone,
                         @RequestParam("gender") String gender,
                         Model model)
    {
        // 사용자 정보를 생성하고 JPA를 사용하여 저장

        if (!signupService.isUsernameUnique(username)) {
            model.addAttribute("error", "이미 사용 중인 아이디입니다.");
            return "SignupPage"; // 중복 아이디인 경우 회원가입 폼으로 다시 이동
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setPhone(phone);
        user.setGender(gender);

        userRepository.save(user);

        return "redirect:/login"; // 회원가입 후 로그인 페이지로 리다이렉트
    }
}
