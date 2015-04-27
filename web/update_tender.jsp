<%-- 
    Document   : update_tender
    Created on : Apr 1, 2015, 2:42:44 PM
    Author     : trainee
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="header_logged.jsp" %>

<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","root");
    Statement st=con.createStatement();
    
    String query="select id,name,department from tender;";
    ResultSet rs=st.executeQuery(query);
        
%>


    <div id="container">
    <form method="post" action="FileUpdateServlet" enctype="multipart/form-data">
    <div>
    <fieldset>
		<legend align="center">UPDATE TENDER</legend>
				
                <div class="form">	
                    
                    <table border="1" align="center" cellspacing="5" cellpadding="5">
                        <tbody>
                            <tr>
                                <th>ID</th>
                                <th>&nbsp;&nbsp;TENDER NAME &nbsp;&nbsp;</th>
                                <th>DEPARTMENT</th>
                            </tr>
                            
                            <% while(rs.next()){%>
                            
                            <tr>
                                <td><%= rs.getString(1)%></td>
                                <td><a href="update_details.jsp?&param=<%= rs.getString(1)%>"><%= rs.getString(2)%></a></td>
                                <td><%= rs.getString(3)%></td>
                                <% } %>
                            </tr>
                        </tbody>
                    </table>
		
                    					
                    
                    
                </div>
	</fieldset>
	</div>
    </form>
        </div>

<%@include file="footer.jsp" %>