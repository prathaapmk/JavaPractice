package com.examples.oops.methods;

public class MethodwithParamsandWithoutParams {

	MethodwithParamsandWithoutParams() {
		System.out.println("I am from Constructor");
	}
	 
	private double num1,num2;
	MethodwithParamsandWithoutParams(double x, double y) {
		num1 = x;
		num2 = y;
	}
	
	void sum()
	{
		double result = num1+num2;
		System.out.println("result"+result);
		//return result;
		
	}
	
	double sum(double x)
	{
		double result = x;
		System.out.println("result"+result);
		return result;
		
	}
	
	double sum(double x, double y)
	{
		double result = x+y;
		System.out.println("result"+result);
		return result;
		
	}
}

