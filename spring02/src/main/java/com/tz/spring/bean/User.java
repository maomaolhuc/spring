package com.tz.spring.bean;

public class User {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addUser(){
		System.out.println("Add User ... ");
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

}
