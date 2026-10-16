package com.practice.whileloop;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int num = 242;
		int temp = num;
		int rev = 0;
		
		while(num >= 1) {
			
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
		}
		if(temp == rev) {
			
			System.out.println("Palindrom Number");
			
		}else {
			
			System.out.println("Not Palindrom Number");
			
		}
		
	}
	
}
