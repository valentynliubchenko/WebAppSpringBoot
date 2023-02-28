package com.valentinl;


import lombok.ToString;

@ToString
public class Person {
	private static int i;
	private String name;

	public Person() {
		i++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		Person.i = i;
	}

}
