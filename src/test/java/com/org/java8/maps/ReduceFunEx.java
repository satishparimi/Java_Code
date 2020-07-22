package com.org.java8.maps;

import java.util.ArrayList;
import java.util.List;

public class ReduceFunEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,};
		
		/*int res = Arrays.stream(arr).reduce(5, (a,b) -> a + b, (a,b) -> {
			
			return a+b;
		});*/
		
		List<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(5);
		list.add(2);
				
		int res = list.stream().reduce(4, (a,b)-> a+b, (a,b) -> {
			
			return a+b;
		});
		
		System.out.println("Res is : "+res);
		
	}

}
