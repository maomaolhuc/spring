package com.tz.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tz.spring.autowire.Person;

public class AutowireTest {
	
	@Test
	public void testAutowire(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-autowire.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}

}
