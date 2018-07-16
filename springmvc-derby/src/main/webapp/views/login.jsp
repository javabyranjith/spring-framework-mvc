<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form id="loginForm" action="loginProcess" method="post">
		<table align="center">
			<tr>
				<td><label>Username: </label></td>
				<td><input name="username" id="username" type="text" /></td>
			</tr>
			<tr>
				<td><label>Password:</label></td>
				<td><input type="password" name="password" id="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><button id="login" name="login">Login</button></td>
			</tr>

			<tr></tr>
			<tr>
				<td></td>
				<!-- <td><a href="index.jsp">Home</a></td> -->
			</tr>
		</table>
	</form>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>

</body>
</html>