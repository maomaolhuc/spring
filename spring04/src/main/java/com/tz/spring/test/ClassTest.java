package com.tz.spring.test;

import com.tz.spring.proxy.UserDao;
import com.tz.spring.proxy.impl.UserDaoImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ClassTest {

	/**
	 * 常规的调用方法
	 */
	@Test
	public void test(){
		UserDao userDao = new UserDaoImpl();
		userDao.addUser();
	}
	
	/**
	 * JDK的动态代理 
	 */
	@Test
	public void testJDKProxy(){
		//实例化目标对象
		UserDao target = new UserDaoImpl();
		UserDao proxy = (UserDao) Proxy.newProxyInstance(
				//目标类ClassLoader，定义了由哪个ClassLoader对象不生成代理对象进行加载 
				target.getClass().getClassLoader(), 
				//目标类的接口，一个Interface对象数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，
				//那这个代理对象就宣称实现该接口(多态),这样我就能够调用这组接口中的方法
				target.getClass().getInterfaces(), 
				
				new InvocationHandler(){
					/**
					 * proxy:指我们所代理的那个真实的对象
					 * method : 指我们所要调用真实对象的某个方法的Method对象
					 * params : 指我们所要调用真实对象的某个方法接受的参数
					 */
					@Override
					public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
						// TODO Auto-generated method stub
						
						System.out.println("判断权限");
						
						System.out.println("" + method.getName());
						
						Object result = method.invoke(target, params);
						
						System.out.println("写日志....");
						
						return result;
					}
					
				});
		
		proxy.searchUser();
	}
}
