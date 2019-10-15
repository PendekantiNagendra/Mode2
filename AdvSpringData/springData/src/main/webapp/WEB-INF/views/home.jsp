<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div align="center">
		<h1>Employee List</h1>
		<h2>No of Employees."${employeeList.size()}"</h2>
		<table border=2, bgcolor="pink">
			<th style="color: green">Emp No</th>
			<th style="color: green">Emp Name</th>
			<th style="color: green">Department</th>
			<th style="color: green">Designation</th>
			<th style="color: green">Basic</th>

			<c:forEach var="emp" items="${employeeList}">
				<tr>

					<td>${emp.empno}</td>
					<td>${emp.name}</td>
					<td>${emp.dept}</td>
					<td>${emp.desig}</td>
					<td>${emp.basic}</td>

				</tr>
			</c:forEach>
		</table>
		<a href="/displayjavacontractors" >Display JavaContractors</a> </br></br>
		<a href="/displayjavaemployees" >Display JavaEmployees</a> </br></br>
		<a href="/displayjavamanagers" >Display JavaManagers</a> </br></br>
		<a href="/displayjavamanagersalary" >Display JavaManagerSalary</a> </br></br>
		<a href="/displayjavaemployeesalname" >Display JavaEmployeeSalName</a>
	</div>
</body>
</html>