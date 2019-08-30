<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://kit.fontawesome.com/cde5077fb4.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid pt-5">
	<div class="container col-4 border" style="height: 200px;">
		<h1 class="text-center m-0">Player 1</h1>
		<div class="text-center text-danger m-0">
			<i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-3 border" style="height: 200px;">
				<h1 class="text-center m-0">Player 2</h1>
				<div class="text-center text-danger m-0">
					<i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i>
				</div>
			</div>
			<div class="col-6 border-right border-left border-top">
				<div class="row text-center">
					<div class="col-4 p-2 border rounded bg-success" style="height: 250px;">
						<h3>Forage</h3>
					</div>
					<div class="col-4 p-2 border rounded bg-dark" style="height: 250px;">
						<h3>Night</h3>
					</div>
					<div class="col-4 p-2 border rounded bg-warning" style="height: 250px;">
						<h3>Madness</h3>
					</div>
				</div>
			</div>
			<div class="col-3 border" style="height: 200px;">
				<h1 class="text-center m-0">Player 3</h1>
				<div class="text-center text-danger m-0">
					<i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-3 border" style="height: 200px;">
				<h1 class="text-center m-0" >Player 4</h1>
				<div class="text-center text-danger m-0">
					<i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i>
				</div>
			</div>
			<div class="col-6 border-right border-left border-bottom" style="height: 250px;">
				<h1 class="text-center text-danger">FIYAHH</h1>
				<a href="" class="btn btn-primary d-block" align="center">Next Phase</a>
			</div>
			<div class="col-3 border m-0" style="height: 200px;">
				<h1 class="text-center">Player 5</h1>
				<div class="text-center text-danger m-0">
					<i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i>
				</div>
			</div>
		</div>
	</div>
	<div class="container col-4 border" style="height: 200px;">
		<h1 class="text-center m-0">Player 6</h1>
		<div class="text-center text-danger m-0">
			<i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i><i class="fas fa-heart mr-1"></i>
		</div>
	</div>
</div>
</body>
</html>