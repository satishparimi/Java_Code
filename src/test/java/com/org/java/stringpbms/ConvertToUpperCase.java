package com.org.java.stringpbms;

public class ConvertToUpperCase {

	public static void main(String[] args) {
		
		String str = "asdf";
		
		char [] chArry = str.toCharArray();
		
		String res = "" ;
		
		char ch = ' ';
		
		for(int i = 0; i<chArry.length; i++) {
			
			if(chArry[i] >= 'a' && chArry[i] <= 'z') {
				
				ch = (char) (chArry[i] - 32);
							
				res = res + ch;
				
			}
		}
		
		System.out.println(res);
		

	}

}
