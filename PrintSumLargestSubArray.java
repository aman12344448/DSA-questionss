package com.Arrays;

public class PrintSumLargestSubArray {
	
	public static void PrintLargestSum(int number[]) {
		int largest=0;
		for(int start=0; start<number.length;start++) {
			for(int j=start; j<number.length;j++) {				
				int sum=0;
				for(int k=start; k<=j; k++) {
					
					System.out.print(number[k] + " ");
					sum = sum + number[k];
				}
				if(largest<sum) {
					largest = sum;
				}
				
				System.out.println();				
			}
			
			System.out.println();
		}
		
		System.out.println(largest);
	}
	public static void main(String[] args) {
		
		int number[] = {2,4,6,8,10};
		PrintLargestSum(number);
	}
}
