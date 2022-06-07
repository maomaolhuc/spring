package com.tz.spring.annotation.dao;

import com.tz.spring.annotation.entity.User;

import java.util.List;

/**
 * 针对用户表的CRUD操作
 *
 * @author Administrator
 */
public interface UserDao {

    public boolean addUser(User user);

    public boolean deleteUser(Integer id);

    public boolean updateUser(User user);

    public List<User> getUserList();
}
