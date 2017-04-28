<%@ page language="java" contentType="text/html;  charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Classifieds website">
<meta name="author"
	content="Maeva Margueritat, Adrien Duhoux, Moaz Chaudry">

<title>Sign In / Sign Up</title>

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
	<%@include file="head.jsp"%>

	<div class="container">
		<div class="row">
			<div class="col-xs-12 col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<strong>Se connecter </strong>
						</h3>
					</div>
					<div class="panel-body">
						<form role="form" method="post" action="signin">
							<div class="form-group">
								<label for="exampleInputEmail1">Email</label> <input
									type="email" class="form-control" id="exampleInputEmail1" name="inputEmail"
									placeholder="Enter email">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Mot de passe <a
									href="/sessions/forgot_password">(mot de passe oublié ?)</a></label> <input
									type="password" class="form-control" id="exampleInputPassword1" name="inputPassword"
									placeholder="Password">
							</div>
							<button class="btn btn-md btn-primary" type="submit" name="connexion" value="submit">Connexion</button>
							<button class="btn btn-md btn-primary" type="button"
								href="index.jsp">Retour</button>
						</form>
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<strong>S'inscrire</strong>
						</h3>
					</div>
					<div class="panel-body">
						<form role="form">
							<div class="form-group">
								<label class="form-check-label">Vous êtes: <br> <input
									type="radio" class="form-check-input" name="optionsRadios"
									id="optionsRadiosAssociation" value="association" checked>
									Une association<br> <input type="radio" class="form-check-input"
									name="optionsRadios" id="optionsRadiosEntreprise"
									value="entreprise" checked> Une entreprise<br> <input
									type="radio" class="form-check-input" name="optionsRadios"
									id="optionsRadiosParticulier" value="particulier" checked>
									Un particulier<br>
								</label>
							</div>
							<button class="btn btn-md btn-primary" type="submit">Créer un compte
							</button>
							<button class="btn btn-md btn-primary" type="button"
								href="index.jsp">Retour</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>