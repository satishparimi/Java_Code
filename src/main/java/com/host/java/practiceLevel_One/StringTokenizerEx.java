package com.host.java.practiceLevel_One;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		String str = "welcome to testing and validtion";
		
		StringTokenizer st = new StringTokenizer(str);
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement().toString());
		}

	}

}
