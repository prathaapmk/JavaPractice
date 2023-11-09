package com.examples.operators;

public class MemberORDotOperator {

	int k = 10;

	public static void main(String[] args) {
		
		MemberORDotOperator memberORDotOperator = new MemberORDotOperator();
		RelationOperators ro = new RelationOperators();
		
		boolean checkInstanceOfmember = memberORDotOperator instanceof MemberORDotOperator;
		boolean checkInstanceOfrelation = ro instanceof RelationOperators;
		
		System.out.println(checkInstanceOfmember);
		System.out.println(checkInstanceOfrelation);
		
		System.out.println(memberORDotOperator.k);
		memberORDotOperator.m1();
		
		String str = "                          XYZ                 ";
		System.out.println(str);
		System.out.println(str.trim());

	}

	public void m1() {

		System.out.println("I am from m1");
	}
}
