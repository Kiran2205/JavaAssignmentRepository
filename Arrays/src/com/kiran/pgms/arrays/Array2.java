package com.kiran.pgms.arrays;

public class Array2 {
	public long[] arrayGeneration2(){
		int number = SumOfLeastPossibleIndexInArray.N;
		int aValue = SumOfLeastPossibleIndexInArray.a;
		int bValue = SumOfLeastPossibleIndexInArray.b;
		int cValue = SumOfLeastPossibleIndexInArray.c;
		
		long[] b = new long[number];
		b[0] = (int) (aValue*bValue);
		for(int i=1;i<number;i++){
			 
			 b[i] = (b[i-1]*aValue*bValue*cValue + b[i-1]*aValue*bValue + b[i-1]*aValue*cValue);
		}
		return b;
	}
	

}
