package com.tz.spring.jdbctemplate.service.impl;

import java.util.List;

import com.tz.spring.jdbctemplate.dao.UserDao;
import com.tz.spring.jdbctemplate.entity.User;
import com.tz.spring.jdbctemplate.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.addUser(user);
	}

	@Override
	public boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return this.userDao.deleteUser(id);
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.updateUser(user);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return this.userDao.getUserList();
	}

}
