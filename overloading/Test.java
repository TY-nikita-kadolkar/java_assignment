package com.tyss.oops_assignment.overloading;

public class Test {
public static void main(String[] args) {
	Number n = new Number();
	System.out.println("double parameter operation");
	n.Airthmatic(25.6, 63.2);
	System.out.println("***************************");
	System.out.println("byte parameter operation");
	n.Airthmatic(127, 69);
	System.out.println("****************************");
	System.out.println("long parameter operation");
	n.Airthmatic(123654, 865412);
	System.out.println("****************************");
	System.out.println("int parameter operation");
	n.Airthmatic(532, 632);
}
}
