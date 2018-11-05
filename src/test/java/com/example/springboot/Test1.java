package com.example.springboot;

import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class Test1 {
    @Autowired
    UserService userService;
    String str = "test";
}
