<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Shipwrecked</title>
</head>
<style>
	#island{
		position:relative;
		margin:0 auto;
		width:70%;
		height:auto;
		margin-top:100px;
	}
	#header{
		position:relative;
		margin:0 auto;
		width:100%;
		height:315px;
		background:#c4fbff;
	}
	.test{
		background-image:url(<c:url value="/img/island3.png") />;
		width: 100%;
		height: auto;
	}
</style>
<body>
<<<<<<< HEAD
	<div class="container">
		<p>Landing Page</p>
	<a href="/getShipwrecked">Create Game</a>
	</div>
=======
<div class="container">
	<div id="header" class="container-fluid">
		<img id="island" src=<c:url value="/img/island4.png"/>>
	</div>
	<div id="main">
		<div id="test" style='background-image:url(<c:url value="/img/island4.png" />)'></div>
	</div>
	<div id="footer"></div>
</div>
>>>>>>> eb558f9437e74288aa4ff8fdfbb22a76e9334c38
</body>
</html>