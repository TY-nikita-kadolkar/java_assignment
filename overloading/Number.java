package com.tyss.oops_assignment.overloading;

public class Number {
	public void Airthmatic(byte a, byte b) {
		int sres = a + b;
		int subres = a - b;
		int mres = a * b;
		int dres = a / b;
		System.out.println("sum: " + sres);
		System.out.println("sub: " + subres);
		System.out.println("multi: " + mres);
		System.out.println("div: " + dres);
	}

	public void Airthmatic(long a, long b) {
		long sres = a + b;
		long subres = a - b;
		long mres = a * b;
		long dres = a / b;
		System.out.println("sum: " + sres);
		System.out.println("sub: " + subres);
		System.out.println("multi: " + mres);
		System.out.println("div: " + dres);
	}

	public void Airthmatic(int a, int b) {
		long sres = a + b;
		long subres = a - b;
		long mres = a * b;
		long dres = a / b;
		System.out.println("sum: " + sres);
		System.out.println("sub: " + subres);
		System.out.println("multi: " + mres);
		System.out.println("div: " + dres);
	}

	public void Airthmatic(double a, double b) {
		double sres = a + b;
		double subres = a - b;
		double mres = a * b;
		double dres = a / b;
		System.out.println("sum: " + sres);
		System.out.println("sub: " + subres);
		System.out.println("multi: " + mres);
		System.out.println("div: " + dres);
	}
}
