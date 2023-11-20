package com.examples.InputandOutput;

public class PrintFExamples {

	public static void main(String[] args) {

		// %s - String
		// %c - char
		// %d - decimal
		// %f - float
		// %o -octal
		// %b,%B- Boolean
		// %x,%X - Hexadecimal
		// %e,%E- Scientific Notation
		// %n - New Line Character
		
		
		String s1 ="Helloo";
		int n =39;
		float f = 15.1234f;
		System.out.printf("String =%s%nnum=%d%nhexa decimal =%x%nfloat=%f",s1,n,n,f);
		
		String str = String.format("n=%d%ns1=%s",n,s1);
		System.out.println(str);
	}

}
