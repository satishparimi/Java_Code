package com.org.practice;

public class ReverseString {

	public static void main(String[] args) {
		

		reverseAGivenString("CAPTAIN");
		System.out.println("");
		int[] arr= {2,3,5,6,7};
		reverseGivenArray(arr);
	}

	
	public static void reverseAGivenString(String str) {
		
		char[] strArr = str.toCharArray();
		
		for(int i = strArr.length-1; i >= 0; i--) {
			
			System.out.print(strArr[i]);
		}
	}
	
	public static void reverseGivenArray(int[] arr) {
		
		for(int i = arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i]);
		}
	}
}
