package com.examples.stringbufferex;

public class StringBufferExample1 {
	
	public static void main(String[] args) {
		
		StringBuffer sbr = new StringBuffer("Helooo");
		System.out.println(sbr);
		
		
		StringBuffer fgh = new StringBuffer();
		
		fgh.append("Heloooo hii");
		
		System.out.println(fgh);
		
		StringBuffer a = new StringBuffer("Intelligent Person");
		a.insert(11, " Young");
		//System.out.println(a);
		//int n = a.indexOf("ll");
		//System.out.println(n);
		
		System.out.println(a.reverse());

		
	}

}
