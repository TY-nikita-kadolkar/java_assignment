package com.tyss.oops_assignment.singleton;

public class TestSingleton {
public static void main(String[] args) {
	Singleton singleton = Singleton.getInstance();
	Singleton singleton1 = Singleton.getInstance();
	System.out.println(singleton == singleton1);
	
}
}
