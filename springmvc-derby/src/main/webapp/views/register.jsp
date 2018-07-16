<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form id="regForm" action="registerProcess" method="post">
		<table align="center">
			<tr>
				<td><label>Username</label></td>
				<td><input type="text" name="username" id="username" /></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" name="password" id="password" /></td>
			</tr>
			<tr>
				<td><label>FirstName</label></td>
				<td><input type="text" name="firstname" id="firstname" /></td>
			</tr>
			<tr>
				<td><label>LastName</label></td>
				<td><input type="text" name="lastname" id="lastname" /></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input type="text" name="email" id="email" /></td>
			</tr>
			<tr>
				<td><label>Address</label></td>
				<td><input type="text" name="address" id="address" /></td>
			</tr>
			<tr>
				<td><label>Phone</label></td>
				<td><input type="text" name="phone" id="phone" /></td>
			</tr>

			<tr>
				<td></td>
				<td><button id="register" name="register">Register</button></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<!-- <td><a href="index.jsp">Home</a></td> -->
			</tr>
		</table>
	</form>

</body>
</html>