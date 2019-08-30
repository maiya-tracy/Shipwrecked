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

<script type="text/javascript" src="js/cardActionsTest.js"></script>


<script>


$(document).ready(function(){
	console.log("ready")

	$.getJSON('../json/forageDeck.json', function(data) {
			var hand = [];
			hand.push(data[0]);
			hand.push(data[1]);
			hand.push(data[2]);
			hand.push(data[3]);			
			console.log("hello");
			console.log(hand);
		})
	})
</script>



</body>
</html>