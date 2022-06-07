package com.tz.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tz.spring.proxy.PersonDao;
import com.tz.spring.proxy.UserDao;

public class AdvistorAutoTest {

	private ApplicationContext ctx = null;

	@Before
	public void init() {
		ctx = new ClassPathXmlApplicationContext("applicationContext-auto.xml");
	}

	/**
	 * 测试自动代码
	 */
	@Test
	public void testAuto() {
		UserDao userDao = (UserDao) ctx.getBean("userDao"); // 目标对象
		userDao.addUser();
		System.out.println("==============================");
		userDao.searchUser();
		System.out.println();
		System.out.println("==============================");
		System.out.println();
		PersonDao personDao = (PersonDao) ctx.getBean("personDao"); // 目标对象
		personDao.addPerson();
		System.out.println("==============================");
		personDao.updatePerson();
	}



}
