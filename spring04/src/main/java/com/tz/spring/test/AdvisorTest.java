package com.tz.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tz.spring.proxy.UserDao;

public class AdvisorTest {

	private ApplicationContext ctx = null;

	@Before
	public void init() {
		ctx = new ClassPathXmlApplicationContext("applicationContext-advisor.xml");
	}

	/**
	 * 测试前置顾问 名称
	 */
	@Test
	public void testBeforeAdviSor() {
		UserDao userDao = (UserDao) ctx.getBean("myBeforeAdvisorProxy"); // 代理对象
		userDao.addUser();
		System.out.println("==============================");
		userDao.searchUser();
	}
	
	/**
	 * 测试后置顾问 正则
	 */
	@Test
	public void testAfterAdviSor() {
		UserDao userDao = (UserDao) ctx.getBean("myAfterAdvisorProxy"); // 代理对象
		userDao.addUser();
		System.out.println("==============================");
		userDao.searchUser();
	}

}
