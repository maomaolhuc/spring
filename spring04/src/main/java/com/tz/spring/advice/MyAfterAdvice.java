package com.tz.spring.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 后置通知
 * @author Administrator
 *
 */
public class MyAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method paramMethod, 
			Object[] paramArrayObject, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("后置通知，在方法执行后运行....");
	}

}
