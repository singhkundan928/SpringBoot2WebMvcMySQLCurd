<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>PRODUCT EDIT PAGE:</h1>
	<form:form action="update" method="post" modelAttribute="product">
	<pre>
		ID:   <form:input path="prodId" readonly="true" />
		CODE: <form:input path="prodCode"/>
		COST: <form:input path="prodCost"/>
		TYPE: <form:select path="prodType">
			  	<form:option value="">-SELECT-</form:option>
			  	<form:option value="HIGH">HIGH</form:option>
			  	<form:option value="MID">MID</form:option>
			  	<form:option value="LOW">LOW</form:option>
			  </form:select>
	   NOTE:  <form:textarea path="prodNote"/>	
	   <input type="submit" value="Update" />	  
	</pre>
	</form:form>
</body>
</html>