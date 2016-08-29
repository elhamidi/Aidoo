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

						<c:if test="${pageContext.request.userPrincipal.name != null}">
							<li><span> <a
									href="${pageContext.request.contextPath}/home"
									title="Connexion">

										${pageContext.request.userPrincipal.name}</a>

							</span>
							<span class="caret"></span>
							
							</li>
						</c:if>
						<c:if test="${pageContext.request.userPrincipal.name == null}">

							<li><a href="${pageContext.request.contextPath}/inscription"
								title="inscription">Inscription</a></li>


							<li><a href="${pageContext.request.contextPath}/home"
								title="Connexion">Connexion</a></li>
						</c:if>



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