<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
<meta charset="utf-8" />
<title>Admin Panel classified</title>

<link rel="stylesheet" href="css/admin.layout.css" type="text/css"
	media="screen" />
<!--[if lt IE 9]>
	<link rel="stylesheet" href="css/admin.ie.css" type="text/css" media="screen" />
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
<script src="js/admin.jquery-1.5.2.min.js" type="text/javascript"></script>
<script src="js/admin.hideshow.js" type="text/javascript"></script>
<script src="js/admin.jquery.tablesorter.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/admin.jquery.equalHeight.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".tablesorter").tablesorter();
	});
	$(document).ready(function() {

		//When page loads...
		$(".tab_content").hide(); //Hide all content
		$("ul.tabs li:first").addClass("active").show(); //Activate first tab
		$(".tab_content:first").show(); //Show first tab content

		//On Click Event
		$("ul.tabs li").click(function() {

			$("ul.tabs li").removeClass("active"); //Remove any "active" class
			$(this).addClass("active"); //Add "active" class to selected tab
			$(".tab_content").hide(); //Hide all tab content

			var activeTab = $(this).find("a").attr("href"); //Find the href attribute value to identify the active tab + content
			$(activeTab).fadeIn(); //Fade in the active ID content
			return false;
		});

	});
</script>
<script type="text/javascript">
	$(function() {
		$('.column').equalHeight();
	});
</script>

</head>


<body>

	<header id="header">
		<hgroup>
			<h1 class="site_title">
				<a href="index.html">Classifieds Admin</a>
			</h1>
			<h2 class="section_title">Dashboard</h2>
			<div class="btn_view_site">
				<a href="http://localhost:8080/Classified-Interface/ServletIndex">Voir
					site</a>
			</div>
		</hgroup>
	</header>
	<!-- end of header bar -->

	<section id="secondary_bar">
		<div class="user">
			<p>
				Admin(<a href="#">3 Messages</a>)
			</p>
			<!-- <a class="logout_user" href="#" title="Logout">Logout</a> -->
		</div>
		<div class="breadcrumbs_container">
			<article class="breadcrumbs">
				<a href="index.html">Website Admin</a>
				<div class="breadcrumb_divider"></div>
				<a class="current">Dashboard</a>
			</article>
		</div>
	</section>
	<!-- end of secondary bar -->

	<aside id="sidebar" class="column">
		<form class="quick_search">
			<input type="text" value="Quick Search"
				onfocus="if(!this._haschanged){this.value=''};this._haschanged=true;">
		</form>
		<hr />
		<h3>Content</h3>
		<ul class="toggle">
			<li class="icn_new_article"><a href="#">New Article</a></li>
			<li class="icn_edit_article"><a href="#">Edit Articles</a></li>
			<li class="icn_categories"><a href="#">Categories</a></li>
			<li class="icn_tags"><a href="#">Tags</a></li>
		</ul>
		<h3>Users</h3>
		<ul class="toggle">
			<li class="icn_add_user"><a href="#">Add New User</a></li>
			<li class="icn_view_users"><a href="#">View Users</a></li>
			<li class="icn_profile"><a href="#">Your Profile</a></li>
		</ul>
		<h3>Admin</h3>
		<ul class="toggle">
			<li class="icn_settings"><a href="#">Options</a></li>
			<li class="icn_security"><a href="#">Security</a></li>
			<li class="icn_jump_back"><a href="logoutAdmin.jsp">Logout</a></li>
		</ul>

	</aside>
	<!-- end of sidebar -->

	<section id="main" class="column">

		<h4 class="alert_info">Welcome to the free MediaLoot admin panel
			template, this could be an informative message.</h4>

		<article class="module width_3_quarter">
			<header>
				<h3 class="tabs_involved">Content Manager</h3>
				<ul class="tabs">
					<li><a href="#tab1">Posts</a></li>
					<li><a href="#tab2">Comments</a></li>
				</ul>
			</header>

			<div class="tab_container">
				<div id="tab1" class="tab_content">
					<table class="tablesorter" cellspacing="0">
						<thead>
							<tr>
								<th></th>
								<th>Entry Name</th>
								<th>Category</th>
								<th>Created On</th>
								<th>Actions</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><input type="checkbox"></td>
								<td>Lorem Ipsum Dolor Sit Amet</td>
								<td>Articles</td>
								<td>5th April 2011</td>
								<td><input type="image" src="images/icn_edit.png"
									title="Edit"><input type="image"
									src="images/icn_trash.png" title="Trash"></td>
							</tr>
							<tr>
								<td><input type="checkbox"></td>
								<td>Ipsum Lorem Dolor Sit Amet</td>
								<td>Freebies</td>
								<td>6th April 2011</td>
								<td><input type="image" src="images/icn_edit.png"
									title="Edit"><input type="image"
									src="images/icn_trash.png" title="Trash"></td>
							</tr>
							<tr>
								<td><input type="checkbox"></td>
								<td>Sit Amet Dolor Ipsum</td>
								<td>Tutorials</td>
								<td>10th April 2011</td>
								<td><input type="image" src="images/icn_edit.png"
									title="Edit"><input type="image"
									src="images/icn_trash.png" title="Trash"></td>
							</tr>
							<tr>
								<td><input type="checkbox"></td>
								<td>Dolor Lorem Amet</td>
								<td>Articles</td>
								<td>16th April 2011</td>
								<td><input type="image" src="images/icn_edit.png"
									title="Edit"><input type="image"
									src="images/icn_trash.png" title="Trash"></td>
							</tr>
							<tr>
								<td><input type="checkbox"></td>
								<td>Dolor Lorem Amet</td>
								<td>Articles</td>
								<td>16th April 2011</td>
								<td><input type="image" src="images/icn_edit.png"
									title="Edit"><input type="image"
									src="images/icn_trash.png" title="Trash"></td>
							</tr>
						</tbody>
					</table>
				</div>
				<!-- end of #tab1 -->

				<div id="tab2" class="tab_content">
					<table class="tablesorter" cellspacing="0">
						<thead>
							<tr>
								<th></th>
								<th>Comment</th>
								<th>Posted by</th>
								<th>Posted On</th>
								<th>Actions</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><input type="checkbox"></td>
								<td>Lorem Ipsum Dolor Sit Amet</td>
								<td>Mark Corrigan</td>
								<td>5th April 2011</td>
								<td><input type="image" src="images/icn_edit.png"
									title="Edit"><input type="image"
									src="images/icn_trash.png" title="Trash"></td>
							</tr>
							<tr>
								<td><input type="checkbox"></td>
								<td>Ipsum Lorem Dolor Sit Amet</td>
								<td>Jeremy Usbourne</td>
								<td>6th April 2011</td>
								<td><input type="image" src="images/icn_edit.png"
									title="Edit"><input type="image"
									src="images/icn_trash.png" title="Trash"></td>
							</tr>
							<tr>
								<td><input type="checkbox"></td>
								<td>Sit Amet Dolor Ipsum</td>
								<td>Super Hans</td>
								<td>10th April 2011</td>
								<td><input type="image" src="images/icn_edit.png"
									title="Edit"><input type="image"
									src="images/icn_trash.png" title="Trash"></td>
							</tr>
							<tr>
								<td><input type="checkbox"></td>
								<td>Dolor Lorem Amet</td>
								<td>Alan Johnson</td>
								<td>16th April 2011</td>
								<td><input type="image" src="images/icn_edit.png"
									title="Edit"><input type="image"
									src="images/icn_trash.png" title="Trash"></td>
							</tr>
							<tr>
								<td><input type="checkbox"></td>
								<td>Dolor Lorem Amet</td>
								<td>Dobby</td>
								<td>16th April 2011</td>
								<td><input type="image" src="images/icn_edit.png"
									title="Edit"><input type="image"
									src="images/icn_trash.png" title="Trash"></td>
							</tr>
						</tbody>
					</table>

				</div>
				<!-- end of #tab2 -->

			</div>
			<!-- end of .tab_container -->

		</article>
		<!-- end of content manager article -->

		<div class="clear"></div>

		<article class="module width_full">
			<header>
				<h3>Post New Article</h3>
			</header>
			<div class="module_content">
				<fieldset>
					<label>Post Title</label> <input type="text">
				</fieldset>
				<fieldset>
					<label>Content</label>
					<textarea rows="12"></textarea>
				</fieldset>
				<fieldset style="width: 48%; float: left; margin-right: 3%;">
					<!-- to make two field float next to one another, adjust values accordingly -->
					<label>Category</label> <select style="width: 92%;">
						<option>Articles</option>
						<option>Tutorials</option>
						<option>Freebies</option>
					</select>
				</fieldset>
				<fieldset style="width: 48%; float: left;">
					<!-- to make two field float next to one another, adjust values accordingly -->
					<label>Tags</label> <input type="text" style="width: 92%;">
				</fieldset>
				<div class="clear"></div>
			</div>
			<footer>
				<div class="submit_link">
					<select>
						<option>Draft</option>
						<option>Published</option>
					</select> <input type="submit" value="Publish" class="alt_btn"> <input
						type="submit" value="Reset">
				</div>
			</footer>
		</article>
		<!-- end of post new article -->

		<div class="spacer"></div>
	</section>


</body>
<%
	if (request.getParameter("logout") != null) {
		session.invalidate();
		response.sendRedirect("http://localhost:8080/Classified-Interface/admin");

	}
%>
<SCRIPT LANGUAGE="JavaScript">
        <!--
        function button1()
        {
            document.form1.buttonName.value = "yes";
            form1.submit();
        } 
        // --> 
    </SCRIPT>
</html>