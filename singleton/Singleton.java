package com.tyss.oops_assignment.singleton;

public class Singleton {
private static Singleton singleton = null;
private Singleton() {
	
}
public static Singleton getInstance() {
	if(singleton == null) {
		return singleton;
	}else {
		return singleton;
	}
}
}
