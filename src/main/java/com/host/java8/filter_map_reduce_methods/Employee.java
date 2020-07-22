package com.host.java8.filter_map_reduce_methods;

public class Employee {

	private String empName ;
	private int empID ;
	private int empAge;
	
	public Employee(String name, int id, int age) {
		this.empName = name;
		this.empID = id;
		this.empAge = age;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpID(int id) {
		this.empID = id;
	}
	
	public int getEmpID() {
		return empID;
	}
	
	public void setEmpAge(int age) {
		this.empAge = age;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	
	public String toString() {
		return "empName = "+empName+", empID = "+empID+", empAge= "+empAge+" ]";
	}
}
