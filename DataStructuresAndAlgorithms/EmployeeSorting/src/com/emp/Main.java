package com.emp;

import java.util.Scanner;

public class Main {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				swap(arr,j,j+1);
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
public static void swap(int arr[],int a,int b) {
	int temp=arr[a];
	arr[a]=arr[b];
	arr[b]=temp;
}

}
