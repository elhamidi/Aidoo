
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href="resources/css/style.css" rel="stylesheet">
<!-- <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
<link href="resources/css/font-awesome/font-awesome.css"
	rel="stylesheet">
<!--[if IE 7]>
		<link href="css/font-awesome/font-awesome-ie7.css" rel="stylesheet">
	<![endif]-->

<!-- Web Fonts  -->
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800'
	rel='stylesheet' type='text/css'>
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
	rel='stylesheet' type='text/css'>


<style>
body {
	background: #FFF;
	margin-top: 50px;
}

.effect1 {
	background-color: #fff;
	box-shadow: 1px 1px 6px 0 #cfcfcf;
}

.box {
	width: 100%;
	height: auto;
	background: #FFF;
	margin: 40px auto;
}
</style>
</head>
<body>


	<div class="container">

		<h3>Inscrivez-vous et profiter de Nos SERVICES</h3>
		<div class="box effect1">

			<div class="row">


				<div class="span1 offset2">
					<span class="circle" style="background: #5DB9F2;"> <i
						class="icon-bolt"></i></span>
				</div>
				<div class="span3">
					<br>
					<h3>
						<a href="${pageContext.request.contextPath}/registration?categorie=customer"> Je
							suis un parent</a>
					</h3>
				</div>

				<div class="span1 offest2">
					<span class="circle" style="background: #80AD00;"><i
						class="icon-leaf"></i></span>
				</div>
				<div class="span3">
					<br>
					<h3>
						<a href="${pageContext.request.contextPath}/registration?categorie=baby-sitter">Je
							suis une Baby-sitter</a>
					</h3>
				</div>

			</div>

			<section class="row"> <article class="span3 offset3">
			<p>sdfsdfsdfsdfsd sdfsdfsdsdfsdfsdfsdfsdfsdfsd sdfsdfsdsdfsdf
				sdfsdfsdfsdfsd sdfsdfsdsdfsdf sdfsdfsdfsdfsd sdfsdfsdsdfsdf</p>
			</article> <article class="span3 offset1">
			<p>sdfsdfsdfsdfsd sdfsdfsdsdfsdf sdfsdfsdfsdfsd
				sdfsdfsdsdfsdfsdfsdfsdfsdfsd sdfsdfsdsdfsdf sdfsdfsdfsdfsd
				sdfsdfsdsdfsdf sdfsdfsdfsdfsd sdfsdfsdsdfsdf</p>
			</article> </section>
		</div>



	</div>

</body>
</html>