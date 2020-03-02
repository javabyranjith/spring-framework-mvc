<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Map</title>
</head>
<body>

  <table border="1">
    <thead>
      <tr>
        <th>ID</th>
        <th>NAME</th>
      </tr>
    </thead>
    <c:forEach items="${productsMap}" var="product">
      <tr>
        <td><c:out value="${product.key}">
          </c:out></td>
        <td><c:out value="${product.value}">
          </c:out></td>
      </tr>
    </c:forEach>

  </table>


</body>
</html>