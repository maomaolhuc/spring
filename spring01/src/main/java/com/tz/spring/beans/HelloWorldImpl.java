package com.tz.spring.beans;

public class HelloWorldImpl implements IHelloWorld {
	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello World : " + userName);
	}

}
