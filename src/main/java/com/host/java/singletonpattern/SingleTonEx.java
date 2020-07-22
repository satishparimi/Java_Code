package com.host.java.singletonpattern;

public class SingleTonEx {

	/**
	 * Private Static member
	 * private constructor: to prevent instantiation from outside of the class
	 * static factory method to return isntance 
	 */
	
	private static SingleTonEx obj ;
	
	private SingleTonEx() {
		
	}
	
	public static SingleTonEx getInstance() {
		
		if(obj == null) {
			
			synchronized (SingleTonEx.class) {
				
				obj = new SingleTonEx();
			}
		}
		
		return obj;
	}
}
