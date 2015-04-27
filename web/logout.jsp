<%-- 
    Document   : logout
    Created on : Mar 25, 2015, 2:39:21 PM
    Author     : trainee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    HttpSession sess=request.getSession();
    sess.invalidate();
    response.sendRedirect("index.jsp");
%>