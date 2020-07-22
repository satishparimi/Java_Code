package com.host.java.practiceLevel_One;

public class RemoveWhileSpaceInString {

	public static void main(String[] args) {
		
		String str = "Hello World Welcome to Testing";
		
		removeSpace(str);

	}
	
	public static void removeSpace(String str) {
		
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i)!=' ') {
				System.out.print(str.charAt(i));
			}
		}
	}

}
