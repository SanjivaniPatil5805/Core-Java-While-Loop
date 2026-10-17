package com.practice.whileloop;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 17;
		int count = 0 , i = 1;
		
		while(i <= num) {
			
			if(num % i == 0) {
				
				count++;
				
			}
			i++;
			
		}
		
		if(count == 2) {
			
			System.out.println("Prime Number");
			
		}
		
	}
	
}
