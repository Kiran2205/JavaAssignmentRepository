package com.kiran.pgms.arrays;

import java.util.Scanner;

public class TwoDimensionArrayMultiplication {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of row ");
		int row = scanner.nextInt();
		System.out.println("enter the number of column");
		int column = scanner.nextInt();
		int values = row * column;
		System.out.println("enter " + values +" values");
		int a[][] = new int[row][column];
		for(int i=0; i<row;i++){
			for(int j=0; j<column; j++){
				a[i][j]= scanner.nextInt();
				  
			}
	     
		}
		System.out.println("The Multidimensional Array given by user is ");
		for(int i=0; i<row;i++){
			for(int j=0; j<column;j++){
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("Enter the number to be multiplied with the multi dimensional array entered by user");
		int multiplicationNumber = scanner.nextInt();
		for(int i=0; i<row;i++){
			for(int j=0; j<column;j++){
				System.out.print(a[i][j] * multiplicationNumber +" ");
			}
			System.out.println();
		}
	}

}
