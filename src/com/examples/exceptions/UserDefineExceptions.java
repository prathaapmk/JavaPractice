package com.examples.exceptions;

public class UserDefineExceptions extends Exception{
	
	UserDefineExceptions(String str)
	{
		super(str);
	}
	
	private static int accno[]= {100,200,300,400};
	private static String name[]= {"abc","xyz","ijk","mno"};
	
	private static double bal[] = {1000,1500,400,5000.50};
	
	public static void main(String[] args) throws UserDefineExceptions {
		
		try {
		
			System.out.println("AccNo"+"\t"+"Customer"+"\t"+"Balance");
			for(int i=0;i<4;i++) {
			
				System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
			if(bal[i]<500)
			{
				
				UserDefineExceptions ude = new UserDefineExceptions("Balance Amount is Very Less");
				throw ude;
			}
			}
		} catch (UserDefineExceptions e) {
			// TODO: handle exception
			//e.printStackTrace();
			throw e;
		}
	}
}
