package com.host.java.practiceLevel_One;

public class ConvertoToLowerCase {

	public static void main(String[] args) {
		
		String str = "ABcDE";
		
		System.out.println(converToLower(str));

	}
	
	public static String converToLower(String str) {
		
		char[] chArr = str.toCharArray();
		
		String res = "";
		
		for(int i = 0; i < chArr.length; i++) {
			
			if(chArr[i] >= 'a' && chArr[i] <='z') {
				
				char ch = (char) (chArr[i] +  32);
				
				res += ch; 
			}else {
				
				res += chArr[i];
			}
			
		}
		
		return res;
	}
}
