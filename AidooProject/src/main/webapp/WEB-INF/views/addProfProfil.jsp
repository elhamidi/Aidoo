

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="header.jsp"%>


<div class="lead-container">
	<div class="container">
		<!--  menus du bas -->
		<form:form class="form-horizontal" action="addProfProfil" method="Get" commandName="profilForm">
			<div class="form-group">
				<label class="col-md-4 control-label" for="textarea">Annonce
					: </label>
					
					<form:hidden path="professional.IdProfessionnalList"  />
				<div class="col-md-4">
					<textarea class="form-control" id="textarea" name="txtArea"></textarea>
				</div>
				<br>
			</div>
			<fieldset>
				<!-- Form Name -->
				<legend>Profil</legend>
				<!-- Select multiple choices -->
				<!-- Textarea -->


				<!-- ---Début mutli checkbox-------------- -->
				

				<!-- ---Fin mutli checkbox-------------- -->
				<!-- Form Name -->
				<!-- Multiple Checkboxes (inline) -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="checkboxes">Informations
						:</label>
					<div class="col-md-4">
						<label class="checkbox-inline" for="checkboxes-0">fumeur
						 <form:checkbox path="professional.smoker" id="checkboxes-0" value="1" />
							
						</label> <label class="checkbox-inline" for="checkboxes-1"> 	enfants
						<form:checkbox  path="professional.children" id="checkboxes-1" value="1"/>
						
						</label>
					</div>
				</div>

				<!-- Multiple Checkboxes (inline) -->
				<div class="form-group">
					<div class="col-md-4">	premier secours
						<label class="checkbox-inline" for="checkboxes-2">
						 <form:checkbox path="professional.psc1" id="checkboxes-0" value="1"/>
						
						</label> <label class="checkbox-inline" for="checkboxes-3"> 	motorisé
						<form:checkbox path="professional.carLicence" id="checkboxes-1" value="1"/>
						
						</label>
					</div>
				</div>

			</fieldset>
	


		<!-- fin multiple choice -->
		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="textinput">Numéro
				national : </label>
			<div class="col-md-4">
				<input id="textinput" name="nis" type="text"
					placeholder="Numéro national :" class="form-control input-md">
			</div>
		</div>

		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="textinput">Compte
				bancaire : </label>
			<div class="col-md-4">
				<input id="textinput" name="bankaccount" type="text"
					placeholder="Compte bancaire :" class="form-control input-md">

			</div>
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">Salaire
					Horaire : </label>
				<div class="col-md-4">
					<input id="textinput" name="salary" type="text"
						placeholder="Salaire horaire" class="form-control input-md">

				</div>
				<br>
				<div class="form-group">
					<label class="col-md-8 control-label" for="button1id"></label>
					<!--  <div class="col-md-8"> -->
					<button id="button1id" name="button1id" class="btn btn-success"
						type="submit">Valider</button>
					<button id="button2id" name="button2id" class="btn btn-danger"
						type="reset">Réinitialiser</button>
					<!--  </div> -->
				</div>
			</div>
			<br>
			<!-- Text input-->

		</div>

		</fieldset>
		</form:form>

		<!-- Button (Double) -->

		<!-- fin  menus du bas -->
	</div>
</div>






<%@ include file="footer.jsp"%>