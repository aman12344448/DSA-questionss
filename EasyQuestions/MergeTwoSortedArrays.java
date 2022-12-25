package com.Arrays.EasyQuestions;

import com.Arrays.SortArrayUsingOneLoop;

public class MergeTwoSortedArrays {
	
	public static void MergeTwoSortArrays(int num1[],int num2[]) {
		
		
		
//		int length = num1.length + num2.length;
//		int num3[] = new int[length];
//		
//		for(int i=0; i<num1.length;i++) {
//			num3[i] = num1[i];
//		}
//		
//		for(int i=0;i<num2.length;i++) {
//			num3[num1.length+i] = num2[i];
//		}
//	
//		
//		for(int num : num3) {
//			System.out.print(" " + num);
//		}
		
		int length = num1.length+num2.length;
		int num3[] = new int[length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<num1.length) {
			num3[k] = num1[i];
			i++;
			k++;
		}
		
		while(j<num2.length) {
			num3[k] = num2[j];
			k++;
			j++;
		}
		
		for(int num : num3) {
			System.out.print(" " + num);
		}	
	}
	
	

	public static void main(String[] args) {
		int num1 [] = {1,2,4,3};
		int num2 [] = {5,6,8,7,9};
		SortArrayUsingOneLoop.SortArrayusingoneloop(num1);
		SortArrayUsingOneLoop.SortArrayusingoneloop(num2);
		MergeTwoSortArrays(num1, num2);
	}
}
