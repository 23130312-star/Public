<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Number Guess</title>
</head>
<body>
	<h1>Welcome to the number Guess game</h1>
	<p>I'm think of a number between 1 and 100</p>
	<form method="get" action="guess">
		<p>What's your guess</p>
		<input type="text" name="guess" /> <input type="submit" value="Submit" />
	</form>
</body>
</html>