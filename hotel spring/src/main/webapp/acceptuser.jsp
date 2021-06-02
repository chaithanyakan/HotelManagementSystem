<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="login" class="Validation.ValidatingUser"/>
<jsp:setProperty property="username" name="login"/>
<jsp:setProperty property="password" name="login"/>
<%if(login.validate("chaithanya","Chaithu@86")){ %>
Welcome You are a valid User</br>
<%}else{ %>
You are not a valid User</br>
<%}%>
<form action="buttonsdisplay.jsp">
<input type="submit" value="Click here to add or delete or list Customers">
</form>
</body>
</html>