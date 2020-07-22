package com.org.practice.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	
	int rollNo;
	String name;
	int age;
	
	Student(int rollNo, String name, int age){
		
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return rollNo+""+name+" "+age;
	}
}

class AgeComprator implements Comparator<Student>{
	
	

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age == o2.age) {
			return 0;
		}else if( o1.age > o2.age) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

class NameComprator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}



public class CompratorEx {

	public static void main(String[] args) {
		
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student(1,"a",12));
		student.add(new Student(4,"d",16));
		student.add(new Student(7,"e",13));
		student.add(new Student(8,"c",11));
		
		System.out.println("Before Sorting Age ..");
		
		
		for(Student s : student) {
			
			System.out.println(s);
		}
		
		System.out.println("After Sorting Age ..");

		Collections.sort(student,new AgeComprator());
		
		for (Student s : student) {

			System.out.println(s);
		}
	}

}
