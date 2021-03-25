package com.tyss.oops_assignment.tostringmethod;

public class TestBank {
public static void main(String[] args) {
	Bank b = new Bank("bank of baroda","JIKDLS012",590001);
	//System.out.println(b);// we are without override the toString method then it give fully qualified name.
	System.out.println(b);
}
}
