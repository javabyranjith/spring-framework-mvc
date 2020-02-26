<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person Info</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>NAME</td>
			<td>ADDRESS</td>
			<td>PHONE</td>
		</tr>
		<tr>
			<td>${person.name}</td>
			<td>${person.address}</td>
			<td>${person.phone}</td>
		</tr>
	</table>
</body>
</html>