package com.practice.whileloop;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		int num = 342;
		int rev = 0;
		
		while(num >= 1) {
			
			int digit = num % 10;
			rev = rev * 10 + digit;	
			num = num / 10;
			
		}
		System.out.println(rev);
	}
	
}
