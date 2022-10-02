<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%//@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title hee</title>
</head>
<body>
<p>${userSubtractionPouch.getTotal()} is the difference between the two numbers <br />
<p>${userSubtractionPouch.getX2()} is x2 <br />
<p>${userSubtractionPouch.getX5()} is x5 <br />
<p>${userSubtractionPouch.getX1000()} is x1000 <br />

<a href="index.jsp">Add or subtract more numbers</a>
</body>
</html>