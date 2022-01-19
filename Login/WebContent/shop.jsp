<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

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
		
		
		<input type = "submit" name = "Check Cart">
	</form>

</body>
</html>