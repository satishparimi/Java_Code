package com.host.java8.defaultannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
	int paramName();
}
public class TestRun {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		TestRun test = new TestRun();
		// @Deprecated Annotation example
		test.display("Dinchu");

		// Accessing Custom Annotation
		Method m = test.getClass().getMethod("sayHello");
		MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
		System.out.println("param value is = " + myAnnotation.paramName());
	}

	@Deprecated
	public void display(String cusName) {
		System.out.println("customer name is : " + cusName);
	}

	// Apply custom annotation to method
	@MyAnnotation(paramName = 10)
	public void sayHello() {
		System.out.println("sayHello() method");
	}

}
