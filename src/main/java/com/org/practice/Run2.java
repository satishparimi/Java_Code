package com.org.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run2 {

	private static Run2 run;
	
	private Run2() {
		
	}
	
	public static void main(String[] args) {

		reverseGivenString("SATISH");
	}
	
	public static List<Integer> convertToList(int[] arr) {
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		return list;
	}

	public static boolean findPrime(int n) {
		
		int reminder;
		 
		for(int i = 1; i< n/2; i++) {
			
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
	
	public static void reverseGivenString(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		StringBuilder res = sb.append(str);
		
		res = 	res.reverse();
		
		System.out.println(res);
		
	}
	
	public static int findMaxElementInArray(int[] arr) {
		
		int max =0 , max2 = 0;
		
		if(arr.length == 0) {
			
			return 0;
		}
		
		for(int i =1; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max2 = max;
				max = arr[i];
			}else if(arr[i] > max2 && arr[i] != max) {
				
				max2 = arr[i];
			}
		}
	
		return max2;
	}
	
public static void findAdjacentChars(String str) {
		
		char[] strArr = str.toCharArray();
		
		for(int i =1; i< strArr.length; i++) {
			
			if((strArr[i] == strArr[i-1]+1) || (strArr[i] == strArr[i-1]-1)) {
				
				System.out.print(strArr[i]);
			}else {
				System.out.print("\n"+strArr[i]);
			}
		}
	}

	public static boolean isAnagram(String str1, String str2) {

		char[] s1 = str1.toLowerCase().toCharArray();

		char[] s2 = str2.toLowerCase().toCharArray();

		Arrays.sort(s1);

		Arrays.sort(s2);

		return Arrays.equals(s1, s2);

	}

	public static boolean isPanlindrome(String str, int low, int high) {

		if (str.length() == 0) {
			return false;
		}

		if(high <= low) {
			return true;
		}else if(str.charAt(low) != str.charAt(high)) {
			return false;
		}else {
			return isPanlindrome(str, low+1, high-1);
		}

	}
	
	public static void printAdjacentChars(String inputString) {
		
		char [] str = inputString.toCharArray();
		
		for(int i =1; i < str.length; i++) {
			
			if((str[i] == str[i-1]+1) || (str[i] == str[i-1]-1)) {
				System.out.print(str[i]);
			}else {
				System.out.print("\n"+str[i]);
			}
		}
	}
	
	//Singleton pattern
	public static Run2 getInstance() {
		
		if(run == null) {
			
			synchronized(Run2.class){
				
				run = new Run2();
			}
		}
		return run;
	}
	
	//Get permutations
	public static ArrayList<String> getPermutations(String str) {
		
		if(str.length()==0) {
			
			ArrayList<String> empty = new ArrayList<>();
			
			empty.add("");
			
			return empty;
			
		}
		
		char ch = str.charAt(0);
		
		String subStr = str.substring(1);
		
		ArrayList<String> prevRes = getPermutations(subStr);
		
		ArrayList<String> res = new ArrayList<>();
		
		for(String val : prevRes) {
			
			for(int i = 0; i<= val.length(); i++) {
				
				res.add( val.substring(0,i) + ch + val.substring(i));
			}
		}
		
		return res;
		
		
	}
	
	public static ArrayList<String> getPermutatiions2(String string) {
		if(string.length() == 0) {
			
			ArrayList<String> empty = new ArrayList<>();
			
			empty.add("");
			
			return empty;
					
		}
		
		char ch = string.charAt(0);
		
		String substring = string.substring(1);
		
		ArrayList<String> prevRes = getPermutatiions2(substring);
		
		ArrayList<String> res = new ArrayList<>();
		
		for(String val : prevRes) {
		
			for(int i = 0; i<=val.length(); i++) {
				
				res.add(val.substring(0,i)+ ch + val.substring(i));
				
				
			}
		}
		
		
		return res;
	}
	
	
	

}
