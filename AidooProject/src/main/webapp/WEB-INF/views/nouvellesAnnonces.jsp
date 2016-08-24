
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="not-ie" lang="en"> <!--<![endif]-->
<head>

	<!-- Basic meta tags -->
	<meta charset="utf-8">
	<title>Aidoo - Dernieres annonces</title>
	<meta name="description" content="Plain is a responsible HTML template with 12-column grid based on popular Twitter Bootstrap framework. This theme is suitable as a clean and easily maintainable template for any business, portfolio or single-project site, with support for mobile devices and latest HTML5 &amp; CSS3 user interface components.">

	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

	<!-- Styles -->
	<link href="resources/css/style.css" rel="stylesheet">
	<link href="resources/css/font-awesome/font-awesome.css" rel="stylesheet">
	<!--[if IE 7]>
		<link href="css/font-awesome/font-awesome-ie7.css" rel="stylesheet">
	<![endif]-->
	
	<!-- Web Fonts  -->
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
	<link href="https://fonts.googleapis.com/css?family=Oxygen" rel="stylesheet">

	<!-- Javascript -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="js/jquery-1.7.2.min.js"><\/script>')</script>
	
	<!-- Internet Explorer condition - HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

<!-- Shared on MafiaShare.net  --><!-- Shared on MafiaShare.net  --></head>
<body>

	<!-- Header
	================================================== -->
	<header id="header" style="margin-bottom: 0px;">

		<!-- Navigation
		================================================== -->
		<nav class="navbar">
			<div class="navbar-inner">
				<div class="container">
					<!-- Logo -->
					<a class="brand" href="index.html">
						Aidoo
					</a>
					<ul class="nav">
						<li><a href="index.html" title="Home">Inscription</a></li>
						<li><a href="work.html" title="Our work">Connexion</a></li>
						
						
					
					</ul>
				</div><!-- end .container -->
			</div><!-- end .navbar-inner -->
		</nav>

	</header>
	
	

	<!-- Content
	================================================== -->
	<section id="content" class="container" style="height: 100%">


	<div class="hero-unit">
		<p style="margin-top:30px">Dernieres annonces</p>
		<hr />
	</div>
	

	<section id="team-members">
		<c:forEach items="${lastAnnounces}" var="annonce" begin="0" end="9">
		<article class="member">
			<h3 class="member-name"><a href="#"><c:out value="${annonce.person.lastName}"></c:out></a></h3>
			<h4 class="member-position"><c:out value="${annonce.person.zipCode.zipName}"></c:out></h4>
<!-- 			<p class="member-networks"> -->
<!-- 				<a href="#" class="icon-twitter"></a> -->
<!-- 				<a href="#" class="icon-linkedin"></a> -->
<!-- 				<a href="#" class="icon-facebook"></a> -->
<!-- 				<a href="#" class="icon-google-plus"></a> -->
<!-- 				<a href="#" class="icon-phone"></a> -->
<!-- 				<a href="#" class="icon-envelope"></a> -->
<!-- 			</p> -->
			<p class="member-bio">
				<c:out value="${annonce.text}"></c:out>
			</p>
			<div class="member-avatar">
				<img alt="" src="resources/img/test.jpg" />
			</div>
		</article>
		</c:forEach>

		

	</section>	</section>

	<!-- Footer
	================================================== -->

	<footer id="footer">
		<div class="container">
			<div class="row">
				<div class="span4">
					<a class="brand" href="index.html">
						Aidoo
					</a>
					<p>
						Creative agency working <br />with web and interactive media. <br />
						Lorem ipsum dolor sit amet.
						
					</p>
				</div>
				<div class="span4 social-networks">
					<h3>Find us elsewhere</h3>
					<p>
						<a class="social-network twitter"></a>
						<a class="social-network facebook"></a>
						<a class="social-network linkedin"></a>
						<a class="social-network dribbble"></a>
						<a class="social-network pinterest"></a>
					</p>
				</div>
				<div class="span4 newsletter">
					<h3>Newsletter</h3>
					<p>Subscribe to our monthly newsletter and be the first to know about our news and special deals!</p>
					<img class="ajax-loader" src="img/ajax-loader.gif" alt="" />
					<form method="post" id="newsletter-form">
						<input type="text" placeholder="Enter your E-mail" name="subscribe" />
						<input type="hidden" name="bot" /><!-- SPAM protection -->
						<button type="submit" class="icon-ok" id="newsletter-subscribe" ></button>
					</form>
				</div> 
			</div> <!-- end .row -->		
		</div> <!-- end .container -->
	</footer><!-- end #footer -->

	<footer id="copyright">
		<div class="container">
			<div class="row">
				<div class="span4">
					&copy; 2010—2012 by <a>Aidoo</a>
				</div>
				<div class="span4">
					<a href="#" title="Send us email">hello@plain.com</a>, 
					+123 320 000 123 456
				</div>
				<div class="span4">
					<a href="http://themeforest.net/item/plain/2616790" rel="external" title="">Aidoo</a> BY <a title="Michal Šimonfy" rel="external" href="http://virae.org">VIRAE</a>
					
				</div>
			</div> <!-- end .row -->		
		</div> <!-- end .container -->
	</footer><!-- end #footer-extra -->

	<!-- Javascript - Placed at the end of the document so the pages load faster 
	================================================== -->

	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/js/jquery.isotope.min.js"></script>
	<script type="text/javascript" src="resources/js/jquery.touchSwipe.js"></script>
	<script type="text/javascript" src="resources/js/jquery.hotkeys.min.js" charset='utf-8'></script>
	<script type="text/javascript" src="resources/js/functions.js"></script>
	
</body>
</html>		