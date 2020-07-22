package com.host.java.practiceLevel_One;

public class SwapANumber {

	public static void main(String[] args) {
		
		swapANumber(2, 3);

	}
	
	public static void swapANumber(int x, int y) {
		
		int a = x;
		
		int b = y;
		
		System.out.println("Before Swapping");
		System.out.println("a is : "+a);
		System.out.println("b is : "+b);
		
		a = a + b;
		
		b = a - b;
		
		a = a - b;
		
		System.out.println("After Swapping");
		System.out.println("a is : "+a);
		System.out.println("b is : "+b);
	}

}
