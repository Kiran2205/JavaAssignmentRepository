package com.kiran.pgms.arrays;
import java.util.Scanner;


public class MaxArrayMember {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int arraySize = scanner.nextInt();
		System.out.println("enter the array elements");
		int[]a = new int[arraySize];
		for(int i=0;i<arraySize;i++)
		{
			a[i]=scanner.nextInt();
			
		}
		for(int i=0;i<arraySize;i++){
			System.out.print(a[i] +" ");
		}
		int max = a[0];		
		for(int i=0;i<a.length;i++){
			if(a[i]> max){
				
				max = a[i];
			}
			
		}
		System.out.println("");
		System.out.println("The maximum number in the given array is "+max );
	}

}

