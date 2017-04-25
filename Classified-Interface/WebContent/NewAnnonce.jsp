<%@page import="com.ecetech.bti4.itproject.classified.dao.CategorieDAO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
<%@page import="com.ecetech.bti4.itproject.classified.beans.Categorie"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%
	// User user =(User) session.getAttribute("sessionUtilisateur");
%>

<title>Insert title here</title>
</head>
<body>
	<h1>Créer une annonce</h1>
	<form method="post" action="newAnnonce">

		<div class="form-group">
			<!-- Name field -->
			<label class="control-label requiredField" for="name">Titre
				de l'annonce</label> <input class="form-control" id="titre" name="titre"
				type="text" />
		</div>
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
								"Materiel Proffessionnel", "7");
						document.getElementById("cat").options[8] = new Option(
								"Evenement", "8");
						document.getElementById("cat").options[9] = new Option(
								"Maison et Jardin", "9");
						document.getElementById("cat").options[10] = new Option(
								"Autres", "10");
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
								"Materiel Proffessionnel", "7");
						document.getElementById("cat").options[8] = new Option(
								"Evenement", "8");
						document.getElementById("cat").options[9] = new Option(
								"Maison et Jardin", "9");
						document.getElementById("cat").options[10] = new Option(
								"Autres", "10");
						break;
					case "2":
						document.getElementById("cat").options[0] = new Option(
								"CDD/CDI", "11");
						document.getElementById("cat").options[1] = new Option(
								"Stages et Alternance", "12");
						document.getElementById("cat").options[2] = new Option(
								"Petit Boulots", "13");
						document.getElementById("cat").options[3] = new Option(
								"Activitées et Formations", "14");
						document.getElementById("cat").options[4] = new Option(
								"Covoiturage", "13");
						document.getElementById("cat").options[5] = new Option(
								"Autres", "10");
						break;
					case "3":
						document.getElementById("cat").options[0] = new Option(
								"CDD/CDI", "11");
						document.getElementById("cat").options[1] = new Option(
								"Stages et Alternance", "12");
						document.getElementById("cat").options[2] = new Option(
								"Petit Boulots", "13");
						document.getElementById("cat").options[3] = new Option(
								"Activitées et Formations", "14");
						document.getElementById("cat").options[4] = new Option(
								"Covoiturage", "13");
						document.getElementById("cat").options[5] = new Option(
								"Autres", "10");
						break;
					case "4":
						document.getElementById("cat").options[0] = new Option(
								"Evenements", "8");
						document.getElementById("cat").options[1] = new Option(
								"Autres", "10");
						break;
					}
					return true;
				}
			</script>

			<label class="control-label ">Choissisez un type d'annonce :</label>
			<select name="type" class="required-entry" id="type"
				onchange="javascript: dynamicdropdown(this.options[this.selectedIndex].value);">
				<option value="0">Achat</option>
				<option value="1">Vente</option>
				<option value="2">Proposition de service</option>
				<option value="3">Recherche de service</option>
				<option value="4">Information</option>
			</select>
			<div class="sub_category_div" id="sub_category_div">
				Choissisez une catégorie:
				<script type="text/javascript" language="JavaScript">
					document
							.write('<select name="cat" id="cat"><option value="">Vehicule</option></select>')
				</script>
			</div>
		</div>
		</div>
		<div class="form-group">
			<label class="control-label requiredField">Description</label></br>
			<textarea class="form-control" cols="40" id="desc" name="desc"
				rows="10">
				</textarea>
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
			<label class="control-label ">Lieux de l'annonce / impact de
				l'annonce</label> <SELECT name="zone" id="zone" size="1">
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
		<div class="form-group">
			<!-- Name field -->
			<label class="control-label requiredField">Date de fin de
				l'annonce</label> <input class="form-control" id="dateF" name="dateF"
				type="date" />
		</div>

		<input class="form-control" id="user" name="user" type="hidden"
			value="E1" />
		<div class="form-group">
			<button class="btn btn-primary " name="submit" type="submit">Submit</button>
		</div>
	</form>
</body>
</html>