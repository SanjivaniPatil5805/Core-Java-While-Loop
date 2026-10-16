package com.practice.whileloop;

public class SumOfNumbersFrom1To20 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 20) {
			
			sum += num;
			num++;
			
		}
		System.out.println("Sum of Numbers From 1 to 20 : "+sum);
		
	}
	
}
