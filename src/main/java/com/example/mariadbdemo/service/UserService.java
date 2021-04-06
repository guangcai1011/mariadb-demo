package com.example.mariadbdemo.service;

import com.example.mariadbdemo.entity.User;

import java.util.List;

public interface UserService {

    List<User> queryUserList();
}
