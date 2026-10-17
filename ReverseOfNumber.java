package com.practice.whileloop;
import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		
		int temp = num;
		int rev = 0;
		
		while(num >= 1) {
			
			int digit = num % 10;
			rev = rev * 10 + digit;	
			num = num / 10;
			
		}
		System.out.println("Original Number = "+temp);
		System.out.println("Reverse Number = "+rev);
		
		sc.close();
	}
	
	
}
