package com.host.java8.filter_map_reduce_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FIlterMethodEx {

	public static void main(String[] args) {

		Employee emp1 = new Employee("jack", 1, 32);
		Employee emp2 = new Employee("capella", 2, 26);
		Employee emp3 = new Employee("nick", 3, 40);
		Employee emp4 = new Employee("james", 4, 35);

		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);

		employees.stream().filter(e -> e.getEmpAge() > 30).forEach(e -> {
			System.out.println("name is = "+e.getEmpName()+ ", age is = "+e.getEmpAge());
		});

		
		//Find the total employees count having age greather than 30
		System.out.println("Total employees having > 30 age "+employees.stream().filter(e -> e.getEmpAge()>30).count());
		
		//Find the employees having same name
		
		
	}

}
