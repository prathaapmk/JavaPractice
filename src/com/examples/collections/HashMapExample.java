package com.examples.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	
	
public static void main(String[] args) {
	
	HashMap<Integer,String> hm = new HashMap<Integer, String>();
	hm.put(1, "Madhavi");
	hm.put(2, "Naga");
	hm.put(3, "Sandhya");
	hm.put(null, "Test");
	hm.put(1, "Madhav");
	hm.put(4, "Madhavi");
	hm.putIfAbsent(3, "Sandy");
	
	System.out.println(hm);
	
	  Set<Integer> set = new HashSet<Integer>(); 
	  set = hm.keySet();
	  System.out.println(set);
	  
	  for (Iterator iterator = set.iterator(); iterator.hasNext();) {
		Integer integer = (Integer) iterator.next();
		
	}
	  for (Integer integer : set) {
		System.out.println(integer);
	}
	 
	
	List<String> ls = new ArrayList<String>();
	ls.addAll(hm.values()) ;
	System.out.println(ls);
	for (Iterator iterator = ls.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		
	}
	for (String string : ls) {
		System.out.println(string);
	}

	
//By Using For Each Loop
	for (Map.Entry<Integer, String> entry : hm.entrySet()) {
		System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
	}
	
	
	//By Using Iterator 
	
	 Iterator<Map.Entry<Integer, String>> iterator = hm.entrySet().iterator();

	    while (iterator.hasNext()) {
	        Map.Entry<Integer, String> entry = iterator.next();
	        Integer key = entry.getKey();
	        String value = entry.getValue();
	        System.out.println("Key=" + key + ", Value=" + value);
	    }
 
}

}
