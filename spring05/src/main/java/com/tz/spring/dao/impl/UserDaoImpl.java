package com.tz.spring.dao.impl;

import org.springframework.stereotype.Component;

import com.tz.spring.dao.UserDao;

@Component(value = "userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void getUser() {
        System.out.println("获取用户");
    }

    @Override
    public void updateUser() {
        System.out.println("修改用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
//        int i = 1 / 0;
    }

}
