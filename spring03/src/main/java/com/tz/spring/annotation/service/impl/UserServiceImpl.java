package com.tz.spring.annotation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tz.spring.annotation.dao.UserDao;
import com.tz.spring.annotation.entity.User;
import com.tz.spring.annotation.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.addUser(user);
	}

	public boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return this.userDao.deleteUser(id);
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.updateUser(user);
	}

	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return this.userDao.getUserList();
	}

}
