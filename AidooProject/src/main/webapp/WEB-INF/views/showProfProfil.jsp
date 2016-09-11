<%@ include file="header.jsp"%>
<div class="container" style="margin-top: 20px;">


	<section class="step-container ">



		<div class="hero-unit" style="padding-top: 20px; font-family:"OpenSans", "HelveticaNeue", Helvetica, Arial, sans-serif;">
			<p>Mon Profil</p>
		</div>
		<hr>


		<div class="container-fluid"
			style="border: 1px solid #c0c0c0; padding: 20px;">
			<div class="span3" style="">

				<div style="text-align: center">
					<div style="padding-bottom: 20px;">
						<img style="border-radius: 50%; border: 1px solid #cfcfcf;"
							src="https://static.yoopies.com/media/cache/profil_thumbnail/bundles/yoopiescore/img/user_employer_photo.png?" />
					</div>
					<div>
						<a href="#">Modifier ma photo</a>
					</div>


				</div>


			</div>
			<div class="span7 form-horizontal">
				<div class="control-group">
					<label class="span2  " for="lastname">Nom </label>
					<div class="span3">

						<c:out value="${profilForm.person.lastName}"></c:out>

					</div>
				</div>




				<div class="control-group">
					<label class="span2  " for="firstname">Prénom </label>
					<div class="span3">

						<c:out value="${profilForm.person.firstName}"></c:out>

					</div>
				</div>

				<div class="control-group">
					<label class="span2  " for="firstname">Mobile </label>
					<div class="span3">

						<c:out value="${profilForm.person.mobile}"></c:out>

					</div>
				</div>

				<div class="control-group">
					<label class="span2  " for="firstname">Numéro </label>
					<div class="span3">

						<c:out value="${profilForm.person.num}"></c:out>

					</div>
				</div>
				<div class="control-group">
					<label class="span2  " for="firstname">Rue </label>
					<div class="span3">

						<c:out value="${profilForm.person.street}"></c:out>

					</div>
				</div>

				<div class="control-group">
					<label class="span2  " for="firstname">Code Postal </label>
					<div class="span3">

						<c:out
							value="${person.zipCode.zipName}"></c:out>

					</div>
				</div>


			</div>
		</div>
		<hr>

		<div class="container-fluid"
			style="border: 1px solid #c0c0c0; padding: 20px;">
			<div class="span3" style="">

				<ul class="list-unstyled span3">
					<li><c:if test="${profilForm.professional.smoker==1}">
							<span class="span3 icon icon-ok" style="color: #5ac532"></span>
						</c:if> <c:if test="${profilForm.professional.smoker==0}">
							<span class="span3 icon icon-remove" style="color: red"></span>
						</c:if> Fumeur</li>

					<li><c:if test="${profilForm.professional.children==1}">
							<span class="span3 icon icon-ok" style="color: #5ac532"></span>
						</c:if> <c:if test="${profilForm.professional.children==0}">
							<span class="span3 icon icon-remove" style="color: red"></span>
						</c:if>Enfants</li>

					<li><c:if test="${profilForm.professional.psc1==1}">
							<span class="span3 icon icon-ok" style="color: #5ac532"></span>
						</c:if> <c:if test="${profilForm.professional.psc1==0}">
							<span class="span3 icon icon-remove" style="color: red"></span>
						</c:if>Premiers secours</li>
					<li><c:if test="${profilForm.professional.carLicence==1}">
							<span class="span3 icon icon-ok" style="color: #5ac532"></span>
						</c:if> <c:if test="${profilForm.professional.carLicence==0}">
							<span class="span3 icon icon-remove" style="color: red"></span>
						</c:if>Permis de Conduire</li>
				</ul>
			</div>


			<!-- 			<div class="span3" style=""> -->

			<!-- 				<div class="span3"> -->
			<!-- 					<input type="checkbox"  id="checkboxes-0" value="professional.psc1" /> -->
			<!-- 					Premiers secours -->

			<!-- 				</div> -->
			<!-- 				<div class="span3"> -->
			<!-- 					<div id="checkboxes-1" value="professional.smoker" > </div> -->
			<!-- 					Fumeur -->

			<!-- 				</div> -->
			<!-- 				<div class="span3"> -->
			<%-- 					<input type="checkbox"  id="checkboxes-2" value='<c:out value="${profilForm.professional.psc1}"></c:out>' /> --%>
			<!-- 					Enfants -->

			<!-- 				</div> -->

			<!-- 		</div> -->

			<div class="form-horizontal span7" style="">
				<div class="control-group">
					<label class="span2  " for="firstname" style="">Compte
						Bancaire </label>
					<div class="span3" style="">

						<c:out value="${profilForm.person.accountNumber}"></c:out>

					</div>
				</div>

				<div class="control-group">
					<label class="span2  " for="firstname" style="">NIS </label>
					<div class="span3" style="">

						<c:out value="${profilForm.person.nisNumber}"></c:out>

					</div>
				</div>
				<div class="control-group">
					<label class="span2  " for="firstname">Tarif Horaire</label>
					<div class="span3">

						<c:out value="${profilForm.professional.hourPrice} Euro"></c:out>

					</div>
				</div>
			</div>
		</div>

		<hr>

		<div style="">
			<h4>Annonce</h4>
		</div>

		<c:forEach items="${profilForm.annonces}" var="annonce">
			<div class="control-group " style="padding-bottom: 10px;">
				<label class="span1 control-label" for="titre"
					style="width: auto; padding-bottom: 10px;">Titre </label>
				<div class="span3" style="padding-bottom: 10px;">

					<c:out value="${annonce.title}"></c:out>

				</div>
			</div>


			<div class="container-fluid">
<!-- 				<hidden path="nouvelleAnnonce.id" /> -->
<!-- 				<hidden path="categorieAnnonce.id" /> -->

				<div id="annoncetxt"  class="span10" style="border:1px solid #c0c0c0; padding:10px; "
					rows="10"><c:out value="${annonce.text}"></c:out></div>

			</div>
		</c:forEach>
</div>
</section>

</div>
</body>
</html>