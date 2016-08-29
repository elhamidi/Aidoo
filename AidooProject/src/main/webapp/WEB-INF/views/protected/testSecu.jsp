<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>

	<c:url value="/j_spring_security_logout" var="logoutUrl" />

	<!-- csrt for log out-->
	<form action="logout" method="post" id="logoutForm">
	

            <input type="submit" value="Se Deconnecter avec le formulaire"/>

	</form>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
	<h2>Welcome : ${pageContext.request.userPrincipal.name}
	<a href="logout" >Logout</a></c:if>

<c:url value="j_spring_security_logout" var="logoutUrl" />
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>
<%--   <h2> Voici le nom connecte <c:out value= "${pageContext.request.userPrincipal.name}"  /></h2> --%>
<%-- 	<c:if test="${pageContext.request.userPrincipal.name != null}"> --%>
<!-- 		<h2> -->
<%-- 			Welcome : ${pageContext.request.userPrincipal.name} | <a --%>
<%-- 				href="<c:url value="j_spring_security_logout"/>"> Se Deconnecter avec  un lien HREF</a> --%>
<!-- 		</h2> -->
<%-- 	</c:if> --%>

</body>
</html>