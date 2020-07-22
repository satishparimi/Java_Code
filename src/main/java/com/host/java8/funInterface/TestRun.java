package com.host.java8.funInterface;

public class TestRun {

	public static void main(String[] args) {

		Java8FunctionalInterface funInterface = () ->{
			
			System.out.println("sending Text1 to display() method");
			System.out.println("sending Text2 to display() method");
			System.out.println("sending Text3 to display() method");
			System.out.println("sending Text4 to display() method");
		};

		funInterface.display();
		

		Java8FunInterfaceCalculator calc = (a,b) -> {
			
			return a+b;
		};
		
		System.out.println(calc.calculate(10, 12));;
		
		TestRun java8 = new TestRun();
		
		
	}

}
