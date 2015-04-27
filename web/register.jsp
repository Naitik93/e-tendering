<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
	<title></title>
	
	<link rel="stylesheet" type="text/css" href="css/style.css" media="all" />
	
<!--    <script type="text/javascript" src="js/jquery_ex.js"></script>
    <script type="text/javascript" src="js/jquery_ex1.js"></script>-->
    <script type="text/javascript" src="js/jquery.inputfocus-0.9.min.js"></script>
    <script type="text/javascript" src="js/jquery.main.js"></script>    
</head>
<body>
	
	<div id="container">
	<h1>SIGN UP FOR <span> TENDERING </span> ACCOUNT</h1><br/><br/><br/><br/><br/><br/>
		
        <form action="check" method="post">
	
            <!-- #first_step -->
            <div>
			
                <fieldset>
		<legend align="center">PERSONAL DETAILS</legend>
				
                <div class="form">
				
				<label for="cpassword">FIRST NAME</label>
                    <input type="text" name="fname" id="fname" placeholder="Enter FirstName" required="required"/>
					
					<label for="cpassword">LAST NAME</label>
                    <input type="text" name="lname" id="lname" placeholder="Enter LastName" required="required"/>
					
					<label for="email">EMAIL</label>
                    <input type="email" name="email" id="email" placeholder="Enter email id" required="required"/>
				
					 <label for="username">USERNAME</label>
                    <input type="text" name="username" id="username" placeholder="Enter username" required />
                    
                              
                    <label for="password">PASSWORD</label>
                    <button onclick="myFunction()">??</button><script>function myFunction() {alert("Password must contain: \nUpperCase,LowerCase,\nNumber or SpecialChar and min 8 Chars");}</script>
                    <input type="password" name="password" id="password" placeholder=" password" required pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$"/></br>
        
                    
                
                    <label for="cpassword">CONFIRM PASSWORD</label>
                    <input type="password" name="cpassword" id="cpassword" placeholder=" password" required="required"/>
					
					<label for="phone">PHONE</label>
                                        <input type="number" name="phone" id="phone" placeholder="Contact no" required="required"  />
					
					<label>ADDRESS Line-1</label>
					<input type="text" name="add1" placeholder="Address line 1" required="required"/>
					
					<label>ADDRESS Line-2</label>
					<input type="text"name="add2" placeholder="Address line 2" required="required"/>
					
					<label>ADDRESS Line-3</label>
					<input type="text" name="add3" placeholder="Address line 3" required="required"/>
					
					<label for="city">CITY</label>
                    <input type="text" name="city" id="city" placeholder="Enter City" required="required"/>
					
					<label for="state">STATE</label>
                    <input type="text" name="state" id="state" placeholder="Enter State" required="required"/>
					
					<label for="state">USER-TYPE</label>
                                        <select name="utype">
					<option value="bidder">BIDDER</option>
					<option value="seller">SELLER</option>
					</select>
					
                    
                  
                                        <input class="submit" type="submit" value=""/>
                  </div> 
				</fieldset>
            </div>
        </form>
	</div>
</body>
</html>