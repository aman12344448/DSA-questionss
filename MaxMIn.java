package com.Arrays;

public class MaxMIn {
	
	public static void main(String [] args) {
		int arr1 [] = {1,10,3,8};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i] > max) {
				
				max = arr1[i];
			}
		}
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] < min) {
				
				min = arr1[i];
				
			}
		}
		
		
		System.out.println("The min value is " + min);
		System.out.println("The max value is " + max);
		
		
		
	}

}
