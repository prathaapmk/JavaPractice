package com.examples.exceptions;

public class HandlingViaThrows {

	public static void main(String[] args) {

		try {

			int j[] = { 10 };
			for (int k = 0; k <= j.length + 1; k++) {
				System.out.println(j[k]);
			}
			// Statements
			int i = 10;
			System.out.println(i / 0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}catch (NullPointerException e) {
			// TODO: handle exception
		}catch (Exception e) {
		
			System.out.println( e.getMessage());
		}finally
		{
			System.out.println("Definately this Statement will execute at any cost");
		}

	}

}
