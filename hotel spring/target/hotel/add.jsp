<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addPerson">
customer id: <input type="text" name="cid"></br></br></br>
Customer Name :<input type="text" name="customerName"/></br></br></br>
Customer Age : <input type="number" name="customerAge "></br></br></br>
Date of birth : <input type="date" name="dob"></br></br></br>
Gender : <input type="radio" name="gender" value="female"/>female
<input type="radio" name="gender" value="male"/> male</br></br></br>
Gmail :<input  name="mail" type="email"></br></br></br>
Phone number:<input  name="phoneno" type="number"></br></br></br>
<input type="submit"/>
</form>
</body>
</html>