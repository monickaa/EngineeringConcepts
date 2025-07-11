package com.Builder;

public class PhoneBuilder {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os,ram,processor,screenSize);
	}
}
