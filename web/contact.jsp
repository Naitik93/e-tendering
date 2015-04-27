<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8"/>
<!-- Set the viewport width to device width for mobile -->
<meta name="viewport" content="width=device-width"/>
<title>E-Tendering</title>
<!-- CSS Files-->
<link rel="stylesheet" href="stylesheets/style.css">
<link rel="stylesheet" href="stylesheets/homepage.css"><!-- homepage stylesheet -->
<link rel="stylesheet" href="stylesheets/skins/teal.css"><!-- skin color -->
<link rel="stylesheet" href="stylesheets/responsive.css">
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
				<a href="index.jsp"><h4>e-Tendering</h4></a>
			</div>
		</div>
		<div class="eight columns noleftmarg">		
			<nav id="nav-wrap">
				<ul class="nav-bar sf-menu">
				
					<li class="current">
					<a href="index.jsp">Home</a>
						
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
					
				</ul>
				</nav>
		</div>	
</div>

<!-- CONTENT 
================================================== -->
<div class="row">
    <!-- GOOGLE MAP IFRAME -->
	<div class="twelve columns">
		<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d6377.3557125920615!2d72.51407116679195!3d23.04134854954464!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x395e9b520826d289%3A0x981943f7469d92cc!2sCMC+Limited!5e1!3m2!1sen!2sin!4v1430119172324" width="1000" height="450" frameborder="0" style="border:0"></iframe>
		</iframe>
	</div>
</div>
<div class="row">
	<!-- CONTACT FORM -->
	<div class="twelve columns">
		<div class="wrapcontact">
			<h5>SEND US A MESSAGE</h5>
			<div class="done">
				<div class="alert-box success">
				 Message has been sent! <a href="" class="close">x</a>
				</div>
			</div>			
				<form method="post" action="contact.php" id="contactform">
				<div class="form">
				    <div class="six columns noleftmargin">
					<label>Name</label>
					<input type="text" name="name" class="smoothborder" placeholder="Your name *"/>
					</div>
					<div class="six columns">
					<label>E-mail address</label>
					<input type="text" name="email" class="smoothborder" placeholder="Your e-mail address *"/>
					</div>
					<label>Message</label>
					<textarea name="comment" class="smoothborder ctextarea" rows="14" placeholder="Message, feedback, comments *"></textarea>
					<input type="submit" id="submit" class="readmore" value="Submit">
				</div>
				</form>			
		</div>
	</div>
												
</div>
<div class="hr">
</div>
<!-- TWITTER + js calls 
================================================== -->
<div class="tweetarea">
	<div class="tweettext">
		<div class="row">
			<div class="twelve columns">
				<div class="tweet">
				</div>
			</div>
		</div>
	</div>
</div>

<%@include file="footer.jsp" %>