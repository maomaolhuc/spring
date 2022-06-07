package com.tz.spring.service;

public class HiServiceImpl implements HelloService {
	
	private String name;
	
	public HiServiceImpl(String name){
		this.name = name;
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("构造器注入=== Hi : " + name);
	}

}
