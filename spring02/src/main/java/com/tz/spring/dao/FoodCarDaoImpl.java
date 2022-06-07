package com.tz.spring.dao;

/**
 * 多个属性值的set注入
 * @author Administrator
 *
 */
public class FoodCarDaoImpl implements CarDao {
	
	private String company;
	
	private String brand;
	
	private int maxSpeed;

	public void setCompany(String company) {
		this.company = company;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public String toString() {
		return "FoodCarDaoImpl [company=" + company + ", brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
	}

}
