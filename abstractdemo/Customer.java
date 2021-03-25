package com.tyss.oops_assignment.abstractdemo;

public abstract class Customer {
public abstract int deposite(int money);
public abstract int withdraw(int money);
public void loan () {
	System.out.println("Take loan with interest 9%");
}
}
