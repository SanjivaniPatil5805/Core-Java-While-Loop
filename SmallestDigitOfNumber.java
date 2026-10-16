package com.practice.whileloop;

public class SmallestDigitOfNumber {

	public static void main(String[] args) {

		int num = 4539;
		int min = 9;

		while (num >= 1) {

			int digit = num % 10;

			if (digit < min) {

				min = digit;

			}

			num = num / 10;

		}
		
		System.out.println("Smallest Digit = "+min);

	}

}
