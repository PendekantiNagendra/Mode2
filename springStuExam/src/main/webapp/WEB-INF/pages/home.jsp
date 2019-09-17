<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Student List</h1>
		
		<table border="4" bordercolor="yellow" bgcolor="skyblue" >
			<th style="color:white">ID</th>
			<th style="color:white">RollNum</th>
			<th style="color:white">Name</th>
			<th style="color:white">Age</th>
			<th style="color:white">Gender</th>
			<th style="color:white">Country</th>
			<th style="color:white">dateofJoin</th>
			<th style="color:white">final score</th>
			<th style="color:white">Exam</th>
            <th style="color:white">Grade</th>
            <th style="color:white">Action</th>
            
			<c:forEach var="student" items="${listStudent}">
				<tr>
<td>${student.id}</td>
					<td>${student.rollNo}</td>
					<td>${student.name}</td>
					<td>${student.age}</td>
					<td>${student.gender}</td>
					<td>${student.country}</td>
					<td>${student.dateofJoin}</td>
					<td>${student.finalScore}</td>
					<td>${student.grade}</td>
					
					<td><a href="editStudent?id=${student.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteStudent?id=${student.id}">Delete</a></td>
                    <td> 
				    <a href="showExam?sid=${student.id}">Marks</a></td>
				</tr>
			</c:forEach>
		</table>
		<h4>
			New Student Register <a href="newStudent">here</a>
			
			
		</h4>
	</div>
</body>
</html>