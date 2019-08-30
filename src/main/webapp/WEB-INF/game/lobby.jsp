<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<meta http-equiv="refresh" content="5">
<title>Shipwrecked | Lobby</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
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
	<div class="container-fluid pt-5" id="ocean">
		<div class="container mt-5 mb-5 pt-5 text-center">
			<h1 class="text-light">Prepare for survival <c:out value="${current_game.lobbyName}" />!</h1>


			
			<%-- <c:out value="${current_player.userName}" />

			<p>
				<c:out value="${player.userName}" />
			</p> --%>


			<div
				class="row border border-dark rounded mt-5 mb-5 shadow-lg table-striped">
				<table class="table table-borderless table-hover text-center text-light">
					<thead>
						<tr>
							<th scope="col"><h3>Player</h3></th>
							<th scope="col"><h3>Avatar</h3></th>
							<th scope="col"><h3>Username</h3></th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${ current_game.players }" var="player"
							varStatus="loop">

							<tr class="table text-light">
									<th scope="row"><c:out value="${loop.index + 1 }" /></th>
									<td>Icon</td>
									<td><c:out value="${player.userName}" /></td>
							</tr>

						</c:forEach>
					</tbody>
				</table>
			</div>
			<a href="/getShipwrecked/${current_game.id }/go" class="btn btn-outline-info"><h2 class="pl-5 pr-5">Start</h2></a>
		</div>
	</div>

</body>

</html>