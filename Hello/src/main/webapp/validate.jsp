<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="jdbc.connection.JDBC"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String firstname = request.getParameter("fn");
	String lastname = request.getParameter("ln");
	String email = request.getParameter("em");
	String gender = request.getParameter("gender");

	Connection con = JDBC.getConn();

	PreparedStatement pstmt = con.prepareStatement("INSERT INTO info values(?,?,?,?)");
	pstmt.setString(1, firstname);
	pstmt.setString(2, lastname);
	pstmt.setString(3, email);
	pstmt.setString(4, gender);

	int res = pstmt.executeUpdate();

	if (res > 0) {
		out.println(res + "<h2>record inserted successfully!</h2>");
	}
	%>
	<h2>
		First Name:
		<%=firstname%></h2>
	<h2>
		Last Name:
		<%=lastname%></h2>
	<h2>
		Email:
		<%=email%></h2>
	<h2>
		Gender:
		<%=gender%></h2>
</body>
</html>