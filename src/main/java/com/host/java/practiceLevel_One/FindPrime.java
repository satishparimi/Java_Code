package com.host.java.practiceLevel_One;

import java.util.Arrays;

public class FindPrime {

	public static void main(String[] args) {

		int[] arr = { 1, 6, 9, 10, 13, 17, 19, 20, 23 };

		
		for(int i = 0; i<= 50; i++) {
			
			if(findPrimeNum(i)) {
				System.out.println(i + " is prime number ");
			}
		}
		
		/*Arrays.stream(arr).forEach((i) -> {

			System.out.println(i + " is Prime : " + findPrimeNum(i));
			;
		});*/

	}

	public static boolean findPrimeNum(int n) {
		
		int reminder ;
		
		for(int i = 2; i< n/2; i++) {
			if(n < 1) {
				return false;
			}
			
			reminder = n % i;
			
			if(reminder == 0) {
				return false;
			}
		}
		
		return true;

}
	
}
