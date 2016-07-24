package com.kiran.pgms.arrays;

import java.util.Scanner;

public class SecondLargestInArray {
public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size = scanner.nextInt();
	int [] a = new int[size];
	System.out.println("enter " +size +" Values for an Array");
	for(int i=0; i<size;i++){
		a[i]= scanner.nextInt();
	}
	int firstLarge = a[0];
	int secondLarge = 0;
	for(int i=1; i<size ; i++){
		if(firstLarge < a[i]){
			secondLarge = firstLarge;
			firstLarge = a[i];
		}
		else if(secondLarge < a[i]){
			secondLarge = a[i];
		}
		
	}
	System.out.println("The First largest element in an Array is "+firstLarge);
	System.out.println("The second largest element in an Array is "+secondLarge);
	
	
	
}
}