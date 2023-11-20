package com.examples.InputandOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadThePersonaDetailsFromASingleLine {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Name , Age , Location, Salary::");
		
		String details = br.readLine();
		
		System.out.println("Details are::"+ details);
		StringTokenizer str = new StringTokenizer(details, " ");
		
		String s1 = str.nextToken();
		String s2 = str.nextToken();
		String s3= str.nextToken();
		String s4 = str.nextToken();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
	}

}
