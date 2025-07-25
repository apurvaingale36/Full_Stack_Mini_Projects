<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment 5</title>
</head>
<body>
 <form action="validate.jsp" method="post">
	 <table>
 		<tr>
 			<td>First Name: </td><td><input type="text" name="fn" placeholder="enter your first name"></td>
 		</tr>
 		<tr>
 			<td>Last Name: </td><td><input type="text" name="ln" placeholder="enter your last name"></td>
 		</tr>
 		<tr>
 			<td>Email: </td><td><input type="email" name="em" placeholder="enter your email"></td>
 		</tr>
 		<tr>
 			<td>Gender:</td><td><input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female
					<input type="radio" name="gender" value="other">Other</td>
		</tr>
		<tr>
			<td><button type = "submit">Submit</button> </td> <td><button type="reset">Reset</button> </td>
		</tr>

			<tr></tr>
 	</table>
 
 </form>
</body>
</html>