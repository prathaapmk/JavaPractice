package com.examples.controlstatements;

public class DoWhileStatement {
	
	/*
	 * do { statements } while(condition)
	 */
	
	public static void main(String[] args) {
		
		int x=1;
		
		do
		{
			System.out.println(x);
			x++; //x =x+1;
		}while(x<=10);
	}
}
