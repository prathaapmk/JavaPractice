package com.examples.operators;

public class TernaryOperator {

	
	//variable = expression?expression2:expression3;
	
	
	public static void main(String[] args) {
		
		int a=10,b=20,c=30,d=40;
		
		int e = (d>c && c>a) ? d : a;
		
		System.out.println(e);
		
	}
}
