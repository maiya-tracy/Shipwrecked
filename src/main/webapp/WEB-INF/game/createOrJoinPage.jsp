<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<!-- css -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!-- JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>


<meta charset="ISO-8859-1">
<title>Create or Join</title>
</head>
<body>
	<div class="container">
		<p>CreateOrJoinPage</p>
		<div class="row">
			<div class="col-sm-8">

				<h4 class="page-header">Create A Game</h4>
				<form:form action="/createGame/process" method="post"
					modelAttribute="newGame" role="form">
					<div class="form-group float-label-control">
						<form:label path="lobbyName">Lobby Name:</form:label>
						<small><form:errors path="lobbyName" class="text-danger" /></small>
						<form:input path="lobbyName" type="text" class="form-control"
							placeholder="Lobby Name" />
					</div>
					<div class="form-group float-label-control">
						<form:label path="password">Password (Optional):</form:label>
						<form:input path="password" type="password" class="form-control"
							placeholder="Password Optional" />
					</div>
					<input type="submit" class="btn btn-success"/>
				</form:form>
			</div>
		</div>
	<div class="row">
			<div class="col-sm-8">

				<h4 class="page-header mt-5">Join a Game</h4>
				<form:form action="/createGame/process" method="post"
					modelAttribute="newGame" role="form">
					<div class="form-group float-label-control">
						<form:label path="lobbyName">Lobby Name:</form:label>
						<small><form:errors path="lobbyName" class="text-danger" /></small>
						<form:input path="lobbyName" type="text" class="form-control"
							placeholder="Lobby Name" />
					</div>
					<div class="form-group float-label-control">
						<form:label path="password">Password (Optional):</form:label>
						<form:input path="password" type="password" class="form-control"
							placeholder="Password Optional" />
					</div>
					<input type="submit" class="btn btn-success"/>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>