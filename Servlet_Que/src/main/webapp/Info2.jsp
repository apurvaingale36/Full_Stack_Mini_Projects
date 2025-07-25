<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome to Assignment 3</h2>

<form action="Info" method="get">
	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="n" placeholder="Enter name" required></td>
		</tr>
		
		<tr>
			<td>Surname:</td>
			<td><input type="text" name="s" placeholder="Enter Surname" required></td>
		</tr>
		
		<tr>
			<td>City:</td>
			<td><input type="text" name="c" placeholder="Enter City Name" required></td>
		</tr>
		<tr>
			<td>Phone No:</td>
			<td><input type="text" name="p" placeholder="Enter Phone Number" required></td>
		</tr>
		<tr>
			<td>
				<button type="submit">Submit</button>
			</td>
			
			<td>
				<button type="reset">Reset</button>
			</td>
		</tr>
	</table>
</form>

</body>
</html>