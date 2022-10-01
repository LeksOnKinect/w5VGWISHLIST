<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome to the Java EE World</title>
</head>
<body>
<h1>Addition!</h1>
<form action="getAdditionServlet" method="post">
Enter 3 numbers you would like to add:
<input type="text" name ="userNumber1" size="10">
<input type="text" name ="userNumber2" size="10">
<input type="text" name ="userNumber3" size="10">
<input type="submit" value="Add Arguments"/>
</form>
</body>
</html>