<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table border="3px"; bgcolor="#00FF00">
			<tr>
				<th>accountnum</th>
				<th>amount</th>
				<th>accounttype</th>
			</tr>
			<c:forEach var="acc" items="${Accounts}">
			<tr>
				<td>${accountnum}</td>	
				<td>${amount}</td>	
				<td>${accounttype}</td>	
			</tr>
			</c:forEach>
		</table>
		<input <a href="Login" /> type="submit" value="Exit">
	</center>
</form>
</body>
</html>