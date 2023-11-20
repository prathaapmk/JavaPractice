package com.examples.InputandOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArthematicalOperationswithBufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Values of a , b with comma as Delimeter");
		
		String values = br.readLine();
		String comma=",";
		
		StringTokenizer str = new StringTokenizer(values, comma);
		String s1 = str.nextToken();
		String s2 = str.nextToken();
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println("Result of Addition::"+ (a+b));
		System.out.println("Result of Multiplication::"+ (a*b));
		System.out.println("Result of Subtraction::"+ (a-b));
	}

}
