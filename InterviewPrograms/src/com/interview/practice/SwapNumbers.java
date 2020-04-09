package com.interview.practice;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.println("Before Swapping");
		System.out.println("x : " + x + " y : " + y);
		x = x - y;
		y = x + y;
		System.out.println("After Swapping ");
		System.out.println("x : " + x + " y : " + y);
	}

}
