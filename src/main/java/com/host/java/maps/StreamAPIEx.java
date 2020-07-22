package com.host.java.maps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamAPIEx {

	public static void main(String[] args) {
		
		int[] arr = {412,500,201,404};
		
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		//System.out.println(list);
		
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(412, "Pre-condition failed");
		
		map.put(500, "Server Down");
		
		map.put(201,"success created");
		
		map.put(404, "Un-Authorized");
		
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(n -> {
//			System.out.println();
//		});
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(e -> System.out.println(e));
	
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(e -> System.out.println(e));
		

	}

}
