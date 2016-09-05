
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ include file="header.jsp"%>
<section id="content" class="container"></section>
<!-- end .container -->
<div class="lead-container">
	<div class="container">
		<!--  menus du bas -->

		<div class="hero-unit">
			<p style="margin-top: 30px">Inscription</p>
			<hr />
		</div>

		<div class="wrapper">

			<form:form class="form-horizontal "
				action="${pageContext.request.contextPath}/postRegistration"
				method="POST" commandName="userForm"
				style=" border: 1px solid rgba(0, 0, 0, 0.1);
				 padding: 15px 35px 45px;   margin: 10 auto;">

				<!-- Form Name -->

					<!-- Text input-->
				<div class="control-group">
					<label class="span4 control-label" for="email">UserName </label>
					<div class="span8">
						<form:input id="username" path="user.username" type="text"
							placeholder="username" class="form-control input-md  "
							style="float:left" required="" />

						<p align="center" style="color: red">
							<form:errors path="user.username" />
						</p>
					</div>
				</div>
				<div class="control-group">
					<label class="span4 control-label" for="password">Password
					</label>
					<div class="span8">
						<form:input id="password" path="user.password" type="password"
							class="form-control input-md  " style="float:left" required="" />

						<p align="center" style="color: red">
							<form:errors path="user.password" />
						</p>
					</div>
				</div>




				<!-- Text input-->
				<div class="control-group ">
					<label class="control-label span4" for="textinput">Nom </label>
					<div class="span8">
						<form:input id="textinput" path="person.lastName" type="text"
							placeholder="Nom de famille" class="form-control input-md  "
							style="float:left" required="" />

						<p align="center" style="color: red">
							<form:errors path="person.lastName" />
						</p>

					</div>

				</div>

				<!-- Text input-->
				<div class="control-group">
					<label class="span4 control-label" for="prenom">Prénom </label>
					<div class="span8">
						<form:input id="textinput" path="person.firstName" type="text"
							placeholder="Prénom" class="form-control input-md  "
							style="float:left" required="" />

						<p align="center" style="color: red">
							<form:errors path="person.firstName" />
						</p>

					</div>
				</div>

				<!-- Text input-->
				<div class="control-group">
					<label class="span4 control-label" for="email">Email </label>
					<div class="span8">
						<form:input id="textinput" path="person.email" type="text"
							placeholder="Adresse email" class="form-control input-md  "
							style="float:left" required="" />

						<p align="center" style="color: red">
							<form:errors path="person.email" />
						</p>
					</div>

				</div>

				<div class="control-group">
					<label class="span4 control-label" for="email">Rue </label>
					<div class="span8">
						<form:input id="rue" path="person.street" type="text"
							placeholder="rue" class="form-control input-md  "
							style="float:left" required="" />

						<p align="center" style="color: red">
							<form:errors path="person.street" />
						</p>
					</div>
				</div>


				<div class="control-group">
					<label class="span4 control-label" for="email">Numéro </label>
					<div class="span8">
						<form:input id="numero" path="person.num" type="text"
							placeholder="numero" class="form-control input-md  "
							style="float:left" required="" />

						<p align="center" style="color: red">
							<form:errors path="person.num" />
						</p>
					</div>
				</div>


				<div class="control-group">
					<label class="span4 control-label" for="email">Code Postal
					</label>
					<div class="span8">

						<select name="zipcode">
							<c:forEach items="${zipcodes}" var="zip">

								<option value="${zip.id}">${zip.zipName}
									${zip.zipCode}</option>

							</c:forEach>

						</select>

						
					</div>
				</div>
				
				<div class="control-group">
					<label class="span4 control-label" for="email">Fix </label>
					<div class="span8">
						<form:input id="phonenumber" path="person.phoneNumber" type="text"
							placeholder="phoneNumber" class="form-control input-md  "
							style="float:left" required="" />

						<p align="center" style="color: red">
							<form:errors path="person.phoneNumber" />
						</p>
					</div>
				</div>
					<div class="control-group">
					<label class="span4 control-label" for="email">Mobile </label>
					<div class="span8">
						<form:input id="phonenumber" path="person.mobile" type="text"
							placeholder="mobile" class="form-control input-md  "
							style="float:left" required="" />

						<p align="center" style="color: red">
							<form:errors path="person.mobile" />
						</p>
					</div>
				</div>





			

				<input name="categorie" type="hidden" value="${categorie}">

				<div class="control-group span4 offset2" style="">

					<!--  <div class="col-md-8"> -->

					<button type="submit" class="button ">Enregistrer</button>

					<button type="reset" class="button yellow">Réinitialiser</button>
					<!--  </div> -->
				</div>


				<!-- Text input-->
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />


			</form:form>


		</div>
		<!-- Button (Double) -->

		<!-- fin  menus du bas -->
	</div>
</div>
</section>
<


<%@ include file="footer.jsp"%>