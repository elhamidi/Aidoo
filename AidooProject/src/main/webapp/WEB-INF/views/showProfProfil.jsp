<%@ include file="header.jsp" %>
	<div class="container" style="margin-top: 20px;">


		<section class="step-container ">
			


			<div class="hero-unit" style="padding-top: 20px; font-family:"OpenSans", "HelveticaNeue", Helvetica, Arial, sans-serif;">
				<p>Mon Profil </p>
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
					<div class="span7" style="">
						
						

						<div class="control-group">
							<label class="span3 control-label" for="lastname">Nom </label>
							<div class="span4">
								<input id="lastname" path="person.lastName" type="text"
									class="form-control input-md" style="float: left" required="" />
							</div>
						</div>

						<div class="control-group">
							<label class="span3 control-label" for="lastname">Prénom
							</label>
							<div class="span4">
								<input id="firtname" path="person.firstName" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>

						<div class="control-group">
							<label class="span3 control-label" for="lastname">Mobile
							</label>
							<div class="span4">
								<input id="mobile" path="person.mobile" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>
						<div class="control-group">
							<label class="span3 control-label" for="numéro">Numéro </label>
							<div class="span4">
								<input id="numero" path="person.num" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>
						<div class="control-group">
							<label class="span3 control-label" for="lastname">Rue </label>
							<div class="span4">
								<input id="street" path="person.street" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>

						<div class="control-group">
							<label class="span3 control-label" for="lastname">Code
								Postal </label>
							<div class="span4">
								<select path="zipCode.id">
									<c:forEach items="${zipcodes}" var="zip">

										<option value="${zip.id}">${zip.zipCode}
											${zip.zipName}</option>

									</c:forEach>


								</select>
							</div>
						</div>


					</div>
				</div>
				<hr>

				<div class="container-fluid"
					style="border: 1px solid #c0c0c0; padding: 20px;">

					<div class="span3" style="">

						<div class="span3">
							<checkbox path="professional.psc1" id="checkboxes-0"
								value="1" />
							Premiers secours

						</div>
						<div class="span3">
							<checkbox path="professional.smoker" id="checkboxes-1"
								value="1" />
							Fumeur

						</div>
						<div class="span3">
							<checkbox path="professional.children" id="checkboxes-2"
								value="1" />
							Enfants

						</div>




					</div>
					<div class="span7" style="">
						<div class="control-group">
							<label class="span3 control-label" for="lastname">Numéro
								National </label>
							<div class="span4">
								<input id="nis" path="person.nisNumber" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>

						<div class="control-group">
							<label class="span3 control-label" for="Account">Compte
								Bancaire </label>
							<div class="span4">
								<input id="mobile" path="person.accountNumber" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>
						<div class="control-group">
							<label class="span3 control-label" for="numéro">Tarif
								Horaire </label>
							<div class="span4">
								<input id="numero" path="professional.hourPrice"
									type="text" class="form-control input-md  " style="float: left"
									required="" />
							</div>
						</div>

					</div>

				</div>

				<hr>

				<div style="">
					<h4>Annonce</h4>
				</div>
				<div class="control-group " style="">
					<label class="span1 control-label" for="titre" style="width:auto;">Titre </label>
					<div class="span4"  style="">
						<input id="titre" path="nouvelleAnnonce.title" type="text"
							class=" form-control input-md " style="float: left" required="" />
					</div>
				</div>


				<div class="container-fluid">
					<hidden path="nouvelleAnnonce.id" />
					<hidden path="categorieAnnonce.id" />


					<textarea id="annoncetxt" path="nouvelleAnnonce.text"
						class="span8" rows="10" cols="100"></textarea>
				</div>

				<div class="container-fluid" style="border:">
					<div class="offset3" style="">&nbsp</div>
					<div class="span7" style="padding-top: 20px;">

						<div class="span2">
							<button type="submit" class="">Enregistrer</button>
						</div>
						<div class="span1 ">
							<button type="reset" class="btn-success">Réinitialier</button>
						</div>


					</div>

				</div>

			
	</div>
	</section>

	</div>
</body>
</html>