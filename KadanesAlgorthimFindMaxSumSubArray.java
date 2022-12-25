//Kadanes algorithm says that if we encounter then current sum to be negative then make that number zero 

package com.Arrays;

public class KadanesAlgorthimFindMaxSumSubArray {
	
	private static void kadeniasAlogrithm(int[] number) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<number.length;i++) {
			currSum = currSum + number[i];
			if(currSum < 0) {
				currSum = 0;
			}
			maxSum = Math.max(maxSum, currSum);
		}
		System.out.println("Max sum Of subArray " + maxSum);
	}
	public static void main(String[] args) {
		int number[] = {-2,-3,4,-1,-2,1,5,-3};
		kadeniasAlogrithm(number);
	}
}
