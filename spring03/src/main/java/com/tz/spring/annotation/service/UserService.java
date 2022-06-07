package com.tz.spring.annotation.service;

import java.util.List;

import com.tz.spring.annotation.entity.User;

/**
 * 业务层接口
 * @author Administrator
 *
 */
public interface UserService {

	public boolean addUser(User user);

	public boolean deleteUser(Integer id);

	public boolean updateUser(User user);

	public List<User> getUserList();

}
