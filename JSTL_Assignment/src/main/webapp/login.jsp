<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${not empty username}">
			<p>welcome, ${username}</p>
		</c:when>
		<c:otherwise>
			<p>Please login</p>
		</c:otherwise>
	</c:choose>
</body>
</html>