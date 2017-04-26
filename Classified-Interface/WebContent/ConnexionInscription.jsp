<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- CSS -->
<link rel="stylesheet" type="text/css" href="style.css">

<!-- Bootstrap viewport -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap 3 -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<!--GoggleWebFonts -->
<link href="https://fonts.googleapis.com/css?family=Merriweather|Open+Sans"
	rel="stylesheet">
<!-- Frontawesome -->
<script src="https://use.fontawesome.com/dffe9d8685.js"></script>
<title>Connexion & Inscription</title>
</head>
<body>
	
	
	<div class="container">
	
		<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<h1 class="title">Classifieds</h1>
		</div>
		<div class="col-xs-6 col-sm-6 col-md-3 col-lg-3">
			<h2>Connexion</h2>
		</div>
	
		<form class="form-signin" method="post" action="ServletLogin">
			<label for="inputEmailConnexion" class="sr-only">Email address</label> <input
				type="email" id="inputEmailConnexion" name="inputEmailConnexion" class="form-control"
				placeholder="Email address" required autofocus> <label
				for="inputPasswordConnexion" class="sr-only">Password</label> <input
				type="password" id="inputPasswordConnexion" name="inputPasswordConnexion"
				class="form-control" placeholder="Password" required>
				
			<%if((request.getAttribute("errorString"))!=null){ %>
			<div class="alert alert-danger">
				<\br><strong>Erreur!</strong>${errorString}
			</div>
			<%}
			       
				%>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					Remember me
				</label>
			</div>
			<button class="btn inverse btn-lg btn-primary btn-block" type="submit">Connexion</button>
		</form>
		
		<div class="col-xs-6 col-sm-6 col-md-3 col-lg-3">
			<h2>Inscription</h2>
		</div>
		
		

	</div>

</body>
<!--  Bootstarp -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://code.jquery.com/jquery-3.1.1.min.js"
	integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
	crossorigin="anonymous"></script>

<!-- Include all compiled plugins (below), or include individual files as needed -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
	
</html>