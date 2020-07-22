package com.org.practice;

public class ReverserStringInput {

	public static void main(String[] args) {

		reverseString("CAPTAIN");

	}

	public static void reverseString(String str) {

		StringBuilder sb = new StringBuilder();

		StringBuilder res = sb.append(str);

		res = res.reverse();

		System.out.println(res);
	}

}
