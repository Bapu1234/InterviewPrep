// reversing a number using user input

package com.interview.practice;

import java.util.Scanner;

public class ReverseExample {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter number: ");
		int value = number.nextInt();
		int reverse = 0;
		while (value != 0) {
			reverse = (reverse * 10) + (value % 10);
			value = value / 10;
		}
		System.out.println("Result : " + reverse);
	}
}
