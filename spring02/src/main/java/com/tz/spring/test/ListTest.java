package com.tz.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tz.spring.bean.Gather;
import com.tz.spring.bean.GatherOther;
import com.tz.spring.bean.User;

public class ListTest {

    /**
     * 测试集合注入
     */
    @Test
    public void testGather() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-property.xml", "beans.xml");
        Gather ga = (Gather) ctx.getBean("gather");
        System.out.println("String : " + ga.getStrVal());
        System.out.println("Int : " + ga.getIntVal());
        System.out.println("List : " + ga.getListVal());
        System.out.println("Set : " + ga.getSetVal());
        System.out.println("map : " + ga.getMapVal());

        User user = (User) ctx.getBean("user");
        user.setName("潭州教育");
        System.out.println(user);
        user.addUser();
    }

    /**
     * 测试赖加载
     */
    @Test
    public void testLazy() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-property.xml");
        GatherOther ga = (GatherOther) ctx.getBean("gatherOther");
        System.out.println(ga);
    }
}
