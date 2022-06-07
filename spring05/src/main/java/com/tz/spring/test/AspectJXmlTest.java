package com.tz.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tz.spring.dao.UserDao;

public class AspectJXmlTest {

    private ApplicationContext ctx = null;

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testAdvice() {
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        userDao.addUser();
        System.out.println();
        userDao.updateUser();
        System.out.println();
        userDao.getUser();
        System.out.println();
        userDao.deleteUser();
    }

}
