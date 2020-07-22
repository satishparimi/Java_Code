package com.host.java.practiceLevel_One;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class LikedListEx {

	public static void main(String[] args) {
		
		
		Queue<String> list = new PriorityQueue();
		
		
		list.add("a");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		
		for(String l : list) {
			
			System.out.println(l);
		}

	}

}
