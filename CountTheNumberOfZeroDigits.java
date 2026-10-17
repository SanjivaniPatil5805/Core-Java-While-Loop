package com.practice.whileloop;

public class CountTheNumberOfZeroDigits {

	public static void main(String[] args) {
		
		int num = 30392009;
		int count = 0;
		
		while(num >= 1) {
			
			int digit = num % 10;
			
			if(digit == 0) {
				
				count++;
				
			}
			
			num = num / 10;
			
		}
		
		System.out.println(count);
		
	}

	
}
