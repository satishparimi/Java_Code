package com.host.java.constructorEx;

class A{
	
	public A() {
		System.out.println("A");
	}
}


class B extends A{
	
	public B() {
		System.out.println("B");
	}
}

class C extends B{
	
	public C() {
		
		System.out.println("C");
	}
}



public class ConstructorEx {

	public static void main(String[] args) {
		
		C c1 = new C();
		System.out.println(c1);
	
		
	}

}
