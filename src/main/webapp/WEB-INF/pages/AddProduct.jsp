<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Add Product Details:</h1>
<form action="save" method="post">
	<pre>
		CODE:<input type="text" name="prodCode" placeholder="Enter Product Code" /><br>
		COST:<input type="text" name="prodCost" placeholder="Enter Product Cost" /><br>
		TYPE:<select name="prodType">
				<option value="">-SELECT-</option>
				<option value="HIGH">HIGH</option>
				<option value="MID">MID</option>
				<option value="LOW">LOW</option>
			</select>
		Note:<textarea name="prodNote"></textarea>
		<input type ="submit" value="Add">
	</pre>
</form>
${message}
</body>
</html>