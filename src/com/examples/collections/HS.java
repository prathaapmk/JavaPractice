package com.examples.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HS {

	public static void main(String[] args) {

		HashSet bucket = new HashSet();

		bucket.add("India");
		bucket.add("America");
		bucket.add("Australia");
		bucket.add("India2");
		bucket.add("India2");
		bucket.add("America1");
		bucket.add("Australia1");
		bucket.add("India3");
		
		
		/*
		 * HashSet bucket1 = new HashSet(); bucket1.add("hey"); bucket1.add("Heloo");
		 * bucket1.add("India");
		 * 
		 * bucket.addAll(bucket1); bucket.remove("India3");
		 * System.out.println(bucket.size()); if(bucket1.contains("Pak")) {
		 * System.out.println("Contains India"); }
		 */
		
		System.out.println(bucket);
		

		Iterator it = bucket.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
