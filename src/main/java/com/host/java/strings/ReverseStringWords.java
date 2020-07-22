package com.host.java.strings;

import java.util.regex.Pattern;

public class ReverseStringWords {

	public static void main(String[] args) {

		String str1 = "Welcome to geeksforgeeks";
		String str2 = "I love Java Programming";

		
		  System.out.println(reversingTheStringLines(str1));
		  System.out.println(reversingTheStringLines(str2));
		  
		  System.out.println(convertToUpperCase(str1));
		 

		

	}

	public static String reversingTheStringLines(String str) {

		Pattern pattern = Pattern.compile("\\s");

		String[] strArray = pattern.split(str);

		String res = "";
		
		

		for (int i = 0; i < strArray.length; i++) {

			if (i == strArray.length - 1) {

				res = strArray[i] + res;
				
				//process as reverse String
				
				String temp = "";
				
				for(int j = res.length()-1; j>0; j--) {
					
					temp += res.charAt(j);
				}
				
				res = temp;
				
			} else {

				res = " " + strArray[i] + res;
			}
		}

		return res;
	}

	
	
	public static String convertToUpperCase(String str) {

		char[] chArray = str.toCharArray();

		String res = "";

		for (int i = 0; i < chArray.length; i++) {

			if (chArray[i] >= 'a' && chArray[i] <= 'z') {

				char ch = (char) (chArray[i] - 32);

				res += ch;
			} else {

				res += chArray[i];
			}
		}

		return res;

	}

	public static String reverseStringWords(String str) {
		
		Pattern pattern = Pattern.compile("\\s");
		
		String[] strArr = pattern.split(str);
		
		
		String res= "";
		
		for(int i = 0; i < strArr.length; i++) {
			
			if(i == strArr.length -1) {
				
				res += strArr[i];
			}else {
				
				res += " "+ strArr[i]; 
			}
		}
				

		return res;

	}
}
