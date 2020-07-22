package com.org.practice;

enum Test{
	
	Sanity,Smoke,Regression;
}


public class EnumEx {

	public static void main(String[] args) {
		
		Test testtype = Test.Regression;
	
		System.out.println(testtype);

	}

}
