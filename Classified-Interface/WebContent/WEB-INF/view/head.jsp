<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"
	import="java.time.format.DateTimeFormatter" import="java.util.Locale"%>
	<%@page import="com.ecetech.bti4.itproject.classified.beans.User"%>
	
<%@ page language="java" contentType="text/html;  charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import="java.util.Date"%>
<meta http-equiv="Content-Type" content="text/html;  charset=UTF-8">
<!-- CSS -->
<link rel="stylesheet" type="text/css" href="css/style.css">

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
<link href="https://fonts.googleapis.com/css?family=Slab|Open+Sans"
	rel="stylesheet">
<!-- Frontawesome -->
<script src="https://use.fontawesome.com/dffe9d8685.js"></script>

<%
User user = new User();
if (session.getAttribute("sessionUtilisateur") != null) {
	user = (User) session.getAttribute("sessionUtilisateur");
}
	//time 
	DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.FRENCH);
	DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm");
	LocalDate ldate = LocalDate.now();
	LocalTime tdate = LocalTime.now();
	String date = dateformatter.format(ldate);
	String time = timeformatter.format(tdate);
%>
<title>Classifieds</title>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<h1 class="title"><a href="">Classifieds</a></h1>
				<div>
					<p class=date id="date"><%=date%></p>
				</div>
				<div class="row">
					<div class="col-md-12">
						<ul class="nav nav-pills navigation">
							<li role="presentation" class="pull-left"><p class=time><%=time%></p></li>
							<% if(user.getIdUser().isEmpty()){ %>
							<li role="presentation" class="pull-right"><a href="signin">Sign In / Sign Up</a></li><%} 
							else {
							%><li role="presentation" class="pull-right"><span><%out.println(user.getMailUser().toString()); %></span><a href="http://localhost:8080/Classified-Interface/logout.jsp">Logout</a></li><%} %>
						</ul>
					</div>
				</div>
			</div>
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
	crossorigin="anonymous">
	
</script>
</html>