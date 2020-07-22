package com.org.practice;

class Student{
	
	int rollNo;
	String name, address;
	
	public Student(int rollNo, String name, String address) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return rollNo + ""+name+" "+address;		
	}
	
}


public class ToStringEx {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "abt", "NC");
		Student s2 = new Student(2, "zellon","CA");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
