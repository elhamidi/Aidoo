

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="header.jsp"%>


<div class="lead-container">
	<div class="container">
		<!--  menus du bas -->
		<form:form class="form-horizontal" action="addProfil" method="Get">
			<div class="form-group">
				<label class="col-md-4 control-label" for="textarea">Annonce
					: </label>
				<div class="col-md-4">
					<form:textarea class="form-control" id="textarea" path="annonce"></form:textarea>
				</div>
				<br>
			</div>
			<fieldset>
				<!-- Form Name -->
				<legend>Profil</legend>
				<!-- Select multiple choices -->
				<!-- Textarea -->


				<!-- ---Début mutli checkbox-------------- -->
				<table id="zoneHoraire" class="table table-striped table-bordered">
					<thead>
						<tr class="active">
							<th></th>
							<th class="hidden-xs">LUN</th>

							<th class="hidden-xs">MAR</th>

							<th class="hidden-xs">MER</th>

							<th class="hidden-xs">JEU</th>

							<th class="hidden-xs">VEN</th>

							<th class="hidden-xs">SAM</th>

							<th class="hidden-xs">DIM</th>

						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="align-left active">Matin</td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="lundicheckboxes-1" value="1"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="lundicheckboxes-2" value="1"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="lundicheckboxes-3" value="1"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="lundicheckboxes-4" value="1"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="lundicheckboxes-5" value="1"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="lundicheckboxes-6" value="1"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="lundicheckboxes-7" value="1"></td>
						</tr>
						<tr>
							<td class="align-left active">Midi</td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
						</tr>
						<tr>
							<td class="align-left active">Apres-Midi</td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
						</tr>
						<tr>
							<td class="align-left active">Soiree</td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
						</tr>
						<tr>
							<td class="align-left active">Week-end</td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
							<td class="align-left active"><input type="checkbox"
								name="checkboxes" id="checkboxes-2" value="3"></td>
						</tr>
						<tr>
					</tbody>
				</table>

				<!-- ---Fin mutli checkbox-------------- -->
				<!-- Form Name -->
				<!-- Multiple Checkboxes (inline) -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="checkboxes">Informations
						:</label>
					<div class="col-md-4">
						<label class="checkbox-inline" for="checkboxes-0"> <input
							type="checkbox" path="professional.smoker" id="checkboxes-0" >
							fumeur
						</label> <label class="checkbox-inline" for="checkboxes-1"> <input
							type="checkbox" path="professional.children" id="checkboxes-1" >
							enfants
						</label>
					</div>
				</div>

				<!-- Multiple Checkboxes (inline) -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="checkboxes">.</label>
					<div class="col-md-4">
						<label class="checkbox-inline" for="checkboxes-2"> <input
							type="checkbox" path="professional.psc1" id="checkboxes-0" >
							premier secours
						</label> <label class="checkbox-inline" for="checkboxes-3"> <input
							type="checkbox" name="professional.carLicence" id="checkboxes-1" >
							motorisé
						</label>
					</div>
				</div>

			</fieldset>
		</form>


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