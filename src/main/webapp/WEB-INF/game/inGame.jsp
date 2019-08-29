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
<style>
	#forageCardback{
		margin:auto;
		background:#63a118;
		height:180px;
		width:120px;
		border-radius:10px;
		border:solid 3px black;
	}
	#nightCardback{
		margin:auto;
		background:#1d0857;
		height:180px;
		width:120px;
		border-radius:10px;
		border:solid 3px black;
	}
	#madnessCardback{
		margin:auto;
		background:gold;
		height:180px;
		width:120px;
		border-radius:10px;
		border:solid 3px black;
	}
	.cardIcon{
		height:50px;
		width:50px;
		margin-top:55px;
	}
</style>
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
					<div class="col-4 p-2 border rounded" style="height: 250px;">
						<h3>Forage</h3>
						<div id="forageCardback">
							<img class="cardIcon" src="../../img/forge.png">
						</div>
					</div>
					<div class="col-4 p-2 border rounded" style="height: 250px;">
						<h3>Night</h3>
						<div id="nightCardback">
							<img class="cardIcon" src="../../img/night.png">
						</div>
					</div>
					<div class="col-4 p-2 border rounded" style="height: 250px;">
						<h3>Madness</h3>
						<div id="madnessCardback">
							<img class="cardIcon" src="../../img/madness.png">
						</div>
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