<%@include file="header_bidder.jsp" %>

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