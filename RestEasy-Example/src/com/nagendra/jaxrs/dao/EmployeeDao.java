package com.nagendra.jaxrs.dao;


import java.util.List;

import com.nagendra.jaxrs.model.Employee;

public interface EmployeeDao {
	
public String addEmployee(Employee e);
	
	public Employee deleteEmployee(int id);
	
	public Employee getEmployee(int id);
	
	public List<Employee> getAllEmployees();
}
