package com.tz.spring.test;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.tz.spring.beans.HelloWorldImpl;
import com.tz.spring.beans.IHelloWorld;

public class SpringTest {

    /**
     * 以前是怎么做的
     */
    @Test
    public void oldMethod() {
        //创建一个helloWorld对象
        IHelloWorld hello = new HelloWorldImpl();
        //手工赋值
        hello.setUserName("Spring");
        //调用hello方法
        hello.hello();
    }

    /**
     * spring的示例
     * ClassPathXmlApplicationContext  相对路径
     */
    @Test
    public void springMethod() {
        //1.创建spring的IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        //2.从容 器中获取Bean
        IHelloWorld helloWorld = (IHelloWorld) ctx.getBean("helloWorld");
        //调用方法
        helloWorld.hello();
    }

    /**
     * BeanFactory容器
     */
    @Test
    public void beanFactoryMethod() {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        IHelloWorld helloWorld = (IHelloWorld) factory.getBean("helloWorld");
        //调用方法
        helloWorld.hello();
    }

    /**
     * FileSystemXmlApplicationContext   全路径
     */
    @Test
    public void fileSystemXmlApplicationContextMethod() {
        //1.创建spring的IOC容器
        ApplicationContext ctx = new FileSystemXmlApplicationContext
                ("C:\\Users\\Administrator\\IdeaProjects\\spring\\spring01\\src\\main\\resources\\beans.xml");
        //2.从容 器中获取Bean
        IHelloWorld helloWorld = (IHelloWorld) ctx.getBean("helloWorld");
        //调用方法
        helloWorld.hello();
    }

}
