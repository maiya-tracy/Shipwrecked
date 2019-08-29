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

<title>New Player</title>
</head>

<style>


#ocean {
        
        background: rgb(24, 216, 227);
        background: radial-gradient(circle, rgba(24, 216, 227, 1) 26%, rgba(71, 78, 196, 1) 100%);
       /*  background-size: 100% 200px; */
        height: 1000px;
    }

</style>
<body>
	<div class="container-fluid" id="ocean">
		<div class="row">
			<div class="col-sm-8">

				<h4 class="page-header">Create A player</h4>
				<form:form action="/newPlayer/process" method="post"
					modelAttribute="newPlayer" role="form">
					<div class="form-group float-label-control">
						<form:label path="userName">User Name:</form:label>
						<small><form:errors path="userName" class="text-danger" /></small>
						<form:input path="userName" type="text" class="form-control"
							placeholder="UserName" />
					</div>
					<input type="submit" class="btn btn-success" />
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>