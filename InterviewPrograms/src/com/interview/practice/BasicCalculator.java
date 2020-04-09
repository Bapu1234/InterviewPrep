package com.interview.practice;

public class BasicCalculator {

	public static void main(String[] args) {
		Calculator calculator = new CalculatorImpl();
		int addition = calculator.add(10, 23);
		System.out.println("Addition: " + addition);
		int subtraction = calculator.subtract(56, 35);
		System.out.println("Subtraction: " + subtraction);
		int multiplication = calculator.multiply(21, 32);
		System.out.println("Multiplication: " + multiplication);
		int division = calculator.divide(99, 3);
		System.out.println("Division: " + division);
	}
}

interface Calculator {
	int add(int a, int b);

	int subtract(int a, int b);

	int multiply(int a, int b);

	int divide(int a, int b);
}

class CalculatorImpl implements Calculator {

	@Override
	public int add(int a, int b) {

		return a + b;
	}

	@Override
	public int subtract(int a, int b) {

		return a - b;
	}

	@Override
	public int multiply(int a, int b) {

		return a * b;
	}

	@Override
	public int divide(int a, int b) {

		return a / b;
	}

}
