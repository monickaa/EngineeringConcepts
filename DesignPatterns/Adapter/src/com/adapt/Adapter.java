package com.adapt;

public class Adapter implements Car{
ForeignCar fc;
Adapter(ForeignCar fc){
	this.fc=fc;
}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return fc.getCarName();
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return fc.getCarPrice();
	}

}
