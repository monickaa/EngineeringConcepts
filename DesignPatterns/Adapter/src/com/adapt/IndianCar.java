package com.adapt;

public class IndianCar implements Car {
String name;
int price;

	public IndianCar(String name, int price) {
	super();
	this.name = name;
	this.price = price;
}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return  price;
	}

}
