package com.tz.spring.proxy.impl;

import com.tz.spring.proxy.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		/**
		 * 判断这个某些用户可以操作，其余的用户不可以操作
		 * Class.forName
		 */
//		System.out.println("判断权限");
		/**
		 * 业务逻辑的方法
		 * 
		 */
		System.out.println("添加用户....");
		
		/**
		 * 记录日志，说明是谁添加的这个用户
		 */
//		System.out.println("写日志....");
	}

	@Override
	public void searchUser() {
		// TODO Auto-generated method stub
		/**
		 * 业务逻辑的方法
		 * 
		 */
		System.out.println("查询用户....");
		
//		int i = 1/0;
	}

}
