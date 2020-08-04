<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Show Product</h1>
	<table border ="1">
		<tr>
			<th>ID</th>
			<th>CODE</th>
			<th>COST</th>
			<th>TYPE</th>
			<th>NOTE</th>
			<th>DISCOUNT</th>
			<th>GST</th>
			<th colspan="2">OPERATIONS</th>
		</tr>
		<c:forEach items = "${list}" var="ob">
		<tr>
			<td>${ob.prodId}</td>
			<td>${ob.prodCode}</td>
			<td>${ob.prodCost}</td>
			<td>${ob.prodType}</td>
			<td>${ob.prodNote}</td>
			<td>${ob.prodDiscount}</td>
			<td>${ob.prodGst}</td>
			<td>
				<a href="delete?id=${ob.prodId }">DELETE</a>
			</td>
			<td>
				<a href="edit?id=${ob.prodId }">EDIT</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	${message}
</body>
</html>