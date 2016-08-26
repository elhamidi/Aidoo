<%@include file="header.jsp"%>
<div class="container">
	<div class="hero-unit">
		<p style="margin-top: 30px">Connexion</p>
		<hr />
	</div>

	<div class=" wrapper ">



		<form class="form-signin">
			<h2 class="form-signin-heading">login</h2>
			<div class="form-control" style="padding-left: 0px">
				<input type="text" class="form-control span4" name="username"
					placeholder="Email " required="" autofocus="" />
			</div>
			<div class="form-control" style="padding-left: 0px">
				<input type="password" class="form-control span4" name="password"
					placeholder="Password" required="" />
			</div>
			<label class="checkbox"> <input type="checkbox"
				value="remember-me" id="rememberMe" name="rememberMe">
				Remember me
			</label> <a class="btn btn-md btn-success btn-block" type="submit">Login</a>
		</form>


	</div>
</div>


<%@ include file="footer.jsp"%>
