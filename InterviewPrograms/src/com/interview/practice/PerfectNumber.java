// Finding a perfect number : the sum of its positive divisors excluding the number itself

package com.interview.practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter number: ");
		int value = number.nextInt();
		int temp = 0;
		for (int i = 1; i <= value/2; i++) {
			if (value % i == 0) {
				temp = temp + i;
			}
		}
		if (temp == value) {
			System.out.println(+value + " is a perfect number");
		} else {
			System.out.println(+value + " is not a perfect number");
		}
	}
}
