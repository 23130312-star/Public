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
	Good guess, but nope. Try
	<b>${numguess.hint}</b> You have made ${numguess.numGuesses} guesses.
	<p>I'm think of a number between 1 and 100</p>
	<form method="get" action="guess">
		<p>What's your guess?</p>
		<input type="text" name="guess" /> <input type="submit"
			value="Submit" />
	</form>
</body>
</html>