package com.adapt;

import java.util.List;

public class Demo {
public static void main (String [] args) {
	CarDealer cd=new CarDealer();
	List<Car> cars=cd.getCarList();
	for (Car val : cars) {
		System.out.println(val.getName()+val.getPrice());
	}
}
}

