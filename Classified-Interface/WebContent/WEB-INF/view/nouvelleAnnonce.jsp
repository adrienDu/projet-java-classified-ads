<%@page import="com.ecetech.bti4.itproject.classified.dao.CategorieDAO"%>
<%@page import="com.ecetech.bti4.itproject.classified.dao.UserDAO"%>
<%@page import="com.ecetech.bti4.itproject.classified.beans.User"%>
<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
<%@page import="com.ecetech.bti4.itproject.classified.beans.Categorie"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html;  charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Classifieds website">
<meta name="author"
	content="Maeva Margueritat, Adrien Duhoux, Moaz Chaudry">
	<%@include file="head.jsp"%>
<%
	// User user =(User) session.getAttribute("sessionUtilisateur");
	
	System.out.println(user);
%>

<title>Publier une annonce | Classifieds</title>
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
	<div class="container">
		<div class="row">
			<div class="col-xs-offset-1 col-xs-10">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h1>Créer une annonce</h1>
					</div>
					<div class="panel-body">
						<!--<form method="post" action="newAnnonce"> -->
						<form action="newAnnonce" method="post">
							<!-- Name field -->
							<label class="control-label requiredField" for="name">Titre
								de l'annonce</label> <input class="form-control" id="titre" name="titre"
								type="text" /><br />

							<div class="form-group">
								<script language="javascript" type="text/javascript">
									function dynamicdropdown(listindex) {
										document.getElementById("cat").length = 0;
										switch (listindex) {
										case "0":
											document.getElementById("cat").options[0] = new Option(
													"Vehicule", "0");
											document.getElementById("cat").options[1] = new Option(
													"Electromenager", "1");
											document.getElementById("cat").options[2] = new Option(
													"Immobilier", "2");
											document.getElementById("cat").options[3] = new Option(
													"Mobilier", "3");
											document.getElementById("cat").options[4] = new Option(
													"Multimédia", "4");
											document.getElementById("cat").options[5] = new Option(
													"Loisir", "5");
											document.getElementById("cat").options[6] = new Option(
													"Livres", "6");
											document.getElementById("cat").options[7] = new Option(
													"Materiel Proffessionnel",
													"7");
											document.getElementById("cat").options[8] = new Option(
													"Evenement", "8");
											document.getElementById("cat").options[9] = new Option(
													"Maison et Jardin", "9");
											document.getElementById("cat").options[10] = new Option(
													"Autres", "10");
											document.getElementById('divPrix').style.display = '';
											break;
										case "1":
											document.getElementById("cat").options[0] = new Option(
													"Vehicule", "0");
											document.getElementById("cat").options[1] = new Option(
													"Electromenager", "1");
											document.getElementById("cat").options[2] = new Option(
													"Immobilier", "2");
											document.getElementById("cat").options[3] = new Option(
													"Mobilier", "3");
											document.getElementById("cat").options[4] = new Option(
													"Multimédia", "4");
											document.getElementById("cat").options[5] = new Option(
													"Loisir", "5");
											document.getElementById("cat").options[6] = new Option(
													"Livres", "6");
											document.getElementById("cat").options[7] = new Option(
													"Materiel Proffessionnel",
													"7");
											document.getElementById("cat").options[8] = new Option(
													"Evenement", "8");
											document.getElementById("cat").options[9] = new Option(
													"Maison et Jardin", "9");
											document.getElementById("cat").options[10] = new Option(
													"Autres", "10");
											document.getElementById('divPrix').style.display = '';

											break;
										case "2":
											document.getElementById("cat").options[0] = new Option(
													"CDD/CDI", "11");
											document.getElementById("cat").options[1] = new Option(
													"Stages et Alternance",
													"12");
											document.getElementById("cat").options[2] = new Option(
													"Petit Boulots", "13");
											document.getElementById("cat").options[3] = new Option(
													"Activitées et Formations",
													"14");
											document.getElementById("cat").options[4] = new Option(
													"Covoiturage", "13");
											document.getElementById("cat").options[5] = new Option(
													"Autres", "10");
											document.getElementById('divPrix').style.display = 'none';
											document.getElementById('divPrix').value = "0";
											break;
										case "3":
											document.getElementById("cat").options[0] = new Option(
													"CDD/CDI", "11");
											document.getElementById("cat").options[1] = new Option(
													"Stages et Alternance",
													"12");
											document.getElementById("cat").options[2] = new Option(
													"Petit Boulots", "13");
											document.getElementById("cat").options[3] = new Option(
													"Activitées et Formations",
													"14");
											document.getElementById("cat").options[4] = new Option(
													"Covoiturage", "13");
											document.getElementById("cat").options[5] = new Option(
													"Autres", "10");
											document.getElementById('divPrix').style.display = 'none';
											document.getElementById('divPrix').value = "0";
											break;
										case "4":
											document.getElementById("cat").options[0] = new Option(
													"Evenements", "8");
											document.getElementById("cat").options[1] = new Option(
													"Autres", "10");
											document.getElementById('divPrix').style.display = 'none';
											document.getElementById('divPrix').value = "0";

											break;
										}
										return true;
									}
								</script>

								<label class="control-label ">Choissisez un type
									d'annonce :</label> <select name="type"
									class="required-entry form-control" id="type"
									onchange="javascript: dynamicdropdown(this.options[this.selectedIndex].value);">
									<option value="0">Achat</option>
									<option value="1">Vente</option>
									<option value="2">Proposition de service</option>
									<option value="3">Recherche de service</option>
									<option value="4">Information</option>
								</select>
								<div class="sub_category_div" id="sub_category_div">
									<br /> <label class="control-label ">Choissisez une
										catégorie:</label>
									<script type="text/javascript" language="JavaScript">
										document
												.write('<select class="form-control" name="cat" id="cat"><option value="0">Vehicule</option></select>')
									</script>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label requiredField">Description</label></br>
								<textarea class="form-control" cols="40" id="desc" name="desc"
									rows="10"></textarea>
							</div>
							<!-- 
		<div class="form-group">
			<!-- Subject field --
		<label class="control-label ">Image de l'annonce (facultatif)</label>
		<input class="form-control" id="img" name="img" type="file" />
		</div>
		-->
							<div class="form-group">
								<!-- Message field -->
								<label class="control-label ">Lieux de l'annonce (zone
									d'impact)</label> <SELECT class="form-control" name="zone" id="zone"
									size="1">
									<OPTION value="75001">75001</OPTION>
									<OPTION value="75002">75002</OPTION>
									<OPTION value="75003">75003</OPTION>
									<OPTION value="75004">75004</OPTION>
									<OPTION value="75005">75005</OPTION>
									<OPTION value="75006">75006</OPTION>
									<OPTION value="75007">75007</OPTION>
									<OPTION value="75008">75008</OPTION>
									<OPTION value="75009">75009</OPTION>
									<OPTION value="75010">75010</OPTION>
									<OPTION value="75011">75011</OPTION>
									<OPTION value="75012">75012</OPTION>
									<OPTION value="75013">75013</OPTION>
									<OPTION value="75014">75014</OPTION>
									<OPTION value="75015">75015</OPTION>
									<OPTION value="75016">75016</OPTION>
									<OPTION value="75017">75017</OPTION>
									<OPTION value="75018">75018</OPTION>
									<OPTION value="75019">75019</OPTION>
									<OPTION value="75020">75020</OPTION>
								</SELECT>
							</div>
							<div style="display:;" id="divPrix">
								<label class="control-label requiredField" for="prix">Prix
									de l'article ou du service</label> <input class="form-control"
									id="prix" name="prix" type="prix" />
							</div>
							<br />
							<div class="form-group">
								<label class="control-label requiredField">Date de fin
									de l'annonce</label> <input class="form-control" id="dateF"
									name="dateF" type="date" />
							</div>
							<div>
								<label class="control-label requiredField" for="contact">Contact
									pour l'annnonce (si renseigné, il sera visible))</label> <input
									class="form-control" id="contact" name="contact" />
							</div>
							<!--<input class="form-control" id="user" name="user" type="hidden"
								value="E1" /> --><br />
							<div class="form-group">
								<button class="btn btn-primary " name="submit" type="submit">Publier
									l'annonce</button>
								<button class="btn btn-danger " name="annuler" type="button"
									href="WebContent/WEB-INF/view/index.jsp">Annuler</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<!-- Footer -->
		<footer>
		<div class="row">
			<div class="col-lg-12">
				<p>Copyright &copy; Classifieds 2017</p>
			</div>
		</div>
		</footer>
</body>
</html>
