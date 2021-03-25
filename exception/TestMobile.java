package com.tyss.oops_assignment.exception;

public class TestMobile {
public static void main(String[] args) {
	Mobile m = new Mobile();
	
	try {
		m.MobileNumber(9591517138L);
	} catch (InValidMobileNumber e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
