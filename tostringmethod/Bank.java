package com.tyss.oops_assignment.tostringmethod;

public class Bank {
public String bankname;
public String ifsccode;
public int pincode;

@Override
public String toString() {
	return "Bank [ bankname = "+bankname + ",ifsccode = "+ ifsccode+ ",pincode"+pincode +"]";

}

public Bank(String bankname, String ifsccode, int pincode) {
	super();
	this.bankname = bankname;
	this.ifsccode = ifsccode;
	this.pincode = pincode;
}


}
