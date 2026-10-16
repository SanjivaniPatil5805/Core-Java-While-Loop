package com.practice.whileloop;

public class StrongNumber {

	public static void main(String[] args) {

		int num = 145;
		int temp = num;
		int sum = 0;

		while (num >= 1) {

			int digit = num % 10;
			int i = 1, fact = 1;

			while (i <= digit) {

				fact = fact * i;
				i++;
			}

			sum += fact;
			num = num / 10;

		}

		if (sum == temp) {

			System.out.println("Strong Number");

		} else {

			System.out.println("Not Strong Number");

		}

	}

}
