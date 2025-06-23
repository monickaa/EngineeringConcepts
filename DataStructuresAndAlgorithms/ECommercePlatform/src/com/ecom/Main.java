package com.ecom;

import java.util.Scanner;

public class Main {
public static void main(String []a) {
	Scanner sc=new Scanner(System.in);
	Product [] linear= new Product[6];
	linear [0] = new Product(1,"Lipstick","Makeup");
	linear [1] = new Product(2,"Frock","Dress");
	linear [2] = new Product(3,"Heels","Slipper");
	linear [3] = new Product(4,"kajal","Makeup");
	linear [4] = new Product(5,"Kurti","Dress");
	linear [5] = new Product(6,"Sandals","Slipper");
	System.out.println("Enter your choice");
	System.out.println("1.Linear Search");
	System.out.println("2.Binary Search");
	int t=sc.nextInt();
	sc.nextLine();
	switch(t) {
	case 1:
		System.out.println("Enter your product");
		String name=sc.nextLine();
		for(int i=0;i<linear.length;i++) {
			if(name.equals(linear[i].getName())) {
				System.out.println("Your product's ID: "+linear[i].getId());
				System.out.println("Your product's Category: "+linear[i].getCat());
			}
		}
		break;
	case 2:
		int n=sc.nextInt();
		int start=0;
		int end=linear.length-1;
		
		
		
		while(start<=end) {
			int mid=(start+end)/2;
			int midId=linear[mid].getId();
			if(n==midId) {
				System.out.println("Your product's ID: "+linear[mid].getId());
				System.out.println("Your product's Category: "+linear[mid].getCat());
				System.out.println("Your product's Name: "+linear[mid].getName());
				break;
			}
			else if (n<midId) {
				end=mid-1;
				
				
			}
			else {
				start=mid+1;
			}
		}
		break;
	}
	
	
	
	
}
}
