package com.Coffee;

public class MilkDecorator extends CoffeeDecorator{

	public MilkDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return coffee.getName()+"+"+"Milk";
	}
	public double getCost() {
		return coffee.getCost()+1.5;
	}
	

}
