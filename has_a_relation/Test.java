package com.tyss.oops_assignment.has_a_relation;

public class Test {
	public static void main(String[] args) {
		Address ad = new Address (101,"btm","Banglore", 15245);
		Employee emp =  new Employee (12,"nikita", ad);
		System.out.println("Emp_id"+emp.empid);
		System.out.println("Emp_name"+emp.name);
		System.out.println("doorno"+ad.doorNo);
		System.out.println("area"+ad.area);
		System.out.println("city"+ ad.city);
		System.out.println("pincode"+ad.pincode);
		
	}

	}
