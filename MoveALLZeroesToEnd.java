package com.Arrays;

public class MoveALLZeroesToEnd {
	
	public static void Moveallzeroestoend(int number[]) {
		
		int count=0;
		
		int numb2 [] = new int[number.length];
		
		
		for(int i=0; i<number.length;i++) {
			
			if(number[i] != 0) {
				
				numb2[count] = number[i];
				
				count++;
			}
			
		}
		
		for(int num : numb2) {
			System.out.print(num + " ");
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		int number[] = {0};
		Moveallzeroestoend(number);

	}

}
