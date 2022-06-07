package com.tz.spring.jdbctemplate.dao;

import java.util.List;

import com.tz.spring.jdbctemplate.entity.User;

/**
 * 针对用户表的CRUD操作
 * @author Administrator
 *
 */
public interface UserDao {

	public boolean addUser(User user);
	
	public boolean deleteUser(Integer id);
	
	public boolean updateUser(User user);
	
	public List<User> getUserList();
}
