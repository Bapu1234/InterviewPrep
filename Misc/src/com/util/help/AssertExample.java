package com.util.help;

import java.util.Scanner;

public class AssertExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter age: ");
		int value = scanner.nextInt();
		assert value >= 18 : "Not Valid";
		System.out.println("Value : "+value);
	}

}
