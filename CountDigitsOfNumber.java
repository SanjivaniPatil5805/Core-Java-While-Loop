package com.practice.whileloop;

public class CountDigitsOfNumber {

	public static void main(String[] args) {
		
		int num = 1234598;
		int count = 0;
		
		while(num >= 1) {
			
			num = num / 10;
			count++;
			
		}
		System.out.println("Count = "+count);
	}
	
}
