package com.tz.spring.service;

public class HelloServiceImpl implements HelloService {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("Set 注入  == Hello World : " + name);
	}

}
