package com.practice.whileloop;

public class LargestDigitInNumber {

 public static void main(String[] args) {
	
	 
	 int num = 3645;
	 int max = 0;
	 
	 while(num >= 1) {
		 
		 int digit = num % 10;
		 
		 if(digit > max) {
			 
			 max = digit;
			 
		 }
		 
		 num = num / 10;
		 
	 }
	 
	 System.out.println("Largest Digit = "+max);
	 
}
	
}
