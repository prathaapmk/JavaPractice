package com.examples.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet bucket = new LinkedHashSet();

		bucket.add("India");
		bucket.add("America");
		bucket.add("Australia");
		bucket.add("India2");
		bucket.add("India3");
		bucket.add("America1");
		bucket.add("Australia1");
		bucket.add("India3");
		System.out.println(bucket);
		
		Iterator it = bucket.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
