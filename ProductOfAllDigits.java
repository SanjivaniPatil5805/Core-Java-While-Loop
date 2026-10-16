package com.practice.whileloop;

public class ProductOfAllDigits {

	public static void main(String[] args) {

		int num = 324;
		int mul = 1;

		while (num >= 1) {

			int digit = num % 10;
			mul *= digit;
			num = num / 10;

		}
		System.out.println(mul);

	}

}
