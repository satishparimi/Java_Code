package com.org.java8.maps;

import java.util.HashMap;

public class StreamAPI {

	
	public static void main(String[] args) {
		
		HashMap<Integer, String> codes = new HashMap<>();
		
		codes.put(100, "Done");
		codes.put(200, "Sucesss");
		codes.put(201, "Created");
		codes.put(204, "Sucess with No Response message");
		codes.put(300, "re-direction");
		codes.put(400, "Unavailable");
		codes.put(401, "UnAuthorized");
		codes.put(500, "Internal server error");
		
		/*codes.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(e -> {
			
			System.out.println(e.getKey()+" <(::)> "+e.getValue());
		});*/
		
		//Filter ex
		long count = codes.entrySet().stream().filter(e -> e.getKey()>205).count();
		System.out.println("Count is "+count);
		
		//
		codes.entrySet().stream().sorted().map(e -> e.getKey() ).forEach(e -> {
			System.out.println(e);
		});
		
	}
}
