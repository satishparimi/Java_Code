package com.host.java8.optional;

import java.util.Optional;

public class TestRun {

	static String value = "test";
	
	public static void main(String[]args) {
		
		Optional<String> check = Optional.ofNullable(value);
		
		if(check.isPresent()) {
			System.out.println("String value is : "+value);
		}else {
			System.out.println("string is empty");
		}
	}

}
