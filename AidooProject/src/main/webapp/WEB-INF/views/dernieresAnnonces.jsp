<%@include file="header.jsp"%> 


<!-- Content Here -->

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
				<img alt="" src="resources/img/${annonce.person.picture}.jpg" />
			</div>
		</article>
		</c:forEach>

		

	</section>	</section>


<!-- end of Content -->

<%@ include file="footer.jsp"%> 