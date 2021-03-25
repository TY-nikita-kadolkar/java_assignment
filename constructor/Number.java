package com.tyss.oops_assignment.constructor;

public class Number {
	public Number() {
		System.out.println("default constructor");
	}
	public Number(int a) {
		this();
		System.out.println("one parameter constructor");
	}
	public Number (int a, int b) {
		this(a);
		System.out.println("two parameter constructor");
	}
}
