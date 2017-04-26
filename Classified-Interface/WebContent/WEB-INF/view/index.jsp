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

<title>Classifieds</title>

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

	<!-- Page Content -->
	<div class="container">

		<div class="row">

			<div class="col-md-3">
				<p class="lead">Trier les annonces</p>

				<div class="panel-group" id="accordion" role="tablist"
					aria-multiselectable="true">

					<div class="panel panel-default">
						<div class="panel-heading" role="tab" id="headingOne">
							<h4 class="panel-title">
								<a class="collapsed" role="button" data-toggle="collapse"
									data-parent="#accordion" href="#collapseOne"
									aria-expanded="false" aria-controls="collapseOne"> Achats </a>
							</h4>
						</div>
						<div id="collapseOne" class="panel-collapse collapse"
							role="tabpanel" aria-labelledby="headingOne">
							<div class="panel-body">

								<form name="TriAchats">
									<div class="form-group">
										<div class="checkbox">
											<ul>
												Catégories
												<li class="li-tri"><label> <input
														type="checkbox" name="Autres"> Autres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Electromenager">
														Electroménager
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Evenements"> Evénements
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Immobilier"> Immobilier
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Livres"> Livres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Loisirs"> Loisirs
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="MaisonJardin"> Maison /
														Jardin
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="MaterielPro"> Matériel
														Professionnel
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Mobilier"> Mobilier
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Multimédias"> Multimédias
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Vehicules"> Véhicules
												</label></li>
											</ul>
											<ul>
												Date
												<li class="li-tri"><label><input
														type="checkbox" name="Aujourdhui"> Aujourd'hui </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Semaine"> Cette semaine </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois"> Ce dernier mois </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois3"> Ces 3 derniers mois
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois4+"> Ces 4 ou plus
														derniers mois </label></li>
											</ul>
											<ul>
												Lieux
												<li class="li-tri"><label><input
														type="checkbox" name="75001"> 75001 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75001"> 75002 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75003"> 75003 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75004"> 75004 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75005"> 75005 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75006"> 75006 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75007"> 75007 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75008"> 75008 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75009"> 75009 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75010"> 75010 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75011"> 75011 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75012"> 75012 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75013"> 75013 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75014"> 75014 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75015"> 75015 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75016"> 75016 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75017"> 75017 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75018"> 75018 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75019"> 75019 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75020"> 75020 </label></li>
											</ul>
										</div>
									</div>
									<button type="submit" class="btn btn-default btn-submit">Submit</button>
								</form>

							</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading" role="tab" id="headingTwo">
							<h4 class="panel-title">
								<a class="collapsed" role="button" data-toggle="collapse"
									data-parent="#accordion" href="#collapseTwo"
									aria-expanded="false" aria-controls="collapseTwo"> Ventes </a>
							</h4>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse"
							role="tabpanel" aria-labelledby="headingTwo">
							<div class="panel-body">

								<form name="TriVentes">
									<div class="form-group">
										<div class="checkbox">
											<ul>
												Catégories
												<li class="li-tri"><label> <input
														type="checkbox" name="Autres"> Autres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Electromenager">
														Electroménager
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Evenements"> Evénements
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Immobilier"> Immobilier
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Livres"> Livres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Loisirs"> Loisirs
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="MaisonJardin"> Maison /
														Jardin
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="MaterielPro"> Matériel
														Professionnel
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Mobilier"> Mobilier
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Multimédias"> Multimédias
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Vehicules"> Véhicules
												</label></li>
											</ul>
											<ul>
												Date
												<li class="li-tri"><label><input
														type="checkbox" name="Aujourdhui"> Aujourd'hui </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Semaine"> Cette semaine </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois"> Ce dernier mois </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois3"> Ces 3 derniers mois
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois4+"> Ces 4 ou plus
														derniers mois </label></li>
											</ul>
											<ul>
												Lieux
												<li class="li-tri"><label><input
														type="checkbox" name="75001"> 75001 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75001"> 75002 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75003"> 75003 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75004"> 75004 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75005"> 75005 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75006"> 75006 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75007"> 75007 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75008"> 75008 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75009"> 75009 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75010"> 75010 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75011"> 75011 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75012"> 75012 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75013"> 75013 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75014"> 75014 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75015"> 75015 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75016"> 75016 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75017"> 75017 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75018"> 75018 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75019"> 75019 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75020"> 75020 </label></li>
											</ul>
										</div>
									</div>
									<button type="submit" class="btn btn-default btn-submit">Submit</button>
								</form>

							</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading" role="tab" id="headingThree">
							<h4 class="panel-title">
								<a class="collapsed" role="button" data-toggle="collapse"
									data-parent="#accordion" href="#collapseThree"
									aria-expanded="false" aria-controls="collapseThree">
									Recherches </a>
							</h4>
						</div>
						<div id="collapseThree" class="panel-collapse collapse"
							role="tabpanel" aria-labelledby="headingThree">
							<div class="panel-body">

								<form name="TriRecherches">
									<div class="form-group">
										<div class="checkbox">
											<ul>
												Catégories
												<li class="li-tri"><label> <input
														type="checkbox" name="Autres"> Autres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Covoiturage"> Covoiturage
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Fomrations"> Formations /
														Activités
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Jobs"> Jobs
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="PetitsBoulots"> Petits
														Boulots
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Stages"> Stages /
														Alternances
												</label></li>
											</ul>
											<ul>
												Date
												<li class="li-tri"><label><input
														type="checkbox" name="Aujourdhui"> Aujourd'hui </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Semaine"> Cette semaine </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois"> Ce dernier mois </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois3"> Ces 3 derniers mois
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois4+"> Ces 4 ou plus
														derniers mois </label></li>
											</ul>
											<ul>
												Lieux
												<li class="li-tri"><label><input
														type="checkbox" name="75001"> 75001 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75001"> 75002 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75003"> 75003 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75004"> 75004 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75005"> 75005 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75006"> 75006 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75007"> 75007 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75008"> 75008 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75009"> 75009 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75010"> 75010 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75011"> 75011 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75012"> 75012 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75013"> 75013 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75014"> 75014 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75015"> 75015 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75016"> 75016 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75017"> 75017 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75018"> 75018 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75019"> 75019 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75020"> 75020 </label></li>
											</ul>
										</div>
									</div>
									<button type="submit" class="btn btn-default btn-submit">Submit</button>
								</form>

							</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading" role="tab" id="headingFour">
							<h4 class="panel-title">
								<a class="collapsed" role="button" data-toggle="collapse"
									data-parent="#accordion" href="#collapseFour"
									aria-expanded="false" aria-controls="collapseFour">
									Informations </a>
							</h4>
						</div>
						<div id="collapseFour" class="panel-collapse collapse"
							role="tabpanel" aria-labelledby="headingFour">
							<div class="panel-body">

								<form name="TriInformations">
									<div class="form-group">
										<div class="checkbox">
											<ul>
												Catégories
												<li class="li-tri"><label> <input
														type="checkbox" name="Autres"> Autres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Evenements"> Evénements
												</label></li>
											</ul>
											<ul>
												Date
												<li class="li-tri"><label><input
														type="checkbox" name="Aujourdhui"> Aujourd'hui </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Semaine"> Cette semaine </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois"> Ce dernier mois </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois3"> Ces 3 derniers mois
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="Mois4+"> Ces 4 ou plus
														derniers mois </label></li>
											</ul>
											<ul>
												Lieux
												<li class="li-tri"><label><input
														type="checkbox" name="75001"> 75001 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75001"> 75002 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75003"> 75003 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75004"> 75004 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75005"> 75005 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75006"> 75006 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75007"> 75007 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75008"> 75008 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75009"> 75009 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75010"> 75010 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75011"> 75011 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75012"> 75012 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75013"> 75013 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75014"> 75014 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75015"> 75015 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75016"> 75016 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75017"> 75017 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75018"> 75018 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75019"> 75019 </label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75020"> 75020 </label></li>
											</ul>
										</div>
									</div>
									<button type="submit" class="btn btn-default btn-submit">Submit</button>
								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-9">

				<div class="row">

					<div class="col-md-12">
						<ul class="nav nav-pills navigation">
							<li role="presentation"><a href="#">Achats</a></li>
							<li role="presentation"><a href="#">Ventes</a></li>
							<li role="presentation"><a href="#">Recherches</a></li>
							<li role="presentation"><a href="#">Informations</a></li>
							<li role="presentation" class="disabled pull-right"><a
								href="#">Publier une annonce</a></li>
						</ul>
					</div>

				</div>
				<div class="row">

					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img src="http://placehold.it/320x150" alt="">
							<div class="caption">
								<h4 class="pull-right">$24.99</h4>
								<h4>
									<a href="#">First Product</a>
								</h4>
								<p>
									See more snippets like this online store item at <a
										target="_blank" href="http://www.bootsnipp.com">Bootsnipp
										- http://bootsnipp.com</a>.
								</p>
							</div>
							<div class="ratings">
								<p class="pull-right">15 reviews</p>
								<p>
									<span class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span>
								</p>
							</div>
						</div>
					</div>

					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img src="http://placehold.it/320x150" alt="">
							<div class="caption">
								<h4 class="pull-right">$64.99</h4>
								<h4>
									<a href="#">Second Product</a>
								</h4>
								<p>This is a short description. Lorem ipsum dolor sit amet,
									consectetur adipiscing elit.</p>
							</div>
							<div class="ratings">
								<p class="pull-right">12 reviews</p>
								<p>
									<span class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star-empty"></span>
								</p>
							</div>
						</div>
					</div>

					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img src="http://placehold.it/320x150" alt="">
							<div class="caption">
								<h4 class="pull-right">$74.99</h4>
								<h4>
									<a href="#">Third Product</a>
								</h4>
								<p>This is a short description. Lorem ipsum dolor sit amet,
									consectetur adipiscing elit.</p>
							</div>
							<div class="ratings">
								<p class="pull-right">31 reviews</p>
								<p>
									<span class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star-empty"></span>
								</p>
							</div>
						</div>
					</div>

					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img src="http://placehold.it/320x150" alt="">
							<div class="caption">
								<h4 class="pull-right">$84.99</h4>
								<h4>
									<a href="#">Fourth Product</a>
								</h4>
								<p>This is a short description. Lorem ipsum dolor sit amet,
									consectetur adipiscing elit.</p>
							</div>
							<div class="ratings">
								<p class="pull-right">6 reviews</p>
								<p>
									<span class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star-empty"></span> <span
										class="glyphicon glyphicon-star-empty"></span>
								</p>
							</div>
						</div>
					</div>

					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img src="http://placehold.it/320x150" alt="">
							<div class="caption">
								<h4 class="pull-right">$94.99</h4>
								<h4>
									<a href="#">Fifth Product</a>
								</h4>
								<p>This is a short description. Lorem ipsum dolor sit amet,
									consectetur adipiscing elit.</p>
							</div>
							<div class="ratings">
								<p class="pull-right">18 reviews</p>
								<p>
									<span class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star"></span> <span
										class="glyphicon glyphicon-star-empty"></span>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /.container -->

	<div class="container">

		<hr>

		<!-- Footer -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p>Copyright &copy; Classifieds 2017</p>
				</div>
			</div>
		</footer>

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>
	
</body>

</html>
