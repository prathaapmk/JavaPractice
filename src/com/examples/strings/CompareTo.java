package com.examples.strings;

public class CompareTo {

	
	public static void main(String[] args) {
		
		String s1="ABC";
		String s2 = "abc";
		
		//ABC == ABC  or abc ==abc
		System.out.println(s1.compareToIgnoreCase(s2));
		
		// ABC abc
		System.out.println(s1.compareTo(s2));
		
	}
}
