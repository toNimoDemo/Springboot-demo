package com.lehaha.SpringbootDemo.demos.web.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lehaha.SpringbootDemo.demos.web.demo.dao.UserRepository;
import com.lehaha.SpringbootDemo.demos.web.demo.domain.User;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/getAllUser")
    public List<User> findAll() {
        List<User> list = new ArrayList<User>();
        list = userRepository.findAll();
        return list;
    }

    @GetMapping("/user/getByUserName")
    public User getByUserName(String userName) {
        User user = userRepository.findByUserName(userName);
        return user;
    }

}
