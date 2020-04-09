package com.util.help;

import java.util.ArrayList;
import java.util.List;

public class ALExanple2 {

	public static void main(String[] args) {
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(1, "Apex-1"));
		list1.add(new Student(2, "Apex-2"));
		list1.add(new Student(3, "Apex-3"));
		list1.add(new Student(4, "Apex-4"));
		System.out.println(list1);
	}

}

class Student {
	int id;
	String name;

	public Student() {
		super();

	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}