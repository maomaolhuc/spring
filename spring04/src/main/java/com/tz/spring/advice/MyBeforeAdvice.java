package com.tz.spring.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 前置通知
 * 
 * @author Administrator
 *
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method paramMethod, Object[] paramArrayOfObject, Object paramObject) 
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("前置通知，在方法执行之前运行.....");
	}

}
