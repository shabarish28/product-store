<%@page import="com.js.dto.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  Product p = (Product)request.getAttribute("pro");%>

<form action="update" method="get">
product id:<input type="number" name="id" value="<%= p.getId() %>" readonly="readonly"><br><br>
product name:<input type="text" name="name" value="<%= p.getName() %>"><br><br>
product brand:<input type="text" name="brand" value="<%= p.getBrand() %>"><br><br>
product price:<input type="number" name="price" value="<%= p.getPrice() %>"><br><br>
product quantity:<input type="number" name="quantity" value="<%= p.getQuantity() %>"><br><br>
<input type="submit" name="update">


</body>
</html>