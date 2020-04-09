package com.interview.practice;

public class SumExample {

	public static void main(String[] args) {
		int a;
		int b;
		System.out.println("1000 numbers : ");
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
		System.out.println("\nMultiple of 5: ");
		for (int j = 1; j < 1000; j++) {
			a = j % 5;
			if (a == 0) {
				System.out.println(j);
			}
		}
		System.out.println("\nOdd numbers: ");
		for (int k = 1; k <= 1000; k++) {
			b = k % 2;
			if (b != 0) {
				System.out.println(k);
			}
		}

	}

}
