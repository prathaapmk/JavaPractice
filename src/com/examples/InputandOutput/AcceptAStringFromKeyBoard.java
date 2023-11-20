package com.examples.InputandOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptAStringFromKeyBoard {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a name::");
		
		String name = br.readLine();
		
		//Wrapper Classes Short,Boolean,Long
		int n = Integer.parseInt(name);
		float f = Float.parseFloat(name);
		double d = Double.parseDouble(name);
		
		System.out.println("You Entered Name is::"+name);
		
		
	}

}
