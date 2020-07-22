package com.org.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class FindLargestWord {

	public static void main(String[] args) {

		int max = 0 ;

		String str = "Hello World Java TestPoint";
		
		StringTokenizer st = new StringTokenizer(str);
		
		String[] words = str.split("\\s");
		
		List<String> ls =Arrays.asList(words);
		
		for(String val : ls) {
			
			if(val.length() > max){
				max = val.length();
			}
		}
		
		System.out.println(max);
		
		
		
	}
	
	

}
