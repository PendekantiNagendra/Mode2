package com.hcl.fiMethods;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeInterface empInt = Employee::new;
        Employee emp = empInt.getEmployee(44, "Nagendra");
        
        System.out.println(emp.getEmpno());
        System.out.println(emp.getEmpName());
	}
}
