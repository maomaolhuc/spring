package com.tz.spring.test;

import com.tz.spring.jdbctemplate.dao.UserDao;
import com.tz.spring.jdbctemplate.entity.User;
import com.tz.spring.jdbctemplate.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.List;

public class SpringJDBCTest {

    private ApplicationContext ctx;

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setName("小轩");
        user.setAccount(new BigDecimal(800));
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao.addUser(user));
    }

    @Test
    public void testAddUserService() {
        User user = new User();
        user.setName("伊恩");
        user.setAccount(new BigDecimal(1000));
        UserService userSerivce = (UserService) ctx.getBean("userService");
        System.out.println(userSerivce.addUser(user));
    }

    @Test
    public void testUpdateUserService() {
        User user = new User();
        user.setId(2);
        user.setName("玉帝哥哥");
        user.setAccount(new BigDecimal(900));
        UserService userSerivce = (UserService) ctx.getBean("userService");
        System.out.println(userSerivce.updateUser(user));
    }

    @Test
    public void testDeleteUserService() {
        int id = 4;
        UserService userSerivce = (UserService) ctx.getBean("userService");
        System.out.println(userSerivce.deleteUser(id));
    }

    @Test
    public void testListUserService() {
        UserService userSerivce = (UserService) ctx.getBean("userService");
        List<User> users = userSerivce.getUserList();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
