package com.host.java.practiceLevel_One;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DistinctWordsEx {

	public static void main(String[] args) throws IOException {
		
		Set<String> set = getData("C:\\Users\\sparimi\\Desktop\\Log.txt");
		
		set.forEach(e -> {
			System.out.println(e);
		});
	}
	
	public static Set<String> getData(String fileName) throws IOException{
		
		Set<String> set = new HashSet<String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		
		String line;
		
		while((line = br.readLine())!=null) {
			
			StringTokenizer st = new StringTokenizer(line,".,;:\"");
			
			while(st.hasMoreTokens()) {
				set.add(st.nextToken().toString());
			}
		}
		
		return set;
	}

}
