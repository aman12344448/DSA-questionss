package com.Arrays;

public class KeyElementBinarySearch {
	
	public static  int BinarySearch(int number[] , int key) {
		
		int start = 0;
		int end = number.length-1;
		while(start<=end) {
			
			int mid = (start+end)/2;
			
			if(number[mid] == key) {
				return mid;
			}
			
			else if(number[mid] < key) {
				start = mid+1;
			}
			
			else {
				end = mid-1;
			}
		}
		
		
		
		return -1;
	}
	
	

	public static void main(String[] args) {
		
		int number[] = {1,2,3,4,7,9,10};
		int key = 11;
		System.out.println(BinarySearch(number,key));

	}

}
