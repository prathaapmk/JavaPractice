package com.examples.strings;

public class EqualsMethod {
	
	public static void main(String[] args) {
		
		
		int i =10;
		int j=10;
		if(i==j)
		{
			System.out.println("TRUE");
		}
		//String constant POOL
		String name1 ="abc";
		String name2 = "abc";
	//	String name3="ABC";
		
	
		//Non String Constant Pool for all the new object new objects for each new string
		String str = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(name1==name2); //true
		System.out.println(name1==str); // false
		System.out.println(str==str2); //false
		
		
		System.out.println(name1.equals(name2)); //true
		System.out.println(name1.equals(str)); //true
		System.out.println(str.equals(str2));//true
		
		String s1 ="**and**";
		String s2 =s1.replace("/*", "");
		System.out.println(s2);
		
		//replace
		//replaceAll
		//starswith
		//endWith
		//Substring
		//indexOf
		//split
		//trim
		//lastIndexOf
		
		
		
	}

}
