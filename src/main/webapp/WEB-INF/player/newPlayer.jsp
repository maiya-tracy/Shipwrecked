<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<link
	href="https://fonts.googleapis.com/css?family=Lacquer&display=swap"
	rel="stylesheet">

<title>New Player</title>
</head>

<style>
.addForm {
	margin: 30vh auto;
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
</style>

<body>
	<div class="container-fluid" id="ocean">
		<div class="row">
			<div class="col-sm-8">
				<h4 id="title" class="page-header text-light">Create a New
					Player</h4>
				<form:form action="/newPlayer/process" method="post"
					modelAttribute="newPlayer" role="form">
					<div class="form-group float-label-control">
						<form:label path="userName"></form:label>
						<small><form:errors path="userName" class="text-danger" /></small>
						<form:input path="userName" type="text"
							class="form-control text-center" placeholder="User Name" />
					</div>
					<input type="submit" class="btn btn-outline-info" />
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>