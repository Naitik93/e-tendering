<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@include file="admin_header.jsp" %>

<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","root");
    Statement st=con.createStatement();
    String query="select *from company_details;";
    ResultSet rs=st.executeQuery(query);
%>


<div id="page-wrapper">
    
<table border="1">
    <tr>        
        <th> NAME </th> 
        <th> PAN NUMBER </th> 
        <th> IT CERTIFICATE</th> 
        <th> ESTABLISH DATE</th> 
        <th> LICENSE VALIDITY </th> 
        <th> REGISTRATION NUMBER </th> 
        <th> ADDRESS </th> 
        <th> CITY </th> 
        <th> STATE </th> 
        <th> CLASS </th>         
        
    </tr>
    <% while(rs.next()){ %>
    <tr>       
        <td> <%= rs.getString(2) %> </td>
        <td> <%= rs.getString(3) %> </td>
        <td> <img src="<%= rs.getString(4) %>"> </td>
        <td> <%= rs.getString(5) %> </td>
        <td> <%= rs.getString(6) %> </td>
        <td> <%= rs.getString(7) %> </td>
        <td> <%= rs.getString(8) %> </td>
        <td> <%= rs.getString(9) %> </td>
        <td> <%= rs.getString(10) %> </td>
        <td> <%= rs.getString(11) %> </td>
        
    </tr>
    <% } %>
</table>

</div>


<%@include file="admin_footer.jsp" %>