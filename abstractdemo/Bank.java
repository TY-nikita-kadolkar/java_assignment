package com.tyss.oops_assignment.abstractdemo;

public class Bank extends Customer{
	int bal = 2000;
	@Override
	public int deposite(int money) {
		int deposite = bal + money;
		System.out.println("After deposite balance is RS: " +deposite);
		return deposite;
	}

	@Override
	public int withdraw(int money) {
		int withdraw = 0;
		if(bal < money) {
			System.out.println("Low balance...");
		}else {
			 withdraw = bal - money;
			System.out.println("After withdraw balance is RS: "+withdraw);
		}
		return withdraw;
	}
	

}