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

		<!-- <a href="/displayAll/page/1">page:1</a> </br></br>
		<a href="/displayAll/page/2">page:2</a> </br></br>
		<a href="/displayAll/page/3">page:3</a>  -->

		<c:set var="num" value="${pages}"></c:set>

		<%
			int n = ((Integer) pageContext.getAttribute("num")).intValue();
			for (int i = 0; i < n; i++) {
		%>

		<a href="/displayAll/page/<%=i%>"><%=i + 1%></a>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<%
			}
		%>
		<a href="/">Home</a><br />
		<br />
	</div>
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
	<!-- <a href="/displayjavacontractors" >Display JavaContractors</a> </br></br>
		<a href="/displayjavaemployees" >Display JavaEmployees</a> </br></br>
		<a href="/displayjavamanagers" >Display JavaManagers</a> </br></br>
		<a href="/displayjavamanagersalary" >Display JavaManagerSalary</a> </br></br>
		<a href="/displayjavaemployeesalname" >Display JavaEmployeeSalName</a>
		<a href="/displayAllSortByDesig" >Display All Order by Designation</a> </br></br>
		<a href="/displayAllSortByDesigInDesc" >Display All Order by Designation in Descending order</a> </br></br>
		<a href="/displayAllSortBySalAndDeptInDesc" >Display All Order by Salary in Descending order and sort by department in Descending order</a> </br></br>
		<a href="/displayJavaEmpSortBySalInDesc" >Display All Order by Salary in Descending order and sort by department in Descending order</a> </br></br>
		<a href="/displayJavamanSortBySalAndDeptInDesc" >Display All Order by Salary in Descending order and sort by department in Descending order</a> </br></br> -->
	
</body>
</html>