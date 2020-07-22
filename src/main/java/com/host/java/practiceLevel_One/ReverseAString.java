package com.host.java.practiceLevel_One;

import java.util.regex.Pattern;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "CAPTAIN America";

		// reverseAString(str);
		// reverseAStringWithArray(str);

		System.out.println(reverseStringWords(str));
		;

	}

	public static void reverseAString(String str) {

		StringBuilder sb = new StringBuilder();

		StringBuilder res = sb.append(str);

		StringBuilder res1 = res.reverse();

		System.out.println(res1);
	}

	public static void reverseAStringWithArray(String str) {

		char[] strArr = str.toCharArray();

		for (int i = strArr.length - 1; i >= 0; i--) {

			System.out.print(strArr[i]);
		}
	}

	public static String reverseStringWords(String str) {

		Pattern pattern = Pattern.compile("\\s");

		String[] strArr = pattern.split(str);

		String res = "";

		for (int i = 0; i < strArr.length; i++) {

			if (i == strArr.length - 1) {

				res = strArr[i] + res;

			} else {

				res = " " + strArr[i] + res;

			}

		}

		return res;

	}
}
