package com.examples.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Helooo");
		al.add("Hey");
		al.add("Heloo");
		
		al.add(2, "Hey");
		System.out.println(al);
	
		
		ListIterator lit = al.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
