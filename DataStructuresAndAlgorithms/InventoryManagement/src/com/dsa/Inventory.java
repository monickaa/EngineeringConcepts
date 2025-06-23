package com.dsa;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
	HashMap<Integer,Product> mp = new HashMap<>();
	
public void add(int id,Product p) {
	
	mp.put(id,p);
	System.out.println("Product Added");
}
public void delete(int id) {
	mp.remove(id);
	System.out.println("Product Deleted");
}
public void update(int id,int newqnty,double newprice) {
	Product p=mp.get(id);
	if(mp.containsKey(id)) {
		p.quantity=newqnty;
		p.price=newprice;
	}
}
public void display() {
	for(Map.Entry<Integer,Product> a:mp.entrySet()) {
		Integer id=a.getKey();
		Product pp=a.getValue();
		System.out.println(id+" "+pp.toString());
	}
}
}
