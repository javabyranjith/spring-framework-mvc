<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Expand/Collapse</title>
<link href="css/app.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/app.js"></script>
</head>

<body>
  <div class="mainDiv">
    <table border="1">
      <thead>
        <tr>
          <th>E/C</th>
          <th>ID</th>
          <th>CATEGORY</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${productList}" var="products">
          <c:forEach items="${products}" var="product">
            <tr>
              <td><img src="image/up-arrow.jpg" /></td>
              <td>${product.id}</td>
              <td>${product.name}</td>
            </tr>
          </c:forEach>
        </c:forEach>
      </tbody>
    </table>
  </div>
</body>
</html>