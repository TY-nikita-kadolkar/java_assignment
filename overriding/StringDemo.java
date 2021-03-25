package com.tyss.oops_assignment.overriding;

public class StringDemo {
	public void stringExample(String st) {

		int count[] = new int[128];
		int i;
		for (i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			count[ch]++;
		}
		for (i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println((char) i + "-->" + " " + count[i]);
		}
		System.out.println("frequency of the character is: ");
	}
}
