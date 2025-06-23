package com.list;

import java.util.Scanner;

public class SinglyLinkedList {
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head;
public void add(int val) {
	Node newNode=new Node(val);
	if(head==null) {
		head=newNode;
	}
	else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
}
public  void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"-->");
		temp=temp.next;
	}
}
public static void main(String [] args) {
	SinglyLinkedList l=new SinglyLinkedList();
	
	while(true) {
		System.out.println("Choose a number");
		System.out.println("1.Add");
		System.out.println("2.Display");
		System.out.println("3.Exit");
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
	switch(n) {
	case 1:
		System.out.println("Enter a number to add");
		int num=io.nextInt();
		l.add(num);
		System.out.println("Number is added");
		break;
	case 2:
		l.display();
		break;
	case 3:
		System.out.println("Exiting......");
		return ;
	}
	}
}
}
