package com.org.practice;

class A {

	public A() {
		System.out.println("Class-A");
	}
}

class B extends A{
	
	public B() {
		
		System.out.println("Class-B");
	}
}

class C extends B{
	
	public C() {
		
		System.out.println("class-C");
	}
}



public class ConstructorTest {

	public static void main(String[] args) {
		
		//A obj1 = new C();
		B obj2 = (B) new A();

	}

}
