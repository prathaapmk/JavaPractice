package com.examples.InputandOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingMultipleFieldsFromKeyboard {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Employee ID::  ");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Gender");
		char gender = (char)br.readLine().charAt(0);
		System.out.println("Enter Employee Name");
		String name = br.readLine();
		System.out.println("id:"+id);
		System.out.println("gender"+gender);
		System.out.println("name::"+name);
	}

}
