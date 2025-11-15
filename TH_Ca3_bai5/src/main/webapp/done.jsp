<%@page import="beans.NumberGuessBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Number Guess</title>
</head>
<body>
	<jsp:useBean id="numguess" class="beans.NumberGuessBean"
		scope="session" />
	<jsp:setProperty name="numguess" property="*" />
	Congratulations! You got it. And after just_
	${numguess.numGuesses}_
	tries.
	<p>
		Care to <a href="guess?action=startAgain">try again</a>?
	</p>
</body>
</html>