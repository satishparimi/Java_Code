package com.host.java8.LambdaEpressions;

import java.util.ArrayList;
import java.util.List;

public class TestRun {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		
		User user1 = new User("jack", "1");
		User user2 = new User("james","2");
		
		users.add(user1);
		users.add(user2);
		
		users.forEach(e ->{
			System.out.println("Username is : "+e.getUsername());
			System.out.println("Username is : "+e.getUserId());
		});
		

	}

}
