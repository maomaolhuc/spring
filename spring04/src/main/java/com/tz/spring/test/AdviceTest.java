package com.tz.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tz.spring.proxy.UserDao;

public class AdviceTest {

	private ApplicationContext ctx=null;
	
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	/**
	 * 测试前置通知
	 */
	@Test
	public void testBeforeAdvice(){
		UserDao userDao = (UserDao) ctx.getBean("myBeforeProxy");  //代理对象
		userDao.searchUser();
	}
	
	/**
	 * 测试后置通知
	 */
	@Test
	public void testAfterAdvice(){
		UserDao userDao = (UserDao) ctx.getBean("myAfterProxy");  //代理对象
		userDao.searchUser();
	}
	
	/**
	 * 测试环绕通知
	 */
	@Test
	public void testAroundAdvice(){
		UserDao userDao = (UserDao) ctx.getBean("myAroundProxy");  //代理对象
		userDao.searchUser();
	}
	
	/**
	 * 测试异常通知
	 */
	@Test
	public void testThrowingAdvice(){
		UserDao userDao = (UserDao) ctx.getBean("myThrowingProxy");  //代理对象
		userDao.searchUser();
	}
}
