<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index page</title>
</head>
<body>
	<form action="LoginController" method="post">
		<table border="1" bgcolor="pink" align="center">
			<tr bgcolor="yellow">
				<td colspan="2" align="center"><h2>Login form</h2></td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Login"></td>
			</tr>
			<tr align="right">
			    <td colspan="2"><a href="signup.jsp">Create Account</a></td>
			</tr>
		</table>

	</form>

	<h2>
		<a href="welcome.jsp">Go to login page</a>
	</h2>
</body>
</html>

