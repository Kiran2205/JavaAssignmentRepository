package com.kiran.pgms.arrays;
import java.util.Scanner;



public class SumOfLeastPossibleIndexInArray {
	public static int a,b,c;
	public static int N;
	public static long s1,s2;	
	
	public static void main(String args[]){		
		System.out.println("enter the values for a,b and c");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		System.out.println("enter the value of N");
		N = scanner.nextInt();
		Array1 array1 = new Array1();
		long[] a ; 
		a=array1.arrayGeneration1();
		for(int i=0 ; i<N; i++){
			System.out.println("A["+i+"] = "+a[i] + "");
					
		}
		Array2 array2 = new Array2();
		long b[];
		b=array2.arrayGeneration2();
		for(int i=0 ; i<N; i++){
			System.out.println("B["+i+"] = "+b[i] + "");
					
		}
		
	    s1 = a[0]+b[1];
		s2 = b[1]+a[0];
		if ((s1>s2)){
			System.out.println("Sum of the least possible index is "+s2);
		}
		else
		{
			System.out.println("Sum of the least possible index is "+s1);
		}
	}
	
	

}
