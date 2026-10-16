package com.practice.whileloop;

public class SumOfAllEvenNumbersFrom1To50 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 50) {
			
			if(num % 2 == 0) {
				
				sum += num;
		
			}
			num++;
		}
	
		System.out.println("Sum Of All Even Numbers From 1 to 50 : "+sum);
		
	}
	
}
