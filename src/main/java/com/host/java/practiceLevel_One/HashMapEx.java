package com.host.java.practiceLevel_One;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(401, "Un-Authorized");
		map.put(300, "Re-direction");
		map.put(412, "Pre-condition failed");
		map.put(500, "Server down");
		map.put(204, "Sucess,but no-content");
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())).forEach(e -> {
			System.out.println(e);
		});
	}

}
