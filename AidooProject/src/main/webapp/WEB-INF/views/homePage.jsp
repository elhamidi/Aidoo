<%@include file="header.jsp"%>


<!-- Content Here -->

</section>
<!-- end .container -->

<div class="lead-container">
	<div class="container">

		<!-- Macbook carousel -->
		<div id="carousel" class="carousel slide stacked" rel="carousel">

			<!-- Carousel items -->
			<div class="carousel-inner">
				<!-- Item -->
				<div class="item active">
					<img alt="" src="resources/img/silde1.jpg" />
				</div>
				<!-- end Item -->
				<!-- Item -->
				<div class="item">
					<img alt="" src="resources/img/Silde2.jpg" />
				</div>
				<!-- end Item -->
				<!-- Item -->
				<div class="item">
					<img alt="" src="resources/img/slide4.jpg" />
				</div>
				<!-- end Item -->
			</div>
			<!-- Carousel navigation -->
			<a class="carousel-control left" href="#carousel" data-slide="prev"></a>
			<a class="carousel-control right" href="#carousel" data-slide="next"></a>

		</div>
		<!-- end Macbook carousel -->

		<!-- 4 menus du bas -->

		<div class="row" id="inputs"
			style="margin-top: 50px; margin-bottom: 50px;">
			<form action="annonces" method="get">
				<div class="span2 offset1">
					<h4>Je Chercher</h4>
				</div>

				<div class="span3">
					<select name="catname">
						<c:forEach items="${categories}" var="cat">

							<option value="${cat.name}">${cat.name}</option>

						</c:forEach>
					</select>
				</div>
				<div class="span3">
					<select name="zipcode">
						<c:forEach items="${zipcodes}" var="zip">

							<option value="${zip.zipCode}">${zip.zipName}
								${zip.zipCode}</option>

						</c:forEach>

					</select>
				</div>

				<div class="span3">
					<button type="submit">Rechercher</button>
				</div>
			</form>
		</div>

		<!-- fin 4 menus du bas -->
		<hr>

		<!-- Debut partie images Explain -->

		<section class="row" id="portfolio">

			<!-- portfolio item-->
			<article class="span3 project">

				<div class="thumbnail">
					<!-- image -->
					<img alt="" src="resources/img/search-icon.png">

					<!-- description -->
					<div class="project-description">
						<!-- icon -->
						<i class="icon-search"></i>
						<!-- name -->
						<b class="project-name">Je cherche</b>
					</div>
					<!-- ribbon -->
					<div class="ribbon">
						<span>Aidoo</span>
					</div>
				</div>


			</article>
			<!-- end portfolio item-->

			<article class="span3 project ">
				<div class="thumbnail">
					<img alt="" src="resources/img/select.png">
					<div class="project-description">
						<b class="name">Je selectionne</b> <i class="icon-ok"></i>
					</div>
				</div>

			</article>

			<article class="span3 project ">
				<div class="thumbnail">
					<img alt="" src="resources/img/contactUs.png">

					<div class="project-description">
						<b class="name">Je contacte</b> <i class="icon-envelope"></i>
					</div>
				</div>

			</article>

			<article class="span3 project ">
				<div class="thumbnail">
					<img alt="" src="resources/img/JeRecommande.png">

					<div class="project-description">
						<b class="name">Je Recommande</b> <i class="icon-thumbs-up"></i>
					</div>
				</div>

			</article>

		</section>

		<!-- Fin partie image -->

		<hr>

		<!-- DEBUT -- menu du bas avec logo	-->

		<div class="services">
			<ul class="nav nav-tabs">
				<li rel="service-1" class=""><a href="#service-1"
					data-toggle="tab">
						<div>

							<h4>Qui sommes nous ?</h4>
						</div>
				</a></li>
				<li rel="service-2"><a href="#service-2" data-toggle="tab">
						<div>

							<h4>Comment ca marche ?</h4>
						</div>
				</a></li>
				<li rel="service-3" class="active"><a href="#service-3"
					data-toggle="tab">
						<div>

							<h4>En Savoir plus</h4>
						</div>
				</a></li>

			</ul>
			<div class="tab-content">
				<div id="service-1" class="tab-pane">
					<span class="price"> <img
						src="resources/img/icons/globe.png" />
					</span>

					<h3>A Propos de Nous</h3>

					<p>Professionally designed, custom websites with integrated web
						content management systems (CMS). We're dedicated to providing
						small businesses and organizations with high-quality web design
						and web development services at a remarkably competitive value.</p>
					<a class="button orange fr" href="work.html">Nous Contactez</a>
					<p>Cupcake ipsum dolor sit amet wafer gummi bears pudding
						applicake. Jujubes brownie powder. Sweet roll powder gingerbread
						gummies. Cupcake ice cream sweet roll pie lollipop. Jelly-o
						jelly-o apple pie chupa chups jelly jujubes gingerbread.</p>

				</div>
				<div id="service-2" class="tab-pane">
					
					<h3>Un mode de fonctionnement facile et efficace</h3>
					<p>Donec at ex metus. Ut pulvinar turpis ligula, sit amet
						dapibus lorem lobortis in. Proin et est in ipsum laoreet semper
						eget vitae nunc. Nullam vehicula porttitor sem feugiat molestie.
						Nulla sagittis auctor eros nec ultrices. Suspendisse potenti.
						Quisque libero tortor, gravida a justo vel, volutpat dignissim
						lorem. Nunc iaculis dolor luctus, molestie massa at, auctor diam.
						Integer ut eros tortor..</p>
				</div>
				<div id="service-3" class="tab-pane active">
					<h3>En Savoir Plus</h3>
					<p>Cupcake ipsum dolor sit amet wafer gummi bears pudding
						applicake. Jujubes brownie powder. Sweet roll powder gingerbread
						gummies. Cupcake ice cream sweet roll pie lollipop. Jelly-o
						jelly-o apple pie chupa chups jelly jujubes gingerbread. Icing
						carrot cake powder chupa chups. Pudding sweet roll jelly-o muffin
						faworki biscuit. Marzipan marshmallow cake tiramisu caramels bear
						claw carrot cake cotton candy. Toffee danish sweet roll. Cookie
						topping powder toffee ice cream muffin dragée. Soufflé caramels
						apple pie chocolate cake cookie cake. Macaroon tiramisu halvah
						soufflé. Dessert toffee halvah chocolate cake bear claw.</p>
				</div>
				<div id="service-4" class="tab-pane">
					<h3>SEO - Search engine optimization and services</h3>
					<p>Cupcake ipsum dolor sit amet wafer gummi bears pudding
						applicake. Jujubes brownie powder. Sweet roll powder gingerbread
						gummies. Cupcake ice cream sweet roll pie lollipop. Jelly-o
						jelly-o apple pie chupa chups jelly jujubes gingerbread. Icing
						carrot cake powder chupa chups. Pudding sweet roll jelly-o muffin
						faworki biscuit. Marzipan marshmallow cake tiramisu caramels bear
						claw carrot cake cotton candy. Toffee danish sweet roll. Cookie
						topping powder toffee ice cream muffin dragée. Soufflé caramels
						apple pie chocolate cake cookie cake. Macaroon tiramisu halvah
						soufflé. Dessert toffee halvah chocolate cake bear claw.</p>
				</div>
				<div id="service-5" class="tab-pane">
					<h3>Branding and identity design</h3>
					<p>Cupcake ipsum dolor sit amet wafer gummi bears pudding
						applicake. Jujubes brownie powder. Sweet roll powder gingerbread
						gummies. Cupcake ice cream sweet roll pie lollipop. Jelly-o
						jelly-o apple pie chupa chups jelly jujubes gingerbread. Icing
						carrot cake powder chupa chups. Pudding sweet roll jelly-o muffin
						faworki biscuit. Marzipan marshmallow cake tiramisu caramels bear
						claw carrot cake cotton candy. Toffee danish sweet roll. Cookie
						topping powder toffee ice cream muffin dragée. Soufflé caramels
						apple pie chocolate cake cookie cake. Macaroon tiramisu halvah
						soufflé. Dessert toffee halvah chocolate cake bear claw.</p>
				</div>
			</div>
		</div>

	</div>
	</div>

	<!-- end of Content -->

	<%@ include file="footer.jsp"%>