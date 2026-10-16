package com.practice.whileloop;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		
		int num = 324;
		int sum = 0;
		
		while(num >= 1) {
			
			int digit = num % 10;
			sum += digit;
			num = num / 10;
			
		}
		System.out.println(sum);
		
	}
	
}
