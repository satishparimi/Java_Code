package com.host.java.strings;

public class StringToInt {

	public static void main(String[] args) {
		
		System.out.println("\"3526\" is : "+strToInt("3526"));

	}
	
	public static int strToInt(String str) {
		
		char[] chArr = str.toCharArray();
		
		int res = 0;
		
		int zeroASCII = (int)'0';
		
		for(int i =0; i<chArr.length; i++) {
			
			int tempASCII = (int) chArr[i];
			
			res = (res * 10 ) + tempASCII - zeroASCII;
		}
		
		return res;
		
	}

}
