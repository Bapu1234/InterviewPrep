package com.util.help;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistExample {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		list1.add(3);
		list1.add(2);
		list1.add(4);
		list1.add(5);
		//list1.remove(2);
		System.out.println(list1);
		System.out.println("\nFor loop: ");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("\nFor each loop");
		for (int data : list1) {
			System.out.println(data);
		}
		System.out.println("\nUsing iterator");
		Iterator<Integer> iterator = list1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("\nUsing listiterator");
		ListIterator<Integer> listIterator = list1.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("\nUsing listiterator in reverse direction");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
