package com.practice.whileloop;
import java.util.Scanner;

public class CountFrequencyOfDigit {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		
		System.out.println("Enter digit to count it's frequency : ");
		int frequencyCountDigit = sc.nextInt();
		
		int count = 0;

		while(num >= 1) {
			
			int digit = num % 10;
			
			if(digit == frequencyCountDigit) {
				
				count++;
				
			}
			
			num = num / 10;	
		}
		
		System.out.println("Frequncy of digit "+ frequencyCountDigit+" = "+count);
		
		sc.close();
		
	}
	
}
