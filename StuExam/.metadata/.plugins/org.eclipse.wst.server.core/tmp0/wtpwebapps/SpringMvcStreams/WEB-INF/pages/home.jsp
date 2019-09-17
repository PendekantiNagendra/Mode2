<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		<form:form action="searchEmployee" method="POST"
			modelAttribute="searchEmployee">
		   Emp Name :
		   <form:input path="empName" />
			<br />
			<br />
		   Band :
		   <form:select path="band">
		    <form:option value='0'>Select Band</form:option>
				<form:option value='E'>E</form:option>
				<form:option value='C'>C</form:option>
				<form:option value='M'>M</form:option>
			</form:select>
			<br />
			<br />
		   Salary :
		   <form:input path="salary" value="0.0"/>
			<br />
			<br />
			<input type="submit" value="Search" />
		</form:form>
		<h2>No of Employees."${listEmployee.size()}"</h2>
		<table border=2, bgcolor="pink">

			<th style="color: green">Emp Name</th>
			<th style="color: green">Emp DOJ</th>
			<th style="color: green">Band</th>
			<th style="color: green">Salary</th>

			<c:forEach var="emp" items="${listEmployee}">
				<tr>

					<td>${emp.empName}</td>
					<td>${emp.dateOfJoin}</td>
					<td>${emp.band}</td>
					<td>${emp.salary}</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>