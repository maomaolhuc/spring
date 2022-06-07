package com.tz.spring.dao;

public class BydCarDaoImpl implements CarDao {

	private String company;

	private String brand;

	private float price;

	public BydCarDaoImpl(String company, String brand, float price) {
		super();
		this.company = company;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public String toString() {
		return "BydCarDaoImpl [company=" + company + ", brand=" + brand + ", price=" + price + "]";
	}

}
