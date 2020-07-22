package com.org.practice;

import java.util.Arrays;

public class Panlindrome {

	public static boolean isPalinDrome(String str, int low, int high) {

		if (str.length() == 0) {
			return false;
		}

		if (high <= low) {
			return true;
		} else if (str.charAt(low) != str.charAt(high)) {
			return false;
		} else {
			return isPalinDrome(str, low + 1, high - 1);
		}
	}

	public static void main(String[] args) {

		String str = "civic";
		System.out.println(isPalinDrome(str, 0, str.length() - 1));

	}

}
