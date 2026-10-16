package com.practice.whileloop;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int num = 28;
		int sum = 0 , i = 1;
		
		while(i < num) {
			
			if(num % i == 0) {
				
				sum += i;
				
			}
			i++;
			
		}
		if(sum == num) {
			
			System.out.println("Perfect Number");
			
		} else {
			
			System.out.println("Not Prefect Number");
		}
		
	}
	
}
