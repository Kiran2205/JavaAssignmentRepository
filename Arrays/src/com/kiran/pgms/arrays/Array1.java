package com.kiran.pgms.arrays;

public class Array1 {
	public long[] arrayGeneration1(){
		int number = SumOfLeastPossibleIndexInArray.N;
		int aValue = SumOfLeastPossibleIndexInArray.a;
		int bValue = SumOfLeastPossibleIndexInArray.b;
		int cValue = SumOfLeastPossibleIndexInArray.c;
		
		long[] a = new long[number];
		a[0] = (int) (aValue*cValue);
		for(int i=1;i<number;i++){
			 
			 a[i] = (a[i-1]*aValue*bValue*cValue + a[i-1]*aValue*bValue + a[i-1]*aValue*cValue);
		}
		return a;

	}
	
}
