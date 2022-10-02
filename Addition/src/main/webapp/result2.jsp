<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>${userAdditionPouch.getTotal()} is the sum of those 3 numbers<br />
<p>${userAdditionPouch.getQuarters()}/4 is equal<br />
<p>${userAdditionPouch.getTenths()}/10 is equal<br />
<p>${userAdditionPouch.getHundredths()}/100 is equal <br />
<a href="index.jsp">Add or subtract more numbers</a>
</body>
</html>