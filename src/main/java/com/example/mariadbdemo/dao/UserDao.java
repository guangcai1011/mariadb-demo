package com.example.mariadbdemo.dao;

import com.example.mariadbdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> queryUserList();


}
