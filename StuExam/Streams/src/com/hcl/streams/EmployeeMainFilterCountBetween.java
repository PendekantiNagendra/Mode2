package com.hcl.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMainFilterCountBetween {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(10, "Apple", 1010f, 'E'));
		list.add(new Employee(20, "Banana", 2020f, 'M'));
		list.add(new Employee(30, "Carrot", 3030f, 'M'));
		list.add(new Employee(40, "Dates", 4040f, 'C'));
		list.add(new Employee(50, "Apricot", 5050f, 'M'));
		Long noOfRecords = list.stream().count();
		System.out.println(noOfRecords);
		Long empSalGt3000 = list.stream().filter((var) -> var.getSalary() >= 1500 && var.getSalary() <4000 && var.getBand() == 'M').count();
		System.out.println(empSalGt3000);
		
	}

}