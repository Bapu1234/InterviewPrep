// finding out sum of each digit in the given number using recursion logic. 

package com.interview.practice;

import java.util.Scanner;

public class MyNumSumRec {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = value.nextInt();
		int sum = 0;
		while (number != 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		System.out.println("Sum : " + sum);
	}

}
