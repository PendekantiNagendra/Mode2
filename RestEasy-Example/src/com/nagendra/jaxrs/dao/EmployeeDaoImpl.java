package com.nagendra.jaxrs.dao;

import java.util.List;

import javax.ws.rs.core.Response;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import com.nagendra.jaxrs.model.Employee;
import com.nagendra.jaxrs.model.GenericResponse;

public class EmployeeDaoImpl implements EmployeeDao {

	SessionFactory sf = new HibernateUtil().getSessionFactory();
	GenericResponse response = new GenericResponse();
	
	@Override
	public String addEmployee(Employee e) {
		Transaction t =null;
		String result="Input data Not Valid";
	  try {
		  Session s = sf.openSession();
			s.save(e);
			t = s.beginTransaction();	
			t.commit();
			result="Inserted";
	    }
	  catch(ConstraintViolationException cve) {
		  return "Employee Already Exists";
	  }
	    catch (RuntimeException e1) {
	        t.rollback();
	        
	        throw e1;
	    }
	  return result;
		
		
	}

	@Override
	public Employee deleteEmployee(int id) {
		Session s = sf.openSession();
		Employee e = this.getEmployee(id);
		Transaction t = s.getTransaction();
		s.delete(e);
		t.begin();
		t.commit();
		return e;
	}

	@Override
	public Employee getEmployee(int id) {
		Employee e = new Employee();
		  Session s = sf.openSession();
		e = (Employee)s.get(Employee.class, id);
		return e;
	}

	@Override
	public List<Employee> getAllEmployees() {
		Session s = sf.openSession();
		Query q = s.createQuery("from Employee");
		List<Employee> employees = q.list(); 
		return employees;
	}

}
