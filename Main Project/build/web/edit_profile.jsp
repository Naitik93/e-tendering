<%-- 
    Document   : edit_profile
    Created on : Mar 25, 2015, 2:42:52 PM
    Author     : trainee
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="header_logged.jsp" %>%>

<%
            HttpSession sess=request.getSession();
            String un=(String)sess.getAttribute("uname");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root", "root");
            Statement st=con.createStatement();
            ResultSet rs;
            String query="select *from register where username='"+un+"'";
            rs=st.executeQuery(query);
            while(rs.next())
            {
%>

<div id="container">
<form method="post" action="update">
    <div>
    <fieldset>
		<legend align="center">PERSONAL DETAILS</legend>
				
                <div class="form">
				
                    <label for="cpassword">FIRST NAME</label>
                    <input type="text" name="fname" id="fname" value=<%= rs.getString(2)%>/>
					
                    <label for="cpassword">LAST NAME</label>
                    <input type="text" name="lname" id="lname" value=<%= rs.getString(3)%> />
					
					<label for="email">EMAIL</label>
                    <input type="email" name="email" id="email" value=<%= rs.getString(4)%>/>
				
					 <label for="username">USERNAME</label>
                    <input type="text" name="username" id="username" value=<%= rs.getString(5)%> />
                    
                              
<!--                    <label for="password">PASSWORD</label>
                    <button onclick="myFunction()">Pattern</button><script>function myFunction() {alert("Password must contain: \nUpperCase,LowerCase,\nNumber or SpecialChar and min 8 Chars");}</script>
                    <input type="password" name="password" id="password" value= required pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$"/> -->
                                
                    <label for="phone">PHONE</label>
                    <input type="number" name="phone" id="phone" value=<%= rs.getString(7)%>  />
					
		
					
                    <label for="city">CITY</label>
                    <input type="text" name="city" id="city" value=<%= rs.getString(8)%>/>
					
                    <label for="state">USER-TYPE</label>
                    <input type="text" name="type" id="city" value=<%= rs.getString(9)%>/>
                  
                    <label>DESIGNATION</label>
                    <input type="text" name="designation" id="city" value=<%= rs.getString(10)%>/>
                    
                    <label>DEPARTMENT</label>
                    <input type="text" name="department" value=<%= rs.getString(11)%>/> <%}%>
                                        
                                        <input class="submit" type="submit" value=""/>
                  </div> 
				</fieldset>
    </div>
    
</form>
</div>

                    
<%@include file="footer.jsp" %>