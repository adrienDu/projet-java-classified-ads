<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Classifieds website">
<meta name="author"
	content="Maeva Margueritat, Adrien Duhoux, Moaz Chaudry">

<title>Inscription Particulier</title>

<!--  Icone  -->

<link rel="shortcut icon" href="images/Image1.png">
<link rel="icon" type="image/png" href="images/newspaper.png">


<!-- <div>Icons made by <a href="http://www.flaticon.com/authors/pixel-perfect" title="Pixel perfect">Pixel perfect</a> from <a href="http://www.flaticon.com" title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div> -->

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="css/style.css">

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/shop-homepage.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<%@include file="WEB-INF/view/head.jsp"%>
<h1>Inscription Particulier</h1>
<form class="form-signin" method="post">
			<label> Nom</label>
			<input type="text" id="inputNom" name="inputNom" class="form-control" placeholder="Nom" required autofocus>
			<label>Prénom</label>
			<input type="text" id="inputPrenom" name="inputPrenom" class="form-control" placeholder="Prénom" required autofocus>
			<label>Adresse</label>
			<input type="text" id="inputNumRue" name="inputNumRue" class="form-control" placeholder="Numéro de rue" required autofocus>
			<label >Rue</label>
			<input type="text" id="inputRue" name="inputRue" class="form-control" placeholder="Rue" required autofocus>
			<label >Ville</label>
			<input type="text" id="inputVille" name="inputVille" class="form-control" placeholder="Ville" required autofocus>
			<label>Code Postal</label>
			<input type="number" id="inputCdp" name="inputCdp" class="form-control" placeholder="Code postal" required autofocus>
			<label>Téléphone</label>
			<input type="tel" id="inputPhone" name="inputPhone" class="form-control" placeholder="Numéro de téléphone" required autofocus>
			<label>Adresse mail</label>
			<input type="email" id="inputEmailInscription" name="inputEmailInscription" class="form-control" placeholder="Email address" required autofocus/> 
			<label>Mot de passe</label> 
			<input type="password" id="inputPasswordInscription" name="inputPasswordInscription" class="form-control" placeholder="Password" required>
			<label>Confirmer mot de passe</label> 
			<input type="password" id="inputPasswordInscription" name="inputPasswordInscription" class="form-control" placeholder="Password" required>
			
				
			<%if((request.getAttribute("errorString"))!=null){ %>
			<div class="alert alert-danger">
				<\br><strong>Erreur!</strong>${errorString}
			</div>
			<%}
			       
				%>
				
			
			<button class="btn inverse btn-lg btn-primary btn-block" type="submit">Valider</button>
			
		</form>
		
		<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

</body>
</html>