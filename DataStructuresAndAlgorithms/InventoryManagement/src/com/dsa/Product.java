package com.dsa;

import java.util.HashMap;

public class Product {

int id;
String name;
int quantity;
double price;
public Product(int id, String name, int quantity, double price) {
	super();
	this.id = id;
	this.name = name;
	this.quantity = quantity;
	this.price = price;
}
public String toString() {
	return id+" "+name+" "+quantity+" "+price;
}

}
