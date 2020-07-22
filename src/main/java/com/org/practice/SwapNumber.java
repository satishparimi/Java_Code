package com.org.practice;

public class SwapNumber {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;

		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);

		a = a + b;

		b = a - b;

		a = a - b;

		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);

	}

}
