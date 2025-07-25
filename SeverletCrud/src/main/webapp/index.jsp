<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addservlet" method="post">
		Enter Id: <input type="text" name="userid" /> 
		Enter Name:<input
			type="text" name="username" /> Enter Password:<input type="text"
			
			name="password" /> <input type="submit"> 
			<a href="getallservlet">view records</a> 
			<a href="update.jsp">update record</a>
			<a href="delete.jsp">delete record</a>
			


	</form>
</body>
</html>