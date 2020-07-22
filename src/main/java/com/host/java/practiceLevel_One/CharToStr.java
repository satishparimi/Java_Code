package com.host.java.practiceLevel_One;

import java.util.HashSet;
import java.util.Set;

public class CharToStr {

	public static void main(String[] args) {
		
		char[] ch = {'g','o','o','d','m','o','r','n','i','n','g'};
		
		String str = new String(ch);
		System.out.println("After converting char[] array to string is: "+str);
		
		
		Set set = new HashSet<>();
		
		for(int i = 0; i < ch.length; i++) {
			
			if(!set.add(ch[i])) {
				System.out.println("duplicate chars are: "+ch[i]);
			}
		}
		
		
	}
}

