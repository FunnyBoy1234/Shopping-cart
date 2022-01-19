<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		if (session.getAttribute("username") == null){
			response.sendRedirect("login.jsp");
		}
		
	%>
		
	Welcome ${username} <br><br>
	
	<form action = "Cart" method = "get">
	
		<select name = "item1">
			<option value = "Socks"> socks </option>
			<option value = "Shirts"> shirts </option>
			<option value = "Pants"> pants </option>
		</select>
		<input type = "text" name = "value1"><br><br>
		
		
		<select name = "item2">
			<option value = "Sunglasses"> sunglasses </option>
			<option value = "Eyeglasses"> eyeglasses </option>
			<option value = "Eyepiece"> eyepiece </option>
		</select>
		<input type = "text" name = "value2"><br><br>
		
		
		<input type = "submit" value = "Check Cart">
	</form>
	

	

</body>
</html>