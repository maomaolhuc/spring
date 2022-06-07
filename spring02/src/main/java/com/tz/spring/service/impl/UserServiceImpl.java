package com.tz.spring.service.impl;

import java.util.List;

import com.tz.spring.dao.CarDao;
import com.tz.spring.service.UserService;

public class UserServiceImpl implements UserService {
	
	private String name;
	
	/*private CarDao car;*/
	
	private List<CarDao> cars;

	public void setName(String name) {
		this.name = name;
	}

	/*public void setCar(CarDao car) {
		this.car = car;
	}*/
	
	public void setCars(List<CarDao> cars) {
		this.cars = cars;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		for(CarDao car : cars){
			System.out.println(name +" 驾驶  ： " + car.run());
		}
		
	}

	

}
