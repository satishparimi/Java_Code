package com.host.java.strings;

public class ConvertLowerToUpperCase {

	public static void main(String[] args) {
		
		String str = "aBcDeFGHI&&*&%$#@gh";
		
		String res = "";
		
		char ch = ' ';
		
		for (int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i) >= 'a' && str.charAt(i)<= 'z') {
				
				ch = (char) (str.charAt(i) - 32);
				
				res = res + ch;	
			}else {			
				res = res+str.charAt(i);
			}
			
		}
		
		System.out.println(res);

	}

}
