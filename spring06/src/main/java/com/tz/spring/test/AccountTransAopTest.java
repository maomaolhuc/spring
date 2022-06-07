package com.tz.spring.test;

import com.tz.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class AccountTransAopTest {

    private ApplicationContext ctx = null;

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("applicationContext-aspect.xml");
    }

    @Test
    public void test() {
        UserService userService = (UserService) ctx.getBean("userService");
        userService.operateMulAccount(6, 5, new BigDecimal(100));
    }

}
