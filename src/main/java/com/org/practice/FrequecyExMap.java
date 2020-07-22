package com.org.practice;

import java.util.HashMap;
import java.util.Map;

public class FrequecyExMap {

	public static void main(String[] args) {

		 int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};   
		 
		 
		 
		 getFrequencyUsingMap(arr);
		
		 

	}
	
	
	public static void getFrequencyUsingMap(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				
				map.put(arr[i], map.get(arr[i])+1);
				
			}else {
				map.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+" | "+entry.getValue());
		}
	}
	
	
	public static void getFrequencyUsingArray(int[] arr) {
		
		int visited = -1;
		
		int[] fr = new int[arr.length];
		
		for(int i = 0 ; i <arr.length; i++) {
			
			int count = 1;
			
			for(int j = (i+1); j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
					fr[j] = visited;
				}
			}
			
			if(fr[i]!=visited) {
				fr[i]=count;
			}
			
		}
	}

}
