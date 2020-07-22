package com.host.java.practiceLevel_One;

public class FindAdjacentChars {

	public static void main(String[] args) {
		
		String str = "ABCDETGH";
		
		findAdjacentChars(str);

	}
	
	public static void findAdjacentChars(String str) {
		
		char[] strArr = str.toCharArray();
		
		for(int i = 1; i < strArr.length; i++) {
			
			if((strArr[i] == strArr[i-1]+1) || strArr[i] == strArr[i-1]-1) {
				
				System.out.print(strArr[i]);
			}else {
				System.out.print("\n"+strArr[i]);
			}
		}
	}

}
