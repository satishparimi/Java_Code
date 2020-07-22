package com.host.java8.funInterface;

public class TestDefaultMethods implements Java8FunctionalInterface{

	public static void main(String[] args) {
		
		TestDefaultMethods test = new TestDefaultMethods();
		
		test.defaultMethod1();
		test.defaultMethod3();
		
		

	}

	@Override
	public void display() {

		System.out.println("overriding display() method");
		
	}
	
	/*@Override
	public void defaultMethod1() {
		
		System.out.println("override defaultMethod1 from Child Class");
	}*/

}
