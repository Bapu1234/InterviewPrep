package com.interview.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = value.nextInt();
		for (int i = 1; i <= number/2; i++) {
			if (number % i == 0) {
				System.out.println(number + " is a prime number");
			} else {
				System.out.println(number + " is not a prime number");
			}
		}

	}
}