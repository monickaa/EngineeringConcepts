package com.adapt;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
public List<Car> getCarList(){
	List<Car> c=new ArrayList<Car>();
	Car ind=new IndianCar("Tata",10);
	Car fore=new Adapter(new ForeignCar("Rolls",90));
	c.add(ind);
	c.add(fore);
	return  c;
}
}
