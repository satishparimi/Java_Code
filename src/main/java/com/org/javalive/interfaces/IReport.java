package com.org.javalive.interfaces;

public interface IReport {
	
	public static void staticMethod() {
		System.out.println("static method in interface");
	}

	public default void defaultMehod() {
	System.err.println("default method in interface");	
	}
	
	public void run();
}
