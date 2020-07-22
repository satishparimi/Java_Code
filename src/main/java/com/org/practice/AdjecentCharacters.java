package com.org.practice;

public class AdjecentCharacters {

	public static String resStr = "";

	public static void main(String[] args) {

		String str = "aabde";
		getAdjacentChars(str);
	}

	public static <T> void getAdjacentChars(String str) {

		char[] strArr = str.toCharArray();

		for (int i = 1; i < strArr.length; i++) {

			if ((strArr[i] == strArr[i - 1] + 1) || (strArr[i] == strArr[i - 1] - 1)) {
				
				System.out.print(strArr[i]);
				
				
			} else {

				System.out.print("\n\n" + strArr[i]);
			}

		}
	}
}

//Early Instantiation
/*
 * private static member: it loads into the memory once because of static, it
 * contains the instance of the class private constructor: it can prevent create
 * instance of singleton calss from outside of the class static factory method:
 * this provides global acess to singleton class and return instance to the
 * caller
 */