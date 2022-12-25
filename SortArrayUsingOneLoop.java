package com.Arrays;

public class SortArrayUsingOneLoop {
	
	public static void SortArrayusingoneloop(int number[]) {
		
		//Sort the array
		
		for(int i=0; i<number.length-1;i++) {
			
			if(number[i] > number[i+1]) {
				
				int temp = number[i+1];
				number[i+1] = number[i];
				number[i] = temp;
				
				i=-1;
			}
		}
		for(int num : number) {
			System.out.print(num + " ");
		}
		
		
	}
	
		
		
	public static void main(String[] args) {	
		int number[] = {1,2,0,0,7,9};
		SortArrayusingoneloop(number);
	}
}
