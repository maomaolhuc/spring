package com.tz.spring.test;

import com.tz.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * 有事务的测试
 *
 * @author Administrator
 */
public class AccountTransTest {

    private ApplicationContext ctx = null;

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test() {
        UserService userService = (UserService) ctx.getBean("transProxy");
        userService.operateMulAccount(6, 5, new BigDecimal(100));
    }

}
