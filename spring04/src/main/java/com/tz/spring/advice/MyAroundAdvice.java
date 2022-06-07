package com.tz.spring.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕通知
 * @author Administrator
 *
 */
public class MyAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("环绕通知，在方法执行之前....");
		
		Object result = invocation.proceed();
		
		System.out.println("环绕通知，在方法执行之后.......");
		
		result = false;
		return result;
	}

}
