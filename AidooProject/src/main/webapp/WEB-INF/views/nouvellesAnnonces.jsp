<%@include file="header.jsp" %>

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