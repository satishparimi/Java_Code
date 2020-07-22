package com.host.java.maps;

import java.util.HashMap;
import java.util.Map;

public class CompareMaps {
	
	public static void main(String[]args) {
		
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("Japan", "Tokyo");
		map1.put("South Korea", "Seoul");
	 
	    Map<String, String> map2 = new HashMap<String, String>();
	    map2.put("South Korea", "Seoul");
	    map2.put("Japan", "Tokyo");
	 
	    Map<String, String> map3 = new HashMap<String, String>();
	    map3.put("Japan", "Tokyo");
	    map3.put("China", "Beijing");
	    
	    boolean res = map1.entrySet().stream().allMatch(e -> e.getValue().equals(map2.get(e.getKey())));
	    
	  

	}

}
