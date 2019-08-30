<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

</head>
<body>

<div id="click">hello</div>
<script type="text/javascript" src="js/cardActionsTest.js"></script>


<script>


$(document).ready(function(){
	console.log("ready")

	$( "#click" ).click(function( event ) {
	$.getJSON('../json/forageDeck.json', function(data) {
			var hand = [];
			var nextCard = 0;
			hand.push(data[nextCard]);
			nextCard++;		
			console.log(hand);
			localStorage.setItem('hello','goodbye');
			var obj = localStorage.getItem('hello');
			console.log(obj);
		})
	})	

		var	print = window.localStorage.getItem("hand");
	console.log(print);
});
</script>



</body>
</html>