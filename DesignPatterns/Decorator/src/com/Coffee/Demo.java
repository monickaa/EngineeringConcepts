package com.Coffee;

public class Demo {
public static void main(String [] a) {
	Coffee coffee=new SimpleCoffee();
	System.out.println(coffee.getName()+" "+coffee.getCost());

	coffee=new SugarDecorator(coffee);
	System.out.println(coffee.getName()+" "+coffee.getCost());
	
	coffee=new MilkDecorator(coffee);
	System.out.println(coffee.getName()+" "+coffee.getCost());
}
}
