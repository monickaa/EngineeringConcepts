package com.ecom;

public class Product {
int prodId;
String prodName;
String category;
public Product(int prodId, String prodName, String category) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.category = category;
}
public String getName() {
	return prodName;
}
public String getCat() {
	return category;
}
public int getId() {
	return prodId;
}

}
