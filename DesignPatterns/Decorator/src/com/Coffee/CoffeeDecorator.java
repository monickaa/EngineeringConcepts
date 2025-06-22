package com.Coffee;

public abstract class CoffeeDecorator implements Coffee{

	protected Coffee coffee;
	public CoffeeDecorator(Coffee coffee) {
		this.coffee=coffee;
	}
	public String getName() {
		return coffee.getName();
	}
	public double getCost() {
		return coffee.getCost();
	}
	
}
