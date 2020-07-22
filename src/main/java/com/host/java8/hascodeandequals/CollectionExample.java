package com.host.java8.hascodeandequals;

import java.util.HashSet;

public class CollectionExample {

	public static void main(String[] args) {
		
		Student student1 = new Student("ABC", "001", "687");
		Student student2 = new Student("ABC", "001", "687");
		
		System.out.println(student1.equals(student2));
		
		HashSet<Student> studentSet = new HashSet<>();
		
		studentSet.add(student1);
		studentSet.add(student2);
		
		for(Student std : studentSet){
			
			System.out.println("Student Name= "+std.getName()+", Student ID = "+std.getId()+", Std = "+std.getStd());
		}
		

	}

}
