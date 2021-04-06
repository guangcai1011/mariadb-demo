package com.example.mariadbdemo.service.impl;

import com.example.mariadbdemo.dao.UserDao;
import com.example.mariadbdemo.entity.User;
import com.example.mariadbdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


    @Override
    public List<User> queryUserList() {
        return userDao.queryUserList();
    }
}
