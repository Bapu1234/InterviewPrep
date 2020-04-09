package com.interview.practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int number1 = 0, number2 = 1, number3, count;
		System.out.println("Enter the count: ");
		count = number.nextInt();
		System.out.print(+number1 + " " + number2);
		for (int i = 2; i <= count; ++i) {
			number3 = number1 + number2;
			System.out.print(" " + number3);
			number1 = number2;
			number2 = number3;

		}

	}

}
