<%@ include file="header.jsp"%>
<div class="container" style="margin-top: 20px;">


	<section class=" ">



		<div class="hero-unit" style="font-family:"OpenSans", "HelveticaNeue", Helvetica, Arial, sans-serif;">
			<p>Mon Profil</p>
		</div>
		<hr>

		<div class="container-fluid step-container"
			style="border: 1px solid #c0c0c0;">



			<div class="row" id="inputs"
				style="padding: :0px; vertical-align: middle;">
				<form action="annonces" method="get" style="vertical-align: middle;">

					<div style="padding: :20px; vertical-align: middle;">
						<div class="span3 offset2"
							style="vertical-align: middle; margin-top: 5px;">Je
							chercher Une Baby-Sitter à</div>

						<div class="span3" style="padding: :0px; vertical-align: middle;">
							<select name="zipcode">
								<c:forEach items="${zipcodes}" var="zip">

									<option value="${zip.zipCode}">${zip.zipName}
										${zip.zipCode}</option>

								</c:forEach>

							</select>
						</div>

						<div class="span2" style="padding: :20px; vertical-align: middle;">
							<button class="btn btn-success" type="submit"
								style="float: right">Rechercher</button>
						</div>

					</div>
				</form>
			</div>



		</div>
		<hr>




		<div class="container-fluid step-container"
			style="border: 1px solid #c0c0c0; padding: 20px;">
			<div class="span3" style="">

				<div style="text-align: center">
					<div style="padding-bottom: 20px;">
						<img style="border-radius: 50%; border: 1px solid #cfcfcf;"
							src="https://static.yoopies.com/media/cache/profil_thumbnail/bundles/yoopiescore/img/user_employer_photo.png?" />
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
							value="${profilForm.person.zipCode.zipCode}   ${profilForm.person.zipCode.zipName}"></c:out>

					</div>
				</div>


			</div>
		</div>
		<hr>





		<div class=" step-container">
			<div style="">
				<h3>Annonce</h3>
			</div>

			<c:forEach items="${profilForm.annonces}" var="annonce">
				<div class="control-group " style="padding-bottom: 10px;">
					
					<div class="span3" style="padding-bottom: 10px;">

						<h4>
							<span style="color: #397b9d;"><c:out
									value="${annonce.title}"></c:out></span>
						</h4>

					</div>
				</div>


				<div class="container-fluid">
					<!-- 				<hidden path="nouvelleAnnonce.id" /> -->
					<!-- 				<hidden path="categorieAnnonce.id" /> -->

					<div id="annoncetxt" class="span10" style="margin-left: -20px;" rows="10">
						<c:out value="${annonce.text}"></c:out>
					</div>

				</div>
			</c:forEach>
		</div>

	</section>

</div>
<%@ include file="footer.jsp"%>