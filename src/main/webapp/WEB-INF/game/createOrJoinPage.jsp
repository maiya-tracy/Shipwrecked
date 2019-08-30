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
<style>
.addForm {
	margin: auto;
}

#wrapper {
	background-image: url("../../img/parchment.jpg");
	background-repeat: no-repeat;
	background-size: 100% 100%;
	width: 100 vw;
	height: 100vh;
}

#ocean {
	background: rgb(4, 0, 71);
	background: linear-gradient(0deg, rgba(4, 0, 71, 1) 0%,
		rgba(16, 16, 159, 1) 35%, rgba(186, 239, 250, 1) 100%);
	background-size: 100% 100%;
	height: 100vh;
	width: 100vw;
}

#title {
	font-family: 'Lacquer', sans-serif;
	font-size: 40px;
	/* color:#8a5421; */
	background: -webkit-linear-gradient(#d4ba78, #786227);
	-webkit-background-clip: text;
	-webkit-text-fill-color: transparent;
}

.card-background {
	background-color: transparent;
	border-style: none;
	
}
</style>

<title>Create or Join</title>
</head>
<body>


	<%-- <div class="container-fluid text-center" id="ocean">
		<div class="row">
			<div class="col-sm-3 addForm">
				<!-- Create Table  -->
				<h4 id="title" class="page-header">Create A Game</h4>
				<form:form action="/getShipwrecked/process" method="post"
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
					<input type="submit" class="btn btn-success" />
				</form:form>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-3 addForm">
				<!-- JOIN TABLE  -->
				<h4 id="title" class="page-header mt-5">Join a Game</h4>
				<form action="/getShipwrecked/process/join" method="post">

					<div class="form-group float-label-control">
						<label for="lobbyJoinName">Lobby Name:</label> <input
							name="lobbyJoinName" type="text" class="form-control"
							placeholder="Lobby Name" />
					</div>

					<div class="form-group float-label-control">
						<label for="password">Password (Optional):</label> <input
							name="password" type="password" class="form-control"
							placeholder="Password Optional" />
					</div>

					<input type="submit" class="btn btn-success" />
				</form>
			</div>
		</div>
	</div>  --%>

	<div id="ocean" class="container-fluid p-0 bb-0">
		<div class=" dropdown accordion container-fluid text-center p-0"
			id="accordionExample">

			<div class="card card-background">
				<div class="card-header border-bottom-0" id="headingOne">
					<h2>
						<button class="btn btn-link" type="button" data-toggle="collapse"
							data-target="#collapseOne" aria-expanded="true"
							aria-controls="collapseOne">
							<h4 id="title" class="page-header">Create A Game</h4>
						</button>
					</h2>
				</div>

				<div id="collapseOne" class="collapse show"
					aria-labelledby="headingOne" data-parent="#accordionExample">
					<div class="card-body col-sm-3 addForm">
						<form action="/getShipwrecked/process/join" method="post">

							<div class="form-group float-label-control">
								<label for="lobbyJoinName">Lobby Name:</label> <input
									name="lobbyJoinName" type="text" class="form-control text-center"
									placeholder="Lobby Name" />
							</div>
							<div class="form-group float-label-control">
								<label for="password">Password (Optional):</label> <input
									name="password" type="password" class="form-control text-center"
									placeholder="Password Optional" />
							</div>
							<input type="submit" class="btn btn-outline-info" />
						</form>
					</div>
				</div>
			</div>
		</div>
		
		<div class="accordion container-fluid text-center p-0"
			id="accordionExample">
			<div class="card card-background">
				<div class="card-header border-bottom-0" id="headingTwo">
					<h2>
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseTwo"
							aria-expanded="false" aria-controls="collapseTwo">
							<h4 id="title" class="page-header">Join A Game</h4>
						</button>
					</h2>
				</div>
				<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
					data-parent="#accordionExample">
					<div class="card-body col-sm-3 addForm">
						<form action="/getShipwrecked/process/join" method="post">

							<div class="form-group float-label-control">
								<label for="lobbyJoinName">Lobby Name:</label> <input
									name="lobbyJoinName" type="text" class="form-control text-center"
									placeholder="Lobby Name" />
							</div>

							<div class="form-group float-label-control">
								<label for="password">Password (Optional):</label> <input
									name="password" type="password" class="form-control text-center"
									placeholder="Password Optional" />
							</div>

							<input type="submit" class="btn btn-outline-info" />
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>