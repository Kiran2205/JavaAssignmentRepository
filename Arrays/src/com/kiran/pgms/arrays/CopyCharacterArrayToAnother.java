package com.kiran.pgms.arrays;

public class CopyCharacterArrayToAnother {
	public static char[] a = new char[] {'e','f'};
	public static char[] b = new char[a.length];
	public static void main(String args[]){
		for(int i=0 ;i<a.length;i++){
			b[i]=a[i];
			System.out.println(b[i]);		
		}
		
	}
	
}
