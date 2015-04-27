<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
	<title></title>
	
	<link rel="stylesheet" type="text/css" href="css/style1.css" media="all" />
	
<!--    <script type="text/javascript" src="js/jquery_ex.js"></script>
    <script type="text/javascript" src="js/jquery_ex1.js"></script>-->
    <script type="text/javascript" src="js/jquery.inputfocus-0.9.min.js"></script>
    <script type="text/javascript" src="js/jquery.main.js"></script>
</head>
<body>
	
	<div id="container">
	<h1>SIGN UP FOR <span> TENDERING </span> ACCOUNT</h1><br><br><br><br><br><br>
		
        <form action="check_reg_seller" method="post">
			
			<div class="second_step">
                <fieldset>
				<legend align="center">QUALIFICATION DETAILS</legend>
                <div class="form">
				    <label for="firstname">COMPANY NAME</label>
                    <input type="text" name="coname" id="coname" placeholder="Enter Company Name" required="required"  />
                    
					<label for="lastname">DESIGNATION</label>
                    <input type="text" name="des" id="designation" placeholder="Enter Designation" required="required" />
                    
					<label for="lastname">Department</label>
					<select name="dept">
						<option>Road and Building</option>
						<option>Narmada(NWRWS)</option>
						<option>Industries and Mines</option>
						<option>Education</option>
						<option>Urban Development</option>
						<option>Tribal Development</option>
						<option>Woman and Child Department</option>
					</select>										           
                    
                </div>      <!-- clearfix --><div class="clear"></div><!-- /clearfix -->
                <input class="submit" type="submit" name="submit_second" id="submit_second" value="" />
				</fieldset>
            </div>     
		</form>
	</div>

</body>
</html>