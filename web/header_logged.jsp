<%-- 
    Document   : header_logged
    Created on : Mar 30, 2015, 12:53:43 PM
    Author     : trainee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8"/>
<!-- Set the viewport width to device width for mobile -->
<meta name="viewport" content="width=device-width"/>
<title>E-Tendering</title>
<!-- Included CSS Files-->
<link rel="stylesheet" href="stylesheets/style.css">
<link rel="stylesheet" href="stylesheets/homepage.css"><!-- homepage stylesheet -->
<link rel="stylesheet" href="stylesheets/skins/teal.css"><!-- skin color -->
<link rel="stylesheet" href="stylesheets/responsive.css">
<link rel="stylesheet" type="text/css" href="css/style.css"/>


	
<!--    <script type="text/javascript" src="js/jquery_ex.js"></script>
    <script type="text/javascript" src="js/jquery_ex1.js"></script>-->
    <script type="text/javascript" src="js/jquery.inputfocus-0.9.min.js"></script>
    <script type="text/javascript" src="js/jquery.main.js"></script>    
<!-- IE Fix for HTML5 Tags -->
<!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->    
</head>
<body>
<!-- HIDDEN PANEL 
================================================== -->
<div id="panel">
	<div class="row">
		<div class="twelve columns">
			<img src="images/info.png" class="pics" alt="info">
			<div class="infotext">
				<font face="Century gothic" size="+1">We gain strength,and courage,and confidence by each experience in which we really stop to look fear in the face, we must do that which we think we cannot.</font>
			</div>
		</div>
	</div>
</div>
<p class="slide">
	<a href="#" class="btn-slide"></a>
</p>
<!-- HEADER
================================================== -->
<div class="row">	
		<div class="four columns">
			<div class="logo">
                            <a href="welcome_user.jsp"><h4>e-Tendering</h4></a>
			</div>
		</div>
		<div class="eight  columns noleftmarg">		
			<nav id="nav-wrap">
				<ul class="nav-bar sf-menu">
				
					<li class="current">
                                            <a href="welcome_user.jsp">Home</a>
						
					</li>
					
					<li>
					<a href="#">Tenders</a>
						<ul>
						<li><a href="portofolio2.html">Road and Building</a></li>
						<li><a href="portofolio3.html">Narmada(NWRWS)</a></li>
						<li><a href="portofolio4.html">Industries and Mines</a></li>
						<li><a href="portofoliodetail.html">Education</a></li>
						<li><a href="#">Urban Development</a></li>
						<li><a href="#">Tribal Development</a></li>
						<li><a href="#">Woman and Child Development</a></li>
						</ul>
					</li>
					
					
					
					<li>
					<a href="#">About Us</a>
						<ul>
                                                    <li><a href="about_us.jsp">Activities and Vision</a></li>
                                                    <li><a href="team.jsp">Team</a></li>						
						</ul>
					</li>
					
					
					<li>
					<a href="contact.jsp">Contact</a>
					</li>
					
					<li>
                                            <a href="#">Mr.<font style="text-transform: uppercase ; font-family: Century Gothic, Verdana,sans-serif  "> ${fn} ${ln}</font></a>
						<ul>
                                                    <li><a href="edit_profile.jsp">Profile</a></li>
						<li><a href="logout.jsp">Logout</a></li>						
						</ul>
					</li>
					
					
				</ul>
				</nav>
		</div>	
</div>
<div class="clear">
</div>
<!-- SUBHEADER
================================================== -->
<div id="subheader" class="subheadertext">
	<div class="row">
		<div class="twelve columns">
			<div class="noslide">
				 <h1>
                                     WELCOME
                                 </h1>
                                 <h3>
                                     Mr.<font style="text-transform: uppercase ; font-family: Century Gothic, Verdana,sans-serif  "> ${fn} ${ln} </font></h3>
                                 
                                 <h3>
                                     <font style="text-transform: uppercase ; font-family: Century Gothic, Verdana,sans-serif  ">${desg}</font>
                                 </h3>
			<div class="minipause"></div><br/>
		
			</div>
		</div>
	</div>
</div>