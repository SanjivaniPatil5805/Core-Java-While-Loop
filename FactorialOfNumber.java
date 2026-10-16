package com.practice.whileloop;

public class FactorialOfNumber {

	public static void main(String[] args) {

		int num = 4;
		int fact = 1, i = 1;

		while (i <= num) {

			fact = fact * i;
			i++;

		}

		System.out.println(fact);

	}

}
