<%@ page language="java" contentType="text/html;  charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Classifieds website">
<meta name="author"
	content="Maeva Margueritat, Adrien Duhoux, Moaz Chaudry">

<title>Créer un compte | Particulier</title>

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

	<div class="container">
		<div class="row">
			<div class="col-xs-offset-1 col-xs-10">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<strong>Formulaire d'inscription</strong>
						</h3>
					</div>
					<div class="panel-body">
						<form action="" method="post" id="fileForm" role="form">
							<fieldset>
								<legend class="text-center">
									Des informations valides sont nécéssaires pour s'enregistrer.<br>
									<span class="req"><small>*Informations requises</small></span>
								</legend>

								<div class="form-group">
									<label for="nompart"><span class="req">* </span> Nom: </label>
									<input required type="text" name="nomassos" id="nompart"
										class="form-control nompart" maxlength="200"
										onkeyup="Validate(this)" required />
								</div>

								<div class="form-group">
									<label for="prenompart"><span class="req">* </span>
										Prénom: </label> <input class="form-control" type="text"
										name="prenompart" id="txt" onkeyup="Validate(this)" required />
								</div>
								<label>Addresse</label>
								<div class="row">
									<div class="col-xs-2 form-group">
										<label><span class="req">* </span>Numéro de rue:</label> <input
											type="text" class="form-control" required>
									</div>
									<div class="col-xs-10 form-group">
										<label><span class="req">* </span>Nom de rue:</label> <input
											type="text" class="form-control" required>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6 form-group">
										<label><span class="req">* </span>Ville:</label> <input
											type="text" class="form-control" required>
									</div>
									<div class="col-sm-6 form-group">
										<label><span class="req">* </span>Code postal:</label> <input
											type="text" class="form-control" required>
									</div>
								</div>
								<div class="form-group">
									<label for="telassos"><span class="req">* </span>
										Téléphone:</label> <input class="form-control" type="text"
										name="telassos" id="txt" onkeyup="Validate(this)" required />
								</div>
								<div class="form-group">
									<label for="emailassos"><span class="req">* </span>
										Adresse Mail:</label> <input class="form-control" type="text"
										name="emailassos" id="txt" onkeyup="Validate(this)" required />
								</div>
								<div class="form-group">
									<label for="password"><span class="req">* </span> Mot
										de passe: </label> <input required name="password" type="password"
										class="form-control inputpass" minlength="4" maxlength="16"
										id="pass1" /> <label for="password"><span class="req">*
									</span> Confirmation du mot de passe: </label> <input required name="password"
										type="password" class="form-control inputpass" minlength="4"
										maxlength="16" id="pass2" onkeyup="checkPass(); return false;" />
									<span id="confirmMessage" class="confirmMessage"></span>
								</div>

								<div class="form-group">

									<?php //$date_entered = date('m/d/Y H:i:s'); ?>
									<input type="hidden" value="<?php //echo $date_entered; ?>"
										name="dateregistered"> <input type="hidden" value="0"
										name="activate" />
									<hr>

									<input type="checkbox" required name="terms"
										onchange="this.setCustomValidity(validity.valueMissing ? 'Please indicate that you accept the Terms and Conditions' : '');"
										id="field_terms">   <label for="terms">J'accepte
										les <a href="terms.php">conditions d'utilisations </a>
									</label><span class="req">* </span>
								</div>
								<div class="row">
									<div class="col-xs-6">
										<div class="form-group">
											<input class="btn btn-success" type="submit"
												name="submit_reg" value="Créer un compte"> <input
												class="btn btn-warning" type="submit"
												name="submitpremium_reg" value="Créer un compte Premium">

											<input class="btn btn-danger" type="submit"
												name="submitpremium_reg" value="Annuler">
										</div>
									</div>
								</div>
								<h5>Vous allez recevoir un mail pour confirmer votre
									inscription.</h5>
								<h5>Merci de vérifier dans vos mails indésirables</h5>


							</fieldset>
						</form>
						<!-- ends register form -->
					</div>
				</div>
				<script type="text/javascript">
					document
							.getElementById("field_terms")
							.setCustomValidity(
									"Merci d'accepter les conditions et termes d'utilisation");
				</script>
			</div>
			<!-- ends col-10 -->
		</div>
	</div>



	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>