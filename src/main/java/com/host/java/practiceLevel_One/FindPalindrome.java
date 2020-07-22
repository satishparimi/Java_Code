package com.host.java.practiceLevel_One;

public class FindPalindrome {

	public static void main(String[] args) {
		
		String str = "CIVIC";
		System.out.println(findPalindrome(str, 0, str.length()-1));

	}

	public static boolean findPalindrome(String str, int low, int high) {
		
		if(str.length()==0) {
			return false;
		}
		
		if(high < low ) {
			return true;
		}else if(str.charAt(low) != str.charAt(high)) {
			return false;
		}else {
			return findPalindrome(str, low+1, high-1);
		}
		
		
	}

}
