package com.util.help;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetExample {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("a");
		set1.add("d");
		set1.add("a");
		set1.add("c");
		System.out.println(set1);

		Set<String> linkedset1 = new LinkedHashSet<String>();
		linkedset1.add("a");
		linkedset1.add("d");
		linkedset1.add("a");
		linkedset1.add("c");
		System.out.println(linkedset1);

		Set<String> tressset1 = new TreeSet<String>();
		tressset1.add("a");
		tressset1.add("d");
		tressset1.add("a");
		tressset1.add("c");
		System.out.println(tressset1);
	}

}
