package com.tyss.oops_assignment.exception;

public class Mobile{
	
		public  void MobileNumber(long num)throws InValidMobileNumber {
			if(num > 10000000000L) {
				throw new InValidMobileNumber("The  invalid mobile number");
			}else {
				System.out.println("The mobile number is valid number");
			}
	}
}
