<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="authenticate" method="post">
	<label>User Id :</label>
	<input type="text" name="userid" required>
	<label>Password :</label>
	<input type="text" name="password" required>
	<input type="submit" value="Signin" > 
	</form>
</body>
</html>