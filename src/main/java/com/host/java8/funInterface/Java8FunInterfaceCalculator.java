package com.host.java8.funInterface;

@FunctionalInterface
public interface Java8FunInterfaceCalculator {
	
	//by default static-final variables
	// SAM - Interface having only one abstract method
	// We use functional interface to avoid bulky annonymous class implementaion
	//We allow default method to add any specific functionality independent which avoind implementation in child classes
	
	
	public int calculate(int a, int b);

}
