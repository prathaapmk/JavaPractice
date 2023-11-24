package com.examples.stringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	
	public static void main(String[] args) throws IOException {
		
		//String str = "101";
		
		System.out.println("Enter Some String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringBuffer sr = new StringBuffer(str);
		
		System.out.println(str);
		String revers = sr.reverse().toString();
		System.out.println(revers);
		
		if(str.equals(revers))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
