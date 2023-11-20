package com.examples.InputandOutput;

import java.util.Scanner;

public class ScannerExampleOne {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the id name Sal:");
		
		Scanner sc = new Scanner(System.in);
		
		int id =sc.nextInt();
		String name = sc.next();
		float sal = sc.nextFloat();
		
		System.out.println(id +"::::"+name+"::::"+sal);
		
		System.out.printf("Salary =%f",sal);
		
		
		
	}

}
