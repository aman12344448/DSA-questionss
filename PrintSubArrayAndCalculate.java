package com.Arrays;

public class PrintSubArrayAndCalculate {
	
	public static void PrintSubArray(int number[]) {
		
		int totalSubArray = 0;
		
		for(int start=0; start<number.length;start++) {
			
			for(int j=start; j<number.length; j++) {
				
				for(int k=start; k<=j; k++) {
					System.out.print(number[k] + " ");
					
				}
				
				totalSubArray++;
				
				System.out.println();
				
			}
			
			System.out.println();
			
			
			
		}
		
		System.out.println(totalSubArray);
		
	}

	public static void main(String[] args) {
		
		int number [] = {2,4,6,8,10};
		PrintSubArray(number);

		

	}

}
