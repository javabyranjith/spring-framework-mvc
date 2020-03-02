<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>
  Product Names:
  <ul>
    <c:forEach items="${productsName}" var="name">
      <li><c:out value="${name}"></c:out></li>
    </c:forEach>
  </ul>

  Product Objects:
  <table border="1" style="padding: 5px">
    <thead>
      <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>CATEGORY</th>
        <th>PRICE</th>
        <th>DESCRIPTION</th>
      </tr>
    </thead>
    <c:forEach items="${productsObject}" var="product">
      <tr>
        <td><c:out value="${product.id}">
          </c:out></td>
        <td><c:out value="${product.name}">
          </c:out></td>
        <td><c:out value="${product.category}">
          </c:out></td>
        <td><c:out value="${product.price}">
          </c:out></td>
        <td><c:out value="${product.description}">
          </c:out></td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>