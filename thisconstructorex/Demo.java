package com.tyss.oops_assignment.thisconstructorex;

public class Demo {
	public Demo() {
		this(10);
	System.out.println("default constructor in demo");
	}
	 public Demo (int i) {
		 this(21,36.96);	
		 System.out.println("para constructor in demo");
	 }
	 public Demo (int x, double y) {
		 System.out.println("two para constructor");
	 }
	}