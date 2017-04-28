<%@page import="com.ecetech.bti4.itproject.classified.beans.User"%>
<%@page import="com.ecetech.bti4.itproject.classified.dao.TypeDAO"%>
<%@page import="com.ecetech.bti4.itproject.classified.beans.Type"%>
<%@page import="com.ecetech.bti4.itproject.classified.dao.CategorieDAO"%>
<%@page import="com.ecetech.bti4.itproject.classified.beans.Categorie"%>
<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
<%@page import="com.ecetech.bti4.itproject.classified.dao.AnnonceDAO"%>
<%@page import="com.ecetech.bti4.itproject.classified.beans.Annonce"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html;  charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">

<head>

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
	<%
	
		ArrayList<Annonce> annonces = new ArrayList();
		annonces = (ArrayList<Annonce>) request.getAttribute("annonce");
	%>
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

								<form name="TriAchats" action="ServletIndex">
									<div class="form-group">
										<div class="checkbox">
											<ul>
												Catégories
												<li class="li-tri"><label> <input
														type="checkbox" name="Autres" value="10"> Autres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Electromenager" value="1">
														Electroménager
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Evenements" value="8">
														Evénements
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Immobilier" value="2">
														Immobilier
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Livres" value="6"> Livres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Loisirs" value="5"> Loisirs
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="MaisonJardin" value="9">
														Maison / Jardin
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="MaterielPro" value="7">
														Matériel Professionnel
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Mobilier" value="3">
														Mobilier
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Multimédias" value="4">
														Multimédias
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Vehicules" value="0">
														Véhicules
												</label></li>
											</ul>
											<ul>
												Affichage de la Date
												<br>
												<input type="radio" name="date" value="new"> Du plus
												réçent au plus ancien
												<br>
												<input type="radio" name="date" value="old"> Du plus
												ancien au plus recent
											</ul>
											<ul>
												Lieux
												<li class="li-tri"><label><input
														type="checkbox" name="75001" value="75001"> 75001
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75002" value="75002"> 75002
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75003" value="75003"> 75003
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75004" value="75004"> 75004
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75005" value="75005"> 75005
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75006" value="75006"> 75006
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75007" value="75007"> 75007
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75008" value="75008"> 75008
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75009" value="75009"> 75009
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75010" value="75010"> 75010
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75011" value="75011"> 75011
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75012" value="75012"> 75012
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75013" value="75013"> 75013
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75014" value="75014"> 75014
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75015" value="75015"> 75015
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75016" value="75016"> 75016
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75017" value="75017"> 75017
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75018" value="75018"> 75018
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75019" value="75019"> 75019
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75020" value="75020"> 75020
												</label></li>
											</ul>
										</div>
									</div>
									<button type="submit" name="formachat" value="submit"
										class="btn btn-default btn-submit">Trier</button>
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

								<form name="TriVentes" action="ServletIndex">
									<div class="form-group">
										<div class="checkbox">
											<ul>
												Catégories
												<li class="li-tri"><label> <input
														type="checkbox" name="Autres" value="10"> Autres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Electromenager" value="1">
														Electroménager
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Evenements" value="8">
														Evénements
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Immobilier" value="2">
														Immobilier
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Livres" value="6"> Livres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Loisirs" value="5"> Loisirs
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="MaisonJardin" value="9">
														Maison / Jardin
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="MaterielPro" value="7">
														Matériel Professionnel
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Mobilier" value="3">
														Mobilier
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Multimédias" value="4">
														Multimédias
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Vehicules" value="0">
														Véhicules
												</label></li>
											</ul>
											<ul>
												Affichage de la Date
												<br>
												<input type="radio" name="date" value="new"> Du plus
												réçent au plus ancien
												<br>
												<input type="radio" name="date" value="old"> Du plus
												ancien au plus recent
											</ul>
											<ul>
												Lieux
												<li class="li-tri"><label><input
														type="checkbox" name="75001" value="75001"> 75001
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75002" value="75002"> 75002
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75003" value="75003"> 75003
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75004" value="75004"> 75004
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75005" value="75005"> 75005
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75006" value="75006"> 75006
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75007" value="75007"> 75007
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75008" value="75008"> 75008
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75009" value="75009"> 75009
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75010" value="75010"> 75010
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75011" value="75011"> 75011
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75012" value="75012"> 75012
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75013" value="75013"> 75013
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75014" value="75014"> 75014
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75015" value="75015"> 75015
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75016" value="75016"> 75016
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75017" value="75017"> 75017
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75018" value="75018"> 75018
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75019" value="75019"> 75019
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75020" value="75020"> 75020
												</label></li>
											</ul>
										</div>
									</div>
									<button type="submit" name="trievente" value="submit"
										class="btn btn-default btn-submit">Trier</button>
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
									Recherches service</a>
							</h4>
						</div>
						<div id="collapseThree" class="panel-collapse collapse"
							role="tabpanel" aria-labelledby="headingThree">
							<div class="panel-body">

								<form name="TriREcherche" action="ServletIndex">
									<div class="form-group">
										<div class="checkbox">
											<ul>
												Catégories
												<li class="li-tri"><label> <input
														type="checkbox" name="Autres" value="10"> Autres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Covoiturage" value="15">
														Covoiturage
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Fomrations" value="14">
														Formations / Activités
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Jobs" value="10"> Jobs
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="PetitsBoulots" value="13">
														Petits Boulots
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Stages" value="12"> Stages /
														Alternances
												</label></li>
											</ul>
											<ul>
												Affichage de la Date
												<br>
												<input type="radio" name="date" value="new"> Du plus
												réçent au plus ancien
												<br>
												<input type="radio" name="date" value="old"> Du plus
												ancien au plus recent
											</ul>
											<ul>
												Lieux
												<li class="li-tri"><label><input
														type="checkbox" name="75001" value="75001"> 75001
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75002" value="75002"> 75002
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75003" value="75003"> 75003
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75004" value="75004"> 75004
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75005" value="75005"> 75005
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75006" value="75006"> 75006
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75007" value="75007"> 75007
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75008" value="75008"> 75008
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75009" value="75009"> 75009
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75010" value="75010"> 75010
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75011" value="75011"> 75011
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75012" value="75012"> 75012
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75013" value="75013"> 75013
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75014" value="75014"> 75014
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75015" value="75015"> 75015
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75016" value="75016"> 75016
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75017" value="75017"> 75017
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75018" value="75018"> 75018
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75019" value="75019"> 75019
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75020" value="75020"> 75020
												</label></li>
											</ul>
										</div>
									</div>
									<button type="submit" name="trierecherche" value="submit"
										class="btn btn-default btn-submit">Submit</button>
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
									Propose service </a>
							</h4>
						</div>
						<div id="collapseThree" class="panel-collapse collapse"
							role="tabpanel" aria-labelledby="headingThree">
							<div class="panel-body">

								<form name="PropServ" action="ServletIndex">
									<div class="form-group">
										<div class="checkbox">
											<ul>
												Catégories type="checkbox" name="Autres" value="10"> Autres
												</label>
												</li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Covoiturage" value="15">
														Covoiturage
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Fomrations" value="14">
														Formations / Activités
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Jobs" value="11"> Jobs
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="PetitsBoulots" value="13">
														Petits Boulots
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Stages" value="12"> Stages /
														Alternances
												</label></li>
											</ul>
											<ul>
												Affichage de la Date
												<br>
												<input type="radio" name="date" value="new"> Du plus
												réçent au plus ancien
												<br>
												<input type="radio" name="date" value="old"> Du plus
												ancien au plus recent
											</ul>
											<ul>
												Lieux
												<li class="li-tri"><label><input
														type="checkbox" name="75001" value="75001"> 75001
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75002" value="75002"> 75002
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75003" value="75003"> 75003
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75004" value="75004"> 75004
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75005" value="75005"> 75005
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75006" value="75006"> 75006
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75007" value="75007"> 75007
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75008" value="75008"> 75008
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75009" value="75009"> 75009
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75010" value="75010"> 75010
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75011" value="75011"> 75011
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75012" value="75012"> 75012
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75013" value="75013"> 75013
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75014" value="75014"> 75014
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75015" value="75015"> 75015
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75016" value="75016"> 75016
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75017" value="75017"> 75017
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75018" value="75018"> 75018
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75019" value="75019"> 75019
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75020" value="75020"> 75020
												</label></li>
											</ul>
										</div>
									</div>
									<button type="submit" name="propserv" value="submit"
										class="btn btn-default btn-submit">Submit</button>
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

								<form name="TriInfo" action="ServletIndex">
									<div class="form-group">
										<div class="checkbox">
											<ul>
												Catégories
												<li class="li-tri"><label> <input
														type="checkbox" name="Autres" value="10"> Autres
												</label></li>
												<li class="li-tri"><label> <input
														type="checkbox" name="Evenements" value="8">
														Evénements
												</label></li>
											</ul>
											<ul>
												Affichage de la Date
												<br>
												<input type="radio" name="date" value="new"> Du plus
												réçent au plus ancien
												<br>
												<input type="radio" name="date" value="old"> Du plus
												ancien au plus recent
											</ul>
											<ul>
												Lieux
												<li class="li-tri"><label><input
														type="checkbox" name="75001" value="75001"> 75001
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75002" value="75002"> 75002
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75003" value="75003"> 75003
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75004" value="75004"> 75004
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75005" value="75005"> 75005
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75006" value="75006"> 75006
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75007" value="75007"> 75007
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75008" value="75008"> 75008
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75009" value="75009"> 75009
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75010" value="75010"> 75010
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75011" value="75011"> 75011
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75012" value="75012"> 75012
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75013" value="75013"> 75013
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75014" value="75014"> 75014
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75015" value="75015"> 75015
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75016" value="75016"> 75016
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75017" value="75017"> 75017
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75018" value="75018"> 75018
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75019" value="75019"> 75019
												</label></li>
												<li class="li-tri"><label><input
														type="checkbox" name="75020" value="75020"> 75020
												</label></li>
											</ul>
										</div>
									</div>
									<button type="submit" name="trieinfo" value="submit"
										class="btn btn-default btn-submit">Submit</button>
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
							<%if(!user.getIdUser().isEmpty()){ %><li role="presentation"><a
								href="newAnnonce?add=ok">Publier une annonce</a></li><%} %>
						</ul>
					</div>
				</div>

				<div class="row">
					<%
						if (!annonces.isEmpty()) {
					%>
					<!-- Annonce -->
					<%
						for (Annonce annonce : annonces) {
					%>
					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<!--  <img src="http://placehold.it/320x150" alt="">-->
							<div class="caption">
								<h4 class="pull-right">
									<%
										if (annonce.getPrix() != 0) {
													out.println((int) annonce.getPrix() + "&euro;");
												}
									%>
								</h4>
								<h4>
									<a href="#"> <%
 	out.println(annonce.getTitreAnnonce());
 %>
									</a>
								</h4>
								<p>
									<%
										out.println(annonce.getDescAnnonce());
									%>
								</p>
							</div>
							<div class="ratings">
								<p class="pull-right">
									<%
										out.println(annonce.getZoneAnnonce());
									%>
								</p>
								<p>
									<%
										if (annonce.getType_idType() == 0) {
													out.println("Achat");
												} else if (annonce.getType_idType() == 1) {
													out.println("Vente");
												} else if (annonce.getType_idType() == 2) {
													out.println("Proposition service");
												} else if (annonce.getType_idType() == 3) {
													out.println("Recherche service");
												} else if (annonce.getType_idType() == 4) {
													out.println("Information");
												}
									%>
								</p>
							</div>
						</div>
					</div>
					<%
						}
						} else {
					%>
					<div class="alert alert-info">
						<strong>Info!</strong> Aucune annonce ne correspond a votre
						recherche
					</div>
					<%
						}
					%>
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
