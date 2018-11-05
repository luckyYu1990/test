package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUserInfo")
    public List<User> getUserInfo(){
        List<User> list = userService.getUserInfo();
        return list;
    }
    @PostMapping("/addUserInfo")
    public String addUserInfo(){
        User user  = new User();
        user.setId("3");
        user.setName("");
        userService.insert(user);
        return "success";
    }
}
