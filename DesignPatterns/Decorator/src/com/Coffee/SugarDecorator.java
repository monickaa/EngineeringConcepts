package com.Coffee;

public class SugarDecorator extends CoffeeDecorator{

	public SugarDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName()+"+"+"Sugar";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost()+0.5;
	}
	
}
