package com.util.help;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> list1 = new Vector<Integer>();
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(4);
		Enumeration<Integer> elements = list1.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}

	}

}
