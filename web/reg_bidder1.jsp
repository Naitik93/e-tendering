<%-- 
    Document   : reg_bidder1
    Created on : Mar 18, 2015, 1:25:21 PM
    Author     : trainee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bidder</title>
        	<link rel="stylesheet" type="text/css" href="css/style2.css" media="all" />
	<link rel="stylesheet" type="text/css" href="css/button.css" media="all" />
        
<!--    <script type="text/javascript" src="js/jquery_ex.js"></script>-->
<!--    <script type="text/javascript" src="js/jquery_ex1.js"></script>-->
    <script type="text/javascript" src="js/jquery.inputfocus-0.9.min.js"></script>
    <script type="text/javascript" src="js/jquery.main.js"></script>
    </head>
    <body>
        
        <div id="container">
	<h1>SIGN UP FOR <span> TENDERING </span> ACCOUNT</h1><br/><br/><br/><br/><br/><br/>
        <form action="check_reg_bidder" method="post" enctype="multipart/form-data">
        <div id="third_step">
                <fieldset>
				<legend ALIGN="CENTER">COMPANY DETAILS</legend>
                
				<div class="form1">
				
                    <label>NAME</label>
					<input type="text" name="coname1"  placeholder="Enter Company Name" required="required"/> 
							
					<label>PAN No.</label>
					<input type="text" name="panno" id="panno" placeholder="Enter PAN No." required="required"/> 
															
					<label>EST DATE</label>
					<input type="date" name="estdate" id="estdate"required="required"/> 
					
					<label>LICENCE VALIDITY</label>
					<input type="date" name="lvdate" id="lvdate"required="required"/> 					
										
					<label>REG No.</label>
					<input type="text" name="regno" id="coname1" placeholder="Enter Registration No." required="required"/> 
					
					<label>ADDRESS Line-1</label>
					<input type="text" name="add1" placeholder="Address line 1" required="required"/>
					
					<label>ADDRESS Line-2</label>
					<input type="text"name="add2" placeholder="Address line 2" required="required"/>
					
					<label>ADDRESS Line-3</label>
					<input type="text" name="add3" placeholder="Address line 3" required="required"/>
                                        
                                        <label>CITY</label>
					<input type="text" name="add3" placeholder="Enter City" required="required"/>
					
                                        <label>STATE</label>
					<input type="text" name="add3" placeholder="Enter State" required="required"/>
                                        
					<label>CLASS</label>
					<select name="class">
						<option>AA</option>
						<option>A</option>
						<option>B</option>
						<option>C</option>
						<option>D</option>
						<option>E-1</option>
						<option>E-2</option>
					</select> 
					
                                        <label>I.T.CLEARENCE CERTI</label>
					<input type="file" name="file" id="itfile" required="required"/> 
                    
                </div>      <!-- clearfix --><div class="clear"></div><!-- /clearfix -->
                <input class="submit" type="submit" name="submit_third" id="submit_third" value="" />
                </fieldset>
            </div>      <!-- clearfix --><div class="clear"></div><!-- /clearfix -->
        </form></div>
    </body>
</html>
