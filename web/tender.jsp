<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@include file="admin_header.jsp" %>

<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","root");
    Statement st=con.createStatement();
    String query="select *from tender;";
    ResultSet rs=st.executeQuery(query);
%>


<div id="page-wrapper">
    <font>
<table border="1">
    <tr>
        <th> Name </th>
        <th> Department</th>
        <th> Date </th>
        <th> Tender File </th>
        
    </tr>
    <% while(rs.next()){ %>
    <tr>
        <td> <%= rs.getString(2) %> </td>
        <td> <%= rs.getString(3) %> </td>
        <td> <%= rs.getString(4) %> </td>
        <td> <a href="<%= rs.getString(5) %>"><img src=" <%= rs.getString(5) %> " > File </a></td>
    </tr>
    <% } %>
</table>
</font>
</div>
<%@include file="admin_footer.jsp" %>