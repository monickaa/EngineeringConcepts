package com.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
	
	List<Observer> c=new ArrayList<>();
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		c.add(o);
	}

	@Override
	public void deregister(Observer o) {
		// TODO Auto-generated method stub
		c.remove(o);
	}

	@Override
	public void notifyy() {
		// TODO Auto-generated method stub
		for(Observer o:c) {
			o.update();
		}
	}

}
