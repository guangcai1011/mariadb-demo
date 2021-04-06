package com.example.mariadbdemo.controller;


import com.example.mariadbdemo.entity.User;
import com.example.mariadbdemo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("queryUserList")
    public List<User> queryUserList(){
        return userService.queryUserList();
    }
}
