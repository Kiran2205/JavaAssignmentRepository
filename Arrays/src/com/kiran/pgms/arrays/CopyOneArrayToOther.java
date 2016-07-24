package com.kiran.pgms.arrays;

import java.util.Arrays;

public class CopyOneArrayToOther {
	
	public static void main(String args[]){
		
		  int[] a = new int[]{12,23,34,45,56,67};
		  int[] b = new int[a.length];
		  int[] c = new int[a.length];
		System.out.print("{");
		for(int i=0;i<a.length;i++){
			b[i] = a[i];
			//System.out.println("B["+i+"] = "+b);
			System.out.print(b[i]+",");
		}
		System.out.print("}");
		System.out.println(Arrays.toString(b));
		for(int i=0;i<a.length; i++){
			
			c[i] = a[i]+b[i];
		}
		System.out.println(Arrays.toString(c));
	}
	
	
}
