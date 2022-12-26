package com.Arrays.EasyQuestions;

import java.util.Arrays;

//this technique is used for Sorted Array

public class RemoveDuplicatesFromArray {
	
		public static void RemoveduplicatesfromArray(int[] number) {
			int length = number.length;
			int count = 0;
			int temp [] = new int[length];
			for(int i=0; i<length-1;i++) {
				if(number[i]!=number[i+1]) {
					temp[count++] = number[i];	
				}	
			}	
			temp[count] = number[length-1];
			count++;
			
			
			for(int i=0;i<count;i++) {
				
				number[i] = temp[i];
			}
			
			for(int i=0; i<count;i++) {
				System.out.print(" " + number[i]);
			}
			
			
		}
	

	public static void main(String[] args) {
		
		int [] number = {1,1,2,3,2};
		Arrays.sort(number);
		RemoveduplicatesfromArray(number);
		
	}

}
