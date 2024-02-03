package com.jproject.myrestfulservice.controller;

import com.jproject.myrestfulservice.bean.User;
import com.jproject.myrestfulservice.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpa")
public class UserJpaController {
    private UserRepository userRepository;

    public UserJpaController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("users")
    public List<User> retrieveAllUsers(){
        return userRepository.findAll();
    }
}
