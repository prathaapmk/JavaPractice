package com.examples.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SampleStringExample {

	public static void main(String[] args) throws IOException {

		/*
		 * // int i=10,k=20; BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); System.out.println("Enter i, k,j,m");
		 * StringTokenizer st = new StringTokenizer(br.readLine(), ","); int i =
		 * Integer.parseInt(st.nextToken()); int k = Integer.parseInt(st.nextToken());
		 * int j = Integer.parseInt(st.nextToken()); int m =
		 * Integer.parseInt(st.nextToken());
		 * 
		 * int l = multiplication(i,k); int z = multiplication(j, m);
		 * 
		 * }
		 * 
		 * 
		 * public static int multiplication(int i, int k) { int l = i*k;
		 * System.out.println(l); return l; }
		 */
		
		
		String s;
		
		s= "Helouyt";
	String uppercase=	s.toUpperCase();
	String lowercase=	s.toLowerCase();
	System.out.println(uppercase);
	System.out.println(lowercase);
		
		String str = "Heyyyy";
		
		String str2 = new String("Heow are you?");
		
		
		int lengthOfS = s.length();
		System.out.println(lengthOfS);
		String checkConcat = s.concat(str).concat(str2);
		System.out.println(checkConcat);
		
		char charat5 = checkConcat.charAt(1);
		System.out.println(charat5);
		
		
	}
}
