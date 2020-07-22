package com.org.practice;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	private int empID;
	private String empName;
	private String city;
	private double salary;
	
	public Employee(int empID, String empName, String city, double sal) {
		this.empID = empID;
		this.empName = empName;
		this.city = city;
		this.salary = sal;
	}
	
	public int getEmpID() {
		return empID;
	}
	public String getEmpName() {
		return empName;
	}
	public String getempCity() {
		return city;
	}
	
	public double getEmpSal() {
		return salary;
	}
	
	public String toString() {
		
		return "[id:"+this.empID+" emp name :"+this.empName+" emp city "+this.city+" salary "+this.salary+" ]";
	}

	@Override
	public int compareTo(Employee e) {
		if(salary == e.salary) {
			return 0;
		}else if(salary > e.salary) {
			return 1;
		}else {
			return -1;
		}
	}

	
	
	   
}

public class ComprableExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1,"name1","city1",4500));
		emp.add(new Employee(2,"name2","city2",2500));
		emp.add(new Employee(3,"name3","city3",3500));
		emp.add(new Employee(4,"name4","city4",1700));
		
		System.out.println("before sorting");
		
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		System.out.println("after sorting");
		Collections.sort(emp);
		
		for(Employee e : emp) {
			System.out.println(e);
		}
	}

}
