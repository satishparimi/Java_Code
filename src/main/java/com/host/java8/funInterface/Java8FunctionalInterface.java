package com.host.java8.funInterface;

@FunctionalInterface
public interface Java8FunctionalInterface {

	public void display();

	default public void defaultMethod1() {
		System.out.println(" default Method 1 ");
	}

	default public void defaultMethod2() {
		System.out.println(" default Method 2");
	}
	
	default public void defaultMethod3() {
		System.out.println(" default Method 3");
	}

	static public void staticMethod1() {
		System.out.println(" Static method 1 ");
	}

	static public void staticMethod2() {
		System.out.println(" Static method 2");
	}
}
