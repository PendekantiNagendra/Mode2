package com.nagendra.jaxrs.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nagendra.jaxrs.dao.EmployeeDaoImpl;
import com.nagendra.jaxrs.model.Employee;
import com.nagendra.jaxrs.model.GenericResponse;

@Path("/employee")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
	private static Map<Integer,Employee> emps = new HashMap<Integer,Employee>();
	
	@Override
	@POST
    @Path("/add")
	public Response addEmployee(Employee e) {
		GenericResponse response = new GenericResponse();
		String result = employeeDaoImpl.addEmployee(e);
		
		if(!result.equals("Inserted")){
			response.setStatus(false);
			response.setMessage(result);
			response.setErrorCode("EC-01");
			return Response.status(422).entity(response).build();
		} 
	
		response.setStatus(true);
		response.setMessage("Employee created successfully");
		return Response.ok(response).build();
	}

	@Override
	@DELETE
    @Path("/{id}/delete")
	public Response deleteEmployee(@PathParam("id") int id) {
		GenericResponse response = new GenericResponse();
		Employee e = employeeDaoImpl.deleteEmployee(id);
		emps.put(id, e);
		if(emps.get(id) == null){
			response.setStatus(false);
			response.setMessage("Employee Doesn't Exists");
			response.setErrorCode("EC-02");
			return Response.status(404).entity(response).build();
		}
		emps.remove(id);
		response.setStatus(true);
		response.setMessage("Employee deleted successfully");
		return Response.ok(response).build();
	}

	@Override
	@GET
	@Path("/{id}/get")
	public Employee getEmployee(@PathParam("id") int id) {
		Employee e = employeeDaoImpl.getEmployee(id);
		emps.put(e.getId(), e);
		return emps.get(id);
	}
	
	/*@GET
	@Path("/{id}/getDummy")
	public Employee getDummyEmployee(@PathParam("id") int id) {
		Employee e = new Employee();
		e.setSalary(8976.55);
		e.setName("Dummy");
		e.setId(id);
		return e;
	}*/

	@Override
	@GET
	@Path("/getAll")
	public Employee[] getAllEmployees() {
		List<Employee> employees = employeeDaoImpl.getAllEmployees();
		for (Employee employee : employees) {
			emps.put(employee.getId(), employee);
		}
		Set<Integer> ids = emps.keySet();
		Employee[] e = new Employee[ids.size()];
		int i=0;
		for(Integer id : ids){
			e[i] = emps.get(id);
			i++;
		}
		return e;
	}

}
