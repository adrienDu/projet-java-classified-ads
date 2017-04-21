<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import="java.util.Date"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- CSS -->
<link rel="stylesheet" type="text/css" href="style.css">

<!-- Bootstrap viewport -->
<meta name="viewport" content="width=device-width, initial-scale=1">

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

<!--GoggleWebFonts -->
<link href="https://fonts.googleapis.com/css?family=Lusitana|Open+Sans"
	rel="stylesheet">
<!-- Frontawesome -->
<script src="https://use.fontawesome.com/dffe9d8685.js"></script>
<title>Classifieds</title>

</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-12">
				<h1 class="title">Classifieds</h1>
					<p><%=new Date()%></p>
				</div>

				<!-- Navigation -->
				<nav class="navbar navbar-inverse navbar-static-top"
					role="navigation">
				<div class="container">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">Start Bootstrap</a>
					</div>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li><a href="#">About</a></li>
							<li><a href="#">Services</a></li>
							<li><a href="">Sign In/Sign Up</a></li>
						</ul>
					</div>
					<!-- /.navbar-collapse -->
				</div>
				<!-- /.container --> 
				</nav>
			</div>
		</div>
	</div>
</body>

<!-- jQuery -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
</html>