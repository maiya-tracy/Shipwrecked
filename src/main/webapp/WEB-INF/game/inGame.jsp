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
<meta charset="ISO-8859-1">

<title>Shipwrecked</title>

<script src="https://kit.fontawesome.com/cde5077fb4.js"></script>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="/js/cardActionsTest.js"></script>
<script>
	$(document).ready(function(){
		$(".card").hover(
			function(){$(this).addClass("glow")},
			function(){$(this).removeClass("glow")
		});
		$(".card").click(function(){
			  $(this).animate({top: '350px'},1000);
			  $(this).animate({top: '0px'},0);
			  $("#forageCardStack").addClass("shadow");
			  $("#forageCardStack").removeClass("shadow");
		});
		$(".card").mousedown(
			function(){$(this).addClass("shadowInset")}
		)
		$(".card").mouseup(
			function(){$(this).removeClass("shadowInset")}
		)
	})	

</script>
<style>
	#wrapper{
		background-image:url("../../img/parchment.jpg");
		background-repeat:no-repeat;
		background-size:99% 99%;
		height:99vh;
		width:99vw;
	}
	#forageCardStack{
		margin:auto;
		background-image:url("../../img/forageDeck.png");
		background-size:130px 200px;
		height:200px;
		width:130px;
	}
	#nightCardStack{
		margin:auto;
		background-image:url("../../img/nightDeck.png");
		background-size:130px 200px;
		height:200px;
		width:130px;
	}
	#madnessCardStack{
		margin:auto;
		background-image:url("../../img/madnessDeck.png");
		background-size:135px 200px;
		height:200px;
		width:135px;
	}
	#forageCard{
		background:#63A118;
	}
	#nightCard{
		background:#1D0857;
	}
	#madnessCard{
		background:#FFD700;
	}
	.card{
		height:170px;
		width:110px;
		box-shadow:25px 25px 50px 25px black;
		border-radius:7px;
		border:solid 2px black;
	}
	.cardIcon{
		height:50px;
		width:50px;
		margin-top:55px;
	}
	.playerCards{
		background:#63A118;
		height:75px;
		width:45px;
		border-radius:7px;
		border:solid 2px black;
		display:inline-block;
		margin-bottom:20px;
	}
	#player1Wrapper{
		padding-left:20px;
	}
	#player4Wrapper{
	}
	#player6Wrapper{
		position:absolute;
		right:0;
		margin-right:60px;
		margin-top:-100px;
	}
	#player2Wrapper{
		margin-bottom:20px;
	}
	#player3Wrapper{
	}
	#player5Wrapper{
		margin-left:-20px;
		margin-top:-110px;
	}
	#fire{
		margin-top:70px;
	}
	#cardBox{
		background-image:url("../../img/scroll.png");
		background-repeat:no-repeat;
		background-size:1000px 240px;
		height:240px;
		width:1000px;
		margin:auto;
	}
	.glow{
		box-shadow:0px 0px 150px 50px yellow;
		transition:.2s;
	}
	.shadow{
		box-shadow:0px 0px 50px 30px black;
	}
	.shadowInset{
		box-shadow:0px 0px 20px 5px black inset;
	}
	#blackout{
		margin-top:-700px;
		margin-left:-100px;
		background:black;
		position:fixed;
		height:2000px;
		width:2000px;
		display:none;
	}
</style>

</head>
<body>
<div id="wrapper" class="container-fluid pt-5 text-monospace">
	<div class="container-fluid">
		<div class="row">
			<div id="player1Wrapper" class="col-3" style="height: 120px;">
				<div style="display:inline-block">
					<h1 class="text-center m-0" style="display:inline-block;"><c:out value="${current_game.players.get(0).userName}"/></h1>
				<div class="text-center text-danger m-0">
					<div style="display:inline-block">
						<c:forEach begin="0" end="${current_game.players.get(0).health}" varStatus="loop">
							<i class="fas fa-heart mr-1"></i>
						</c:forEach>
					</div>
				</div>
				</div>
				<div class="playerCards" style="display:inline-block;text-align:center;vertical-align:top">
					<img src="../../img/forge.png" style="height:15px;width:15px;margin:auto;margin-top:28px">
				</div>
			</div>
			<div class="col-6" style="margin-top:-40px">
				<div class="row text-center">
					<div class="col-4 p-2" style="height: 250px;margin-top:25px">
						<div id="forageCardStack" class="shadow">
							<div id="forageCard" class="card">
								<div class="back">
									<img src="../../img/forge.png" style="height:50px;width:50px;margin:auto;margin-top:50px">
								</div>
								<div class="front">
								
								</div>
							</div>
						</div>
					</div>
					<div class="col-4 p-2" style="height: 250px;margin-top:25px">
						<div id="nightCardStack">
							<div id="nightCard" class="card">
								<div class="back">
									<img src="../../img/night.png" style="height:50px;width:50px;margin:auto;margin-top:50px">
								</div>
								<div class="front">
								
								</div>
							</div>
						</div>
					</div>
					<div class="col-4 p-2" style="height: 250px;margin-top:25px">
						<div id="madnessCardStack">
							<div id="madnessCard" class="card">
								<div class="back">
									<img src="../../img/madness.png" style="height:50px;width:50px;margin:auto;margin-top:50px">
								</div>
								<div class="front">
								
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div id="player2Wrapper" class="col-3" style="height: 120px;">
				<div style="display:inline-block">
					<h1 class="text-center m-0" style="display:inline-block;"><c:out value="${current_game.players.get(1).userName}"/></h1>
				<div class="text-center text-danger m-0">
					<div style="display:inline-block">
						<c:forEach begin="0" end="${current_game.players.get(1).health}" varStatus="loop">
							<i class="fas fa-heart mr-1"></i>
						</c:forEach>
					</div>
				</div>
				</div>
				<div class="playerCards" style="display:inline-block;text-align:center;vertical-align:top">
					<img src="../../img/forge.png" style="height:15px;width:15px;margin:auto;margin-top:28px">
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row" style="margin-top:-120px;">
			<div id="player3Wrapper" class="col-3" style="height: 120px;">
				<div style="display:inline-block">
					<h1 class="text-center m-0" style="display:inline-block;"><c:out value="${current_game.players.get(2).userName}"/></h1>
				<div class="text-center text-danger m-0">
					<div style="display:inline-block">
						<c:forEach begin="0" end="${current_game.players.get(2).health}" varStatus="loop">
							<i class="fas fa-heart mr-1"></i>
						</c:forEach>
					</div>
				</div>
				</div>
				<div class="playerCards" style="display:inline-block;text-align:center;vertical-align:top">
					<img src="../../img/forge.png" style="height:15px;width:15px;margin:auto;margin-top:28px">
				</div>
			</div>
			<div id="fire" class="col-6" style="height: 150px;text-align:center">
				<img src="https://media.giphy.com/media/Mp0BJWd9nC5Y4/giphy.gif" style="height:120px;width:auto">
				<a href="" id="phaser" class="btn btn-primary d-block" style="width:200px;margin:auto;background:#633c14;border:none;margin-top:10px">Next Phase</a>
			</div>
			<div id="player4Wrapper" class="col-3" style="height: 120px;">
				<div style="display:inline-block">
					<h1 class="text-center m-0" style="display:inline-block;"><c:out value="${current_game.players.get(3).userName}"/></h1>
				<div class="text-center text-danger m-0">
					<div style="display:inline-block">
						<c:forEach begin="0" end="${current_game.players.get(3).health}" varStatus="loop">
							<i class="fas fa-heart mr-1"></i>
						</c:forEach>
					</div>
				</div>
				</div>
				<div class="playerCards" style="display:inline-block;text-align:center;vertical-align:top">
					<img src="../../img/forge.png" style="height:15px;width:15px;margin:auto;margin-top:28px">
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row" style="position:relative">
			<div id="player5Wrapper" class="col-3" style="height: 120px;">
				<div style="display:inline-block">
					<h1 class="text-center m-0" style="display:inline-block;"><c:out value="${current_game.players.get(4).userName}"/></h1>
				<div class="text-center text-danger m-0">
					<div style="display:inline-block">
						<c:forEach begin="0" end="${current_game.players.get(4).health}" varStatus="loop">
							<i class="fas fa-heart mr-1"></i>
						</c:forEach>
					</div>
				</div>
				</div>
				<div class="playerCards" style="display:inline-block;text-align:center;vertical-align:top">
					<img src="../../img/forge.png" style="height:15px;width:15px;margin:auto;margin-top:28px">
				</div>
			</div>
			<div id="player6Wrapper" class="col-3" style="height: 120px;">
				<div style="display:inline-block">
					<h1 class="text-center m-0" style="display:inline-block;"><c:out value="${current_game.players.get(5).userName}"/></h1>
				<div class="text-center text-danger m-0">
					<div style="display:inline-block">
						<c:forEach begin="0" end="${current_game.players.get(5).health}" varStatus="loop">
							<i class="fas fa-heart mr-1"></i>
						</c:forEach>
					</div>
				</div>
				</div>
				<div class="playerCards" style="display:inline-block;text-align:center;vertical-align:top">
					<img src="../../img/forge.png" style="height:15px;width:15px;margin:auto;margin-top:28px">
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div id="cardBox">
				<div id="player1Cards"></div>
			</div>
		</div>
	</div>
	
</div>
</body>
</html>