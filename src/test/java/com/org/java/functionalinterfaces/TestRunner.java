package com.org.java.functionalinterfaces;

public class TestRunner {

	public static void main(String[]args) {
		
		FunInterface1 fun1 = (a,b) -> {
			return a + b;
		};
		
		System.out.println(fun1.print(2, 3));;
	}
}
