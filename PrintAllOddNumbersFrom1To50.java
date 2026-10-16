package com.practice.whileloop;

public class PrintAllOddNumbersFrom1To50 {

	public static void main(String[] args) {

		int num = 1;
		while (num <= 50) {

			if (num % 2 == 1) {

				System.out.println(num);

			}
			num++;
		}

	}

}
