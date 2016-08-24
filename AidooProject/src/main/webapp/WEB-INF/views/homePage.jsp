<%@include file="header.jsp"%> 


<!-- Content Here -->


	

</section><!-- end .container -->

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
				<img alt="" src="http://placehold.it/940x480/803080/fff" />
			</div>
			<!-- end Item -->
			<!-- Item -->
			<div class="item">
				<img alt="" src="http://placehold.it/940x480/E48285/fff" />
			</div>
			<!-- end Item -->
		</div>
		<!-- Carousel navigation -->
		<a class="carousel-control left" href="#carousel" data-slide="prev"></a>
		<a class="carousel-control right" href="#carousel" data-slide="next"></a>

	</div>
	<!-- end Macbook carousel -->
	
	<!-- 4 menus du bas -->
	
	<div class="row" id="inputs" style="margin-top: 50px; margin-bottom: 50px;">
	<form action="annonces" method="get">
	<div class="span2 offset1">
			<label  >Rechercher</label>
		</div>

		<div class="span3">
			<select name="catname">
				<<c:forEach items="${categories}" var="cat">

							<option value="${cat.name}">${cat.name}</option>

						</c:forEach>
			</select>
		</div>
		<div class="span3">
			<select name="zipcode">
				<c:forEach items="${zipcodes}" var="zip">

							<option value="${zip.zipCode}">${zip.zipName}</option>

						</c:forEach>
				
			</select>
		</div>
		
		<div class="span3">
			<button type="submit"  >Rechercher</button>
		</div>
		</form>
	</div>
	
<!-- fin 4 menus du bas -->

	<!-- DEBUT -- menu du bas avec logo	-->
	
<div class="services">
	<ul class="nav nav-tabs">
		<li rel="service-1" class="">
			<a href="#service-1" data-toggle="tab">
				<div><img src="resources/img/icons/globe.png" alt="">
				<h5>Qui sommes nous ?</h5></div>
			</a>
		</li>
		<li rel="service-2">
			<a href="#service-2" data-toggle="tab">
				<div><img src="resources/img/icons/upload.png" alt="">	
				<h5>Comment ca marche ?</h5></div>
			</a>
		</li>
		<li rel="service-3" class="active">
			<a href="#service-3" data-toggle="tab">
				<div><img src="resources/img/icons/stopwatch.png" alt="">	
				<h5>Encore plus</h5></div>
			</a>
		</li>
	
	</ul>
	<div class="tab-content">
		<div id="service-1" class="tab-pane">
			<span class="price">
				starting at <b>$299</b>
				
			</span>

			<h3>Webdesign and web development</h3>
			
			<p>
				Professionally designed, custom websites with integrated web content management systems (CMS). 
				We're dedicated to providing small businesses and organizations with high-quality web design and web development services at a remarkably competitive value. 
			</p>
			<a class="button orange fr" href="work.html">view our portfolio →</a>	
			<p>
				Cupcake ipsum dolor sit amet wafer gummi bears pudding applicake. Jujubes brownie powder. Sweet roll powder gingerbread gummies. Cupcake ice cream sweet roll pie lollipop. Jelly-o jelly-o apple pie chupa chups jelly jujubes gingerbread. 
			</p>
			
		</div>
		<div id="service-2" class="tab-pane">
			<span class="price">
				starting at <b>$29</b> per month
			</span>
			<h3>Cloud hosting and server related services</h3>
			<p>
				 Cloud computing is a set of pooled computing resources delivered over the Internet. The cloud delivers a hosting environment that doesn't limit an application to a specific set of resources. Depending on the platform, an application can scale dynamically and increase its share of resources on-the-fly.
			</p>
		</div>
		<div id="service-3" class="tab-pane active">
				<h3>Social media training</h3>
				<p>
					Cupcake ipsum dolor sit amet wafer gummi bears pudding applicake. Jujubes brownie powder. Sweet roll powder gingerbread gummies. Cupcake ice cream sweet roll pie lollipop. Jelly-o jelly-o apple pie chupa chups jelly jujubes gingerbread. Icing carrot cake powder chupa chups. Pudding sweet roll jelly-o muffin faworki biscuit. Marzipan marshmallow cake tiramisu caramels bear claw carrot cake cotton candy. Toffee danish sweet roll. Cookie topping powder toffee ice cream muffin dragée. Soufflé caramels apple pie chocolate cake cookie cake. Macaroon tiramisu halvah soufflé. Dessert toffee halvah chocolate cake bear claw.
				</p>
		</div>
		<div id="service-4" class="tab-pane">
				<h3>SEO - Search engine optimization and services</h3>
				<p>
					Cupcake ipsum dolor sit amet wafer gummi bears pudding applicake. Jujubes brownie powder. Sweet roll powder gingerbread gummies. Cupcake ice cream sweet roll pie lollipop. Jelly-o jelly-o apple pie chupa chups jelly jujubes gingerbread. Icing carrot cake powder chupa chups. Pudding sweet roll jelly-o muffin faworki biscuit. Marzipan marshmallow cake tiramisu caramels bear claw carrot cake cotton candy. Toffee danish sweet roll. Cookie topping powder toffee ice cream muffin dragée. Soufflé caramels apple pie chocolate cake cookie cake. Macaroon tiramisu halvah soufflé. Dessert toffee halvah chocolate cake bear claw.
				</p>
		</div>
		<div id="service-5" class="tab-pane">
				<h3>Branding and identity design</h3>
				<p>
					Cupcake ipsum dolor sit amet wafer gummi bears pudding applicake. Jujubes brownie powder. Sweet roll powder gingerbread gummies. Cupcake ice cream sweet roll pie lollipop. Jelly-o jelly-o apple pie chupa chups jelly jujubes gingerbread. Icing carrot cake powder chupa chups. Pudding sweet roll jelly-o muffin faworki biscuit. Marzipan marshmallow cake tiramisu caramels bear claw carrot cake cotton candy. Toffee danish sweet roll. Cookie topping powder toffee ice cream muffin dragée. Soufflé caramels apple pie chocolate cake cookie cake. Macaroon tiramisu halvah soufflé. Dessert toffee halvah chocolate cake bear claw.
				</p>
		</div>
	</div>
</div>
	
</div>

<!-- end of Content -->

<%@ include file="footer.jsp"%> 