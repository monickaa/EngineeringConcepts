package com.dsa;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[]a) {
		Inventory i=new Inventory();
		Scanner io=new Scanner(System.in);
		while(true) {
			System.out.println("Inventory Management System");
			System.out.println("1.Add Product");
			System.out.println("2.Delete Product");
			System.out.println("3.Update Products");
			System.out.println("4.Display Products");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			int n=io.nextInt();
			switch(n) {
			case 1:
				int id=io.nextInt();
				io.nextLine();
				String name=io.next();
				int quantity=io.nextInt();
				double price=io.nextDouble();
				Product prod=new Product(id,name,quantity,price);
				i.add(id,prod);
				break;
			case 2:
				int idd=io.nextInt();
				i.delete(idd);
				break;
			case 3:
				System.out.println("Enter ID");
				int key=io.nextInt();
				System.out.println("Enter new quantity");
				int newqnty=io.nextInt();
				System.out.println("Enter new price");
				double newprice=io.nextDouble();
				i.update(key,newqnty,newprice);
				break;
			case 4:
				i.display();
				break;
			case 5:
				return;
			
			}
		}
	
	
	}
	}
