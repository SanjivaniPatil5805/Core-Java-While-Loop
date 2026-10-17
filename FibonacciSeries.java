package com.practice.whileloop;


public class FibonacciSeries {

	public static void main(String[] args) {
		
	int num1 = 0;
	int num2 = 1;
	int num3;
	int terms = 1;
	
	System.out.print(num1 + " "+num2+ " ");
	
	while(terms <= 10) {
		
		num3 = num1 + num2;		
		num1 = num2 ;
		num2 = num3 ;
		
		System.out.print(num3+ " ");
		
		terms++;
		
	}
	
		
	}
	
}
