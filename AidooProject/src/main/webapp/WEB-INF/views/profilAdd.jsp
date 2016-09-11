
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html>

<html>
<head>
<style>
.step-container {
	padding-top: 20px;
	padding: 46px;
	background-color: #fff;
	box-shadow: 1px 1px 6px 0 #cfcfcf;
}

.head-title {
	text-align: center;
	margin-bottom: 15px;
}

.myBrand {
	font-family: "Open Sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
	text-align: center;
	font-weight: bold;
	font-size: 36px;
	letter-spacing: -2px;
	line-height: 0.7em;
	color: #000;
	-webkit-transition: all 0.1s;
	-moz-transition: all 0.1s;
	-o-transition: all 0.1s;
	-ms-transition: all 0.1s;
	transition: all 0.1s;
}

.myBrand:hover {
	color: #7ED090;
}
</style>
<title>Insert title here</title>
<link href="resources/css/style.css" rel="stylesheet">
</head>
<body>

	<div class="container" style="margin-top: 20px;">


		<section class="step-container ">
			<div>
				<header class="">
					<div class="myBrand">Aidoo</div>

				</header>
				<div style="font-size: 12px; text-align: center; padding-top: 10px;">Une
					nounou de confiance</div>

			</div>


			<div class="hero-unit" style="padding-top: 20px; font-family:"OpenSans", "HelveticaNeue", Helvetica, Arial, sans-serif;">
				<p>Veuillez completer votre profil</p>
			</div>
			<hr>

			<form:form class="form-horizontal" action="addProfProfil"
				commandName="profilForm" method="GET">
				<div class="container-fluid"
					style="border: 1px solid #c0c0c0; padding: 20px;">
					<div class="span3" style="">

						<div style="text-align: center">
							<div style="padding-bottom: 20px;">
								<img style="border-radius: 50%; border: 1px solid #cfcfcf;"
									src="https://static.yoopies.com/media/cache/profil_thumbnail/bundles/yoopiescore/img/user_employer_photo.png?" />
							</div>
							<div>
								<a href="#">Ajouter une image</a>
							</div>


						</div>


					</div>
					<div class="span7" style="">
						<form:hidden path="professional.IdProfessionnalList" />
						<form:hidden path="person.id" />
						<form:hidden path="user.username" />
						<form:hidden path="zipCode.id" />
						<form:hidden path="professional.ProfessionnalCategory" />

						<div class="control-group">
							<label class="span3 control-label" for="lastname">Nom </label>
							<div class="span4">
								<form:input id="lastname" path="person.lastName" type="text"
									class="form-control input-md" style="float: left" required="" />
							</div>
						</div>

						<div class="control-group">
							<label class="span3 control-label" for="lastname">Prénom
							</label>
							<div class="span4">
								<form:input id="firtname" path="person.firstName" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>

						<div class="control-group">
							<label class="span3 control-label" for="lastname">Mobile
							</label>
							<div class="span4">
								<form:input id="mobile" path="person.mobile" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>
						<div class="control-group">
							<label class="span3 control-label" for="numéro">Numéro </label>
							<div class="span4">
								<form:input id="numero" path="person.num" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>
						<div class="control-group">
							<label class="span3 control-label" for="lastname">Rue </label>
							<div class="span4">
								<form:input id="street" path="person.street" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>

						<div class="control-group">
							<label class="span3 control-label" for="lastname">Code
								Postal </label>
							<div class="span4">
								<form:select path="profilForm.zipCode.id">
									<c:forEach items="${zipcodes}" var="zip">

										<option value="${zip.id}">${zip.zipCode}
											${zip.zipName}</option>

									</c:forEach>


								</form:select>
							</div>
						</div>


					</div>
				</div>
				<hr>

				<div class="container-fluid"
					style="border: 1px solid #c0c0c0; padding: 20px;">

					<div class="span3" style="">

						<div class="span3">
							<form:checkbox path="professional.psc1" id="checkboxes-0"
								value="1" />
							Premiers secours

						</div>
						<div class="span3">
							<form:checkbox path="professional.smoker" id="checkboxes-1"
								value="1" />
							Fumeur

						</div>
						<div class="span3">
							<form:checkbox path="professional.children" id="checkboxes-2"
								value="1" />
							Enfants

						</div>




					</div>
					<div class="span7" style="">
						<div class="control-group">
							<label class="span3 control-label" for="lastname">Numéro
								National </label>
							<div class="span4">
								<form:input id="nis" path="person.nisNumber" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>

						<div class="control-group">
							<label class="span3 control-label" for="Account">Compte
								Bancaire </label>
							<div class="span4">
								<form:input id="mobile" path="person.accountNumber" type="text"
									class="form-control input-md  " style="float: left" required="" />
							</div>
						</div>
						<div class="control-group">
							<label class="span3 control-label" for="numéro">Tarif
								Horaire </label>
							<div class="span4">
								<form:input id="numero" path="professional.hourPrice"
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
						<form:input id="titre" path="nouvelleAnnonce.title" type="text"
							class=" form-control input-md " style="float: left" required="" />
					</div>
				</div>


				<div class="container-fluid">
					<form:hidden path="nouvelleAnnonce.id" />
					<form:hidden path="categorieAnnonce.id" />


					<form:textarea id="annoncetxt" path="nouvelleAnnonce.text"
						class="span8" rows="10" cols="100"></form:textarea>
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

			</form:form>
	</div>
	</section>

	</div>
</body>
</html>