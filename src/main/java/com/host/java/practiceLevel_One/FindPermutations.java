package com.host.java.practiceLevel_One;

import java.util.ArrayList;

public class FindPermutations {

	public static void main(String[] args) {
		
		String str = "xyz";
		
		ArrayList<String> permutations = getPermutation(str);
		
		permutations.forEach(e -> {
			System.out.println(e);
		});

	}
	
	public static ArrayList<String> getPermutation(String str){
		
		if(str.length() == 0) {
			ArrayList<String> empty = new ArrayList<String>();
			
			empty.add("");
			return empty;
		}
		
		char ch = str.charAt(0);
		
		String subStr = str.substring(1);
		
		ArrayList<String> prevRes = getPermutation(subStr);
		
		ArrayList<String> res = new ArrayList<>();
		
		for(String val : prevRes) {
			
			for(int i = 0; i <= val.length(); i++) {
				
				res.add(val.substring(0,i)+ch+val.substring(i));
			}
		}
		
		return res;
		
}
	
}
