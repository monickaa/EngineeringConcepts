package com.Builder;

public class Shop {
public static void main(String []a) {
	Phone p=new PhoneBuilder().setOs("IOS").getPhone();
	System.out.println(p);
	
	
}
}
