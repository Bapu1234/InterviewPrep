// Finding first two maximum number in an array
package com.interview.practice;

public class TwoMaxNumbers {

	public static void main(String[] args) {
		int num[] = { 4, 24, 8, 6, 2, 9};
		int maxone = 0;
		int maxtwo = 0;
		for (int i : num) {
			if (maxone < i) {
				maxtwo = maxone;
				maxone = i;
			} else if (maxtwo < i) {
				maxtwo = i;
			}
		}
		System.out.println("First maximum number: " + maxone);
		System.out.println("Second maximum number: " + maxtwo);
	}

}
