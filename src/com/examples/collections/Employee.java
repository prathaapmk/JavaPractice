package com.examples.collections;

public class Employee {
	
	int id;
	String name;
	
	public Employee(int i, String s) {

		id=i;
		name=s;
	}
	
	void displayOut()
	{
		System.out.println(id+"\t"+name);
	}

}
