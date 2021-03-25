package com.tyss.oops_assignment.constructor;

public class Vegetables {
	public Vegetables() {
		System.out.println("This is default constructor");
	}
	
	public Vegetables(int a) {
		System.out.println("Prize of the veggi is: " +a+ " rs");
	}
	
	public Vegetables(String s) {
		System.out.println(" Name of the veggi is: "+s);
	}
	
	public Vegetables (double qty) {
		System.out.println("Quantity of the veggi is: "+qty);
	}
}// end class
