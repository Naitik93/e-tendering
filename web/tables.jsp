<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@include file="admin_header.jsp" %>

<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","root");
    Statement st=con.createStatement();
    String query="select *from register;";
    ResultSet rs=st.executeQuery(query);
%>


<div id="page-wrapper">
    <font>
<table border="1">
    <tr>
        <th> Name </th>
        <th> Email address </th>
        <th> Username </th>
        <th> Phone </th>
        <th> Address </th>
        <th> City </th>
        <th> User Type </th>
        <th> Designation </th>
        <th> Department </th>
    </tr>
    <% while(rs.next()){ %>
    <tr>
        <td> <%= rs.getString(2) %> <%= rs.getString(3) %> </td>
        <td> <%= rs.getString(4) %> </td>
        <td> <%= rs.getString(5) %> </td>
        <td> <%= rs.getString(7) %> </td>
        <td> <%= rs.getString(8) %> </td>
        <td> <%= rs.getString(9) %> </td>
        <td> <%= rs.getString(10) %> </td>
        <td> <%= rs.getString(11) %> </td>
        <td> <%= rs.getString(12) %> </td>
    </tr>
    <% } %>
</table>
</font>
</div>
<%@include file="admin_footer.jsp" %>