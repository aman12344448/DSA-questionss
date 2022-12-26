package com.Arrays.EasyQuestions;

import java.util.Arrays;

public class FrquencyCalculateArray {
	
	public static void FreqcalArr(int [] number) {
		
		int length = number.length;
		boolean visited[] = new boolean[length];
		Arrays.fill(visited, false);
		
		for(int i=0;i<length;i++) {
			
			if(visited[i]== true) {
				continue;
			}
			
			int count = 1;
			
			for(int j=i+1;j<length;j++) {
				
				if(number[i] == number[j]) {
					
					visited[j] = true;
					count++;
				}
			}
			
			System.out.println(number[i] + " " + count);
		}
		
		
	}


	public static void main(String[] args) {	
		
		int number[] = {10,20,10,20,30,50,10,20,20};
		FreqcalArr(number);
		

	}

}
