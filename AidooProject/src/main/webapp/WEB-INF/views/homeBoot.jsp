<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="resources/css/style.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-default ">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Aidoo</a>
		</div>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="#"><span class="glyphicon glyphicon-user"></span>
					Sign Up</a></li>
			<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
					Login</a></li>
		</ul>
	</div>
	</nav>

	<!-- 	Carroussel -->

	<div class="container">
		<br>
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">

				<div class="item active">
					<img src="http://placehold.it/1350x450" alt="Chania">

				</div>

				<div class="item">
					<img src="http://placehold.it/1350x450" alt="Chania">

				</div>

				<div class="item">
					<img src="http://placehold.it/1350x450" alt="Flower">
					<div class="carousel-caption">
						<h3>Flowers</h3>
						<p>Beatiful flowers in Kolymbari, Crete.</p>
					</div>
				</div>

				<div class="item">
					<img src="http://placehold.it/1350x450" alt="Flower">
					<div class="carousel-caption">
						<h3>Flowers</h3>
						<p>Beatiful flowers in Kolymbari, Crete.</p>
					</div>
				</div>

			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>

	<!-- End Carroussel -->


	<!-- Search Criteria Bar -->

	<div class="container" style="padding-top: 30px;">

		<div class="row">

			<form action="annonce" method="Post">
				<div class="col-md-3 ">
					<select id="select01" style="">
						<option>Je Cherche</option>
						<option>Select me!</option>
					</select>
				</div>

				<div class="col-md-3 ">
					<input type="text" class="form control">
				</div>
				<div class="col-md-3 ">
					<select id="select03">
						<option>Distance</option>
						<option>Select me!</option>
					</select>
				</div>
				<div class="col-md-3 ">
					<button type="submit" class="btn btn-success btn-sm">Go
						>>></button>
				</div>

			</form>
		</div>


	</div>



	<!-- End Search Criteria Bar -->




</body>
</html>