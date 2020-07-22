package com.host.java.strings;

import java.text.DecimalFormat;

public class IntToString {

	public static void main(String[] args) {

		System.out.println(convertIntToString1(3256));

	}

	public static String convertIntToString1(int n) {

		String res = Integer.toString(n);

		return res;

	}

	public static String convertIntToString2(int n) {

		String res = String.valueOf(n);
		return res;

	}

	public static String convertToString3(int n) {

		Integer obj = new Integer(n);
		String str = obj.toString();
		return str;
	}
	
	public static String convertToString4(int n) {
		
		DecimalFormat df = new DecimalFormat("#");
		
		String str = df.format(n);
		
		return str;
		
	}
	
	public static String convertToString5(int n) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(n);
		
		String res = sb.toString();
		
		return res;
		
		
	}
	
	

}
