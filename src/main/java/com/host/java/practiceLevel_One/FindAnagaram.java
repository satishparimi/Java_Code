package com.host.java.practiceLevel_One;

import java.util.Arrays;

public class FindAnagaram {

	public static void main(String[] args) {
		
		String str1 = "now";
		String str2 = "Own";
		System.out.println(isAnagram(str1, str2));

	}

	public static boolean isAnagram(String str1, String str2) {
		
		String str01 = str1.replaceAll("\\S", "");
		
		String str02 = str2.replaceAll("\\S", "");
		
		char[] ch1 = str01.toLowerCase().toCharArray();
		
		char[] ch2 = str02.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);
	}
}
