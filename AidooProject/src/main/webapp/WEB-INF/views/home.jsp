<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>


<link href="resources/css/bootstrap/bootstrap.css" rel="stylesheet" />
<link href="resources/css/style.css" rel="stylesheet" />


</head>

<body>
	<header id="header">
		<nav class="navbar " style="padding-top: 30px; margin-bottom: 20px">
			<div class="container">

				<!-- Logo -->
				<a class="brand" href="home.html"> Aidoo </a>

				<!-- Navigation -->
				<ul class="nav">

					<!-- Example of item -->
					<li><a href="home.html">Inscription</a></li>

					<!-- Example of selected item - notice the .active class -->
					<li><a href="work.html">Connexion</a></li>

					<!-- Example of 2nd level navigation - notice the .dropdown class and <ul> element -->



				</ul>
			</div>
			<!-- end .container -->
			</div>
			<!-- end .navbar-inner -->
		</nav>
	</header>

	<div class="container-fluid"  style="margin-right: 0px; padding-right: 0px;">
		<div class="row">
			<div>
				<img src="resources/img/slide3.jpg" width="1350">
			</div>
		</div>
		


	</div>
	<div  style="height:100px; background-color: #BADC7F">
	
	
	
	</div>


	<div class="container" style="padding-top: 30px" >
		<div class="hero-unit">
		<p>Last Annouces</p>
		<hr />
	</div>
	<section id="team-members">
	
		<c:forEach items="${annonces}" var="annonce">
		<article class="member">
			<h3 class="member-name"><c:out value="${annonce.person.lastName}"></c:out></h3>
			<h4 class="member-position"><c:out value="${annonce.person.listCountry.countryName}"></c:out></h4>
			<p class="member-networks">
				<a href="#" class="icon-twitter"></a>
				<a href="#" class="icon-linkedin"></a>
				<a href="#" class="icon-facebook"></a>
				<a href="#" class="icon-google-plus"></a>
				<a href="#" class="icon-phone"></a>
				<a href="#" class="icon-envelope"></a>
			</p>
			<p class="member-bio">
				<c:out value="${annonce.text}"></c:out>
			</p>
			<div class="member-avatar">
				<img alt="" src="resources/img/sarcoBaby.jpg" />
			</div>
		</article>

				</c:forEach>

	</section>	</section>

	


		<P>The time on the server</P>

		<c:forEach items="${annonces}" var="annonce">
			<c:out value="${annonce.text}"></c:out>
			<c:out value="${annonce.title}"></c:out>
			<c:out value="${annonce.person.lastName}"></c:out>
		</c:forEach>

	</div>
	</row>
	</div>

	<script type="text/javascript"
		src="src/main/webapp/resources/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</body>
</html>
