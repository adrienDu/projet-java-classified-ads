<%@ page language="java" contentType="text/html;  charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Admin | Classifieds</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/admin.signin.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<div class="container">
		<div class="row">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h2 class="form-signin-heading">Page de connexion admin</h2>
				</div>
				<div class="panel-body">
					<form class="form-signin" method="post" action="adminDoLogin">
						<label for="inputEmail" class="sr-only">Email address</label> <input
							type="email" id="inputEmail" name="inputEmail"
							class="form-control" placeholder="Email address" required
							autofocus> <br /> <label for="inputPassword"
							class="sr-only">Password</label> <input type="password"
							id="inputPassword" name="inputPassword" class="form-control"
							placeholder="Password" required>

						<%
							if ((request.getAttribute("errorString")) != null) {
						%>
						<div class="alert alert-danger">
							<\br><strong>Erreur!</strong>${errorString}
						</div>
						<%
							}
						%>

						<div class="checkbox">
							<label> <input type="checkbox" value="remember-me">
								Remember me
							</label>
						</div>
						<button class="btn inverse btn-lg btn-primary btn-block"
							type="submit">Sign in</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
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
