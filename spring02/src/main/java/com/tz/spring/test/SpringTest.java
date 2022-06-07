package com.tz.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tz.spring.dao.CarDao;
import com.tz.spring.service.HelloService;
import com.tz.spring.service.UserService;

public class SpringTest {

    /**
     * 属性注入
     */
    @Test
    public void testSetter() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService hello = (HelloService) ctx.getBean("helloService");
        hello.say();
    }

    /**
     * 构造器注入
     */
    @Test
    public void testContructor() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService hello = (HelloService) ctx.getBean("hiService");
        hello.say();
    }

    /**
     * 多个属性的注入
     */
    @Test
    public void testMulSetter() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CarDao car = (CarDao) ctx.getBean("foodCar");
        System.out.println(car.run());
    }

    /**
     * 多个参数构造器注入
     */
    @Test
    public void testMulContructor() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CarDao car = (CarDao) ctx.getBean("bydCar");
        System.out.println(car.run());
    }

    /**
     * 用户开汽车
     */
    @Test
    public void testDriveCar() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService user = (UserService) ctx.getBean("userService2");
        user.drive();
    }
}
