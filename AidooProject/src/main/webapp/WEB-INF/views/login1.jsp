<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html class="not-ie" lang="en">
<!--<![endif]-->
<head>

<!-- Basic meta tags -->
<meta charset="utf-8">
<title>Aïdoo</title>
<meta name="description"
	content="Plain is a responsible HTML template with 12-column grid based on popular Twitter Bootstrap framework. This theme is suitable as a clean and easily maintainable template for any business, portfolio or single-project site, with support for mobile devices and latest HTML5 &amp; CSS3 user interface components.">

<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- Styles -->
<link href="resources/css/style.css" rel="stylesheet">
<!-- <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
<link href="resources/css/font-awesome/font-awesome.css"
	rel="stylesheet">
<!--[if IE 7]>
		<link href="css/font-awesome/font-awesome-ie7.css" rel="stylesheet">
	<![endif]-->

<!-- Web Fonts  -->
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800'
	rel='stylesheet' type='text/css'>

<!-- Javascript -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script>
	window.jQuery
			|| document
					.write('<script src="js/jquery-1.7.2.min.js"><\/script>')
</script>

<!-- Internet Explorer condition - HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

<!-- Shared on MafiaShare.net  -->
<!-- Shared on MafiaShare.net  -->
</head>
<body>

	<!-- Header
	================================================== -->
	<header id="header">

		<!-- Navigation
		================================================== -->
		<nav class="navbar">
			<div class="navbar-inner">
				<div class="container">
					<!-- Logo -->
					<a class="brand" href="${pageContext.request.contextPath}">
						Aidoo </a>
					<ul class="nav">

						<li><a href="${pageContext.request.contextPath}/inscription"
							title="Inscription">Inscription</a></li>


					</ul>
				</div>
				<!-- end .container -->
			</div>
			<!-- end .navbar-inner -->
		</nav>

	</header>

	<!-- Content
	================================================== -->
	<section id="content" class="container"></section>
	<!-- end .container -->
	<div class="container">

		<div class="container">
			<img src="resources/img/kids_940x287.jpg" />
		</div>

		<div class="hero-unit">
			<p style="margin-top: 50px">Veuillez vous connecter</p>
			<hr />
		</div>


		<!-- Box de Login -->

		<div class=" wrapper ">
		<!-- Si erreur -->
		<c:if test="${not empty error}">
			<div class="alert alert-error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<!-- fin erreur -->


			<form class="form-signin " action="<c:url value="/login" />"
				method='POST'>
				<h2 class="form-signin-heading">login</h2>
				<div class="form-control" style="padding-left: 0px">
					<input type="text" class="form-control span4" name="username"
						placeholder="Email " required="" autofocus="" />
				</div>
				<div class="form-control" style="padding-left: 0px">
					<input type="password" class="form-control span4" name="password"
						placeholder="Password" required="" />
				</div>
				<div class="form-control">
					<label class="checkbox"> <input type="checkbox"
						value="remember-me" id="rememberMe" name="rememberMe">
						Remember me
					</label>
				</div>

				<div class="control-group">

					<button type="submit" class=" btn-small btn-success span1">Login</button>
					<a href="#" class="span2">Mot de passe oublié</a>

				</div>
					
		</div>
		
		
	
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />




		</form>


	</div>
	<!-- Fin du Box Login -->
	</div>


	<%@ include file="footer.jsp"%>