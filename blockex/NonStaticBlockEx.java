package com.tyss.oops_assignment.blockex;

public class NonStaticBlockEx {
	int id;
	String name;
	{
		id =1203;
		System.out.println("first non static");
	}
	{
		name = "samidha";
		System.out.println("second non static");
	}
	{
		System.out.println("third non static");
	}
	{
		System.out.println("fourth non static");
	}

}// end of the class