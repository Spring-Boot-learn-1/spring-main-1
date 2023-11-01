<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addUser">
		<label>id: </label><input type="number" name="id"><br>
		<label>name: </label><input type="text" name="name"><br>
		<label>laptop: </label><input type="text" name="laptop"><br>
		<input type="submit" value="submit">
	</form>
	<form action="getUser">
		<label>id: </label><input type="number" name="id"><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>