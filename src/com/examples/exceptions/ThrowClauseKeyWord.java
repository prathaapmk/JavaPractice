package com.examples.exceptions;

public class ThrowClauseKeyWord {
	static void demo() {
		try {

			System.out.println("Inside Demo");
			throw new NullPointerException("Exception Data");
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
