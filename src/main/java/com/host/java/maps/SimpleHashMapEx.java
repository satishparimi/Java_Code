package com.host.java.maps;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMapEx {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(200, "Sccess");
		
		map.put(201, "Created");
		
		map.put(503, "ServerDown");
		
		map.put(412, "Pre-conditionFailed");
		
		map.put(400, "Un-Authorized");
		
		map.put(null, "test null message");
		
		map.put(509, null);
		
		map.put(510, null);
		
		map.keySet().forEach(n ->{
			System.out.println("Key is : "+n + " value is "+map.get(n));;
		});
		

	}

}
