package com.project.pium.service;

import com.project.pium.data.entity.User;
import com.project.pium.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    @Autowired
    private UserRepository userRepository;

    public boolean isUsernameUnique(String username ) {
        User existingUser = userRepository.findByUsername(username);
        return existingUser == null;
    }


}

