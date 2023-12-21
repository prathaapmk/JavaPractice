package com.examples.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhyNotArrays {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Employee arr[] = new Employee[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter ID");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter Name");
			String name = br.readLine();
			arr[i]=new Employee(id, name);
		}
		System.out.println("\n The employee Data");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].displayOut();
		}
	}

}
