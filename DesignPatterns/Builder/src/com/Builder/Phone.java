package com.Builder;

public class Phone {
private String os;
private int ram;
private String processor;
private double screenSize;
public Phone(String os, int ram, String processor, double screenSize) {
	super();
	this.os = os;
	this.ram = ram;
	this.processor = processor;
	this.screenSize = screenSize;
}
@Override
public String toString() {
	return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize + "]";
}
 

}
