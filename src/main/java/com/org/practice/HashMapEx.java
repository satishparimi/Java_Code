package com.org.practice;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapEx {

	public static void main(String[] args) {

		Map<Integer, String> codes = new HashMap<Integer, String>();

		codes.put(100, "completed");
		codes.put(412, "pre-condition failed");
		codes.put(400, "Un-Authorized");
		codes.put(301, "redirection done");
		codes.put(200, "sucesss");
		codes.put(500, "internal server error");

		Collection  val = codes.values();
		
		//System.out.println(val.toString().toUpperCase());
		
		Set<Integer> keys = codes.keySet();
		
		/*codes.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(e -> {
			System.out.println(e);
		});*/

		/*codes.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())).forEach(e -> {
			System.out.println(e);
		});*/
		
		//throw new RuntimeException("");
		
		for(Map.Entry<Integer,String> m: codes.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
	
}
