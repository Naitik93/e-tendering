<%-- 
    Document   : update_details
    Created on : 5 Apr, 2015, 9:54:21 AM
    Author     : Naitik
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@include file="header_logged.jsp" %>

<%
            String un=request.getParameter("param");
            HttpSession sess=request.getSession();
            sess.setAttribute("id", un);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root", "root");
            Statement st=con.createStatement();
            ResultSet rs;
            String query="select *from tender where id='"+un+"'";
            rs=st.executeQuery(query);
            while(rs.next())
            {
%>
 
<div id="container">
    <form method="post" action="FileUpdateServlet" enctype="multipart/form-data">
    <div>
    <fieldset>
		<legend align="center">UPDATE TENDER DETAILS</legend>
				
                <div class="form">
	
                                        <label>NAME</label>
                                        <input type="text" name="name"  value="<%= rs.getString(2) %>" /> 
							
					<label>DEPARTMENT</label>
                                        <input type="text" name="dept" id="panno" value="<%= rs.getString(3) %>" /> 
							
					<label>START DATE</label>
                                        <input type="date" name="stdate" value="<%= rs.getString(4) %>" />
                                        <% } %>
                                        <label>TENDER</label>
					<input type="file" name="file" id="itfile" required="required"/> 
                                        
                                        <input class="submit" type="submit" name="submit_third" id="submit_third" value="Update" />
                                        
                                            </div>

	</fieldset>
	</div>
    </form>
        </div>


<%@include file="footer.jsp" %>