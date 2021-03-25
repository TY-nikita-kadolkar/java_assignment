package com.tyss.oops_assignment.overriding;

public class StringApplication extends StringDemo {
	public void stringExample(String st) {
		int count[] = new int[26];
		int i;
		for (i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 65]++;
			} else if (ch >= 'a' && ch <= 'z') {
				count[ch - 97]++;
			}
		}
		for (i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println((char) (i + 65) + "-->" + " " + count[i]);
		}
		System.out.println("frequency of the alphabet character is: ");
	}
}
