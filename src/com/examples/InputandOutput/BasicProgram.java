package com.examples.InputandOutput;

import java.io.*;

public class BasicProgram {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * int x=10,y=20; int z =x+y; //System.out.println("Value of Z::::"+z);
		 * //System.err //System.in //InputStreamReader(System.in); //BufferedReader();
		 */	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a Character: ");
	
		char ch =(char)br.read();
		
		System.out.println("You Enetered Character::"+ch);
		
		
		
		
	}

}
