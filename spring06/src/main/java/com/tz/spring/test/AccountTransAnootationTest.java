package com.tz.spring.test;

import com.tz.spring.service.CashService;
import com.tz.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountTransAnootationTest {

    private ApplicationContext ctx = null;

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
    }

    @Test
    public void test() {
        UserService userService = (UserService) ctx.getBean("userService");
        userService.operateMulAccount(6, 5, new BigDecimal(100));
    }

    /**
     * 测试事务的传播属性
     */
    @Test
    public void testProgation() {
        CashService cashService = (CashService) ctx.getBean("cashService");
        List<BigDecimal> accounts = new ArrayList<>();
        accounts.add(new BigDecimal(100));
        accounts.add(new BigDecimal(100));
        accounts.add(new BigDecimal(100));
        cashService.operateMulAccount(6, 5, accounts);
    }

}
