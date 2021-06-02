<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST">
		<table border="1" cellpadding="5">
			<tr>
				<td>cid</td>
				<td>CustomerName</td>
				<td>CustomerAge</td>
				<td>gender</td>
				<td>dob</td>
				<td>phoneno</td>
				<td>mail</td>
			
			</tr>
			<c:forEach items="${hotel}" var="hotel">
				<tr>
					<td><c:out value="${hotel.cid}" /></td>
					<td><c:out value="${hotel.CustomerName}" /></td>
					<td><c:out value="${hotel.CustomerAge}" /></td>
					<td><c:out value="${hotel.gender}" /></td>
					<td><c:out value="${hotel.dob}"/></td>
					<td><c:out value="${hotel.phoneno}"/></td>
					<td><c:out value="${hotel.mail}"/></td>
						<td><a href="deletecustomer/${hotel.cid}">Delete</a></td>
					
				</tr>
			</c:forEach>
			</form>
			</form:form>
			<form action="index.jsp">
				<input type="submit" value="Home page">
</body>
</html>