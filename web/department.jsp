<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@include file="admin_header.jsp" %>

<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","root");
    Statement st=con.createStatement();
    String query="select *from department;";
    ResultSet rs=st.executeQuery(query);
%>


<div id="page-wrapper">
    <font>
<table border="1">
    <tr>
        <th> Id </th>
        <th> Department Name</th> 
        
        
    </tr>
    <% while(rs.next()){ %>
    <tr>
        <td> <%= rs.getString(1) %> </td>
        <td> <%= rs.getString(2) %> </td>
    </tr>
    <% } %>
</table>
</font>
</div>
<%@include file="admin_footer.jsp" %>