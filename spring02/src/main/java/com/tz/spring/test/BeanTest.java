package com.tz.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tz.spring.bean.DestroyBean;
import com.tz.spring.bean.HelloChina;
import com.tz.spring.bean.HelloWorld;
import com.tz.spring.bean.InitBean;
import com.tz.spring.bean.ScopeBean;
import com.tz.spring.bean.User;

public class BeanTest {

    /**
     * 什么是bean?
     */
    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) ctx.getBean("user");
        user.setName("潭州教育");
        System.out.println(user);
        user.addUser();
    }

    /**
     * bean的初始化
     */
    @Test
    public void testInit() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        InitBean init = (InitBean) ctx.getBean("init");
        System.out.println(init);
    }

    /**
     * bean destroy
     */
    @Test
    public void testDestroy() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        DestroyBean destroy = (DestroyBean) ctx.getBean("destroy");
        System.out.println(destroy);
    }

    /**
     * Scope的测试
     */
    @Test
    public void testScope() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        ScopeBean scope = (ScopeBean) ctx.getBean("scope");
        System.out.println("scope" + scope);

        ScopeBean scope1 = (ScopeBean) ctx.getBean("scope");
        System.out.println("scope1" + scope1);
    }

    /**
     * 测试继承
     */
    @Test
    public void testParent() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld hello = (HelloWorld) ctx.getBean("hello");
        System.out.println("hello.getName() : " + hello.getName());

        HelloChina china = (HelloChina) ctx.getBean("china");
        System.out.println("china.getName() : " + china.getName());
        System.out.println("china.getAge() : " + china.getAge());
    }
}
