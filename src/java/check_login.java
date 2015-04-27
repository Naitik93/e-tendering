/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Naitik
 */
@WebServlet(urlPatterns = {"/check_login"})
public class check_login extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            String u=null,p=null,t=null;
            String un=request.getParameter("username");
            String pwd=request.getParameter("password");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root", "root");
            Statement st=con.createStatement();
            ResultSet rs;
            rs=st.executeQuery("select id,password,type from register where username='"+un+"';");
            while(rs.next())
            {
                u=rs.getString(1);
                p=rs.getString(2);
                t=rs.getString(3);
            }            
            String fname = null,lname = null,desg=null;
            int id = 0;
                ResultSet rst=st.executeQuery("select first_name,last_name,designation,id from register where username='"+un+"'");
                while(rst.next())
                {
                    fname=rst.getString(1);
                    lname=rst.getString(2);
                    desg=rst.getString(3);
                    id=rst.getInt(4);
                }
            if(un.equals(un)&& pwd.equals(p))
            {
                
                if(t.equals("bidder"))
                {
                    HttpSession session=request.getSession();
                    session.setAttribute("fn", fname);
                    session.setAttribute("ln", lname);
                    session.setAttribute("uname", un);
                    session.setAttribute("uno", id);
                    session.setMaxInactiveInterval(20000);
                    response.sendRedirect("welcome_bidder.jsp");
                }
                
                HttpSession session=request.getSession();
                session.setAttribute("fn", fname);
                session.setAttribute("ln", lname);
                session.setAttribute("uname", un);
                session.setAttribute("desg", desg);
                session.setAttribute("uno", id);
                session.setMaxInactiveInterval(20000);
                response.sendRedirect("welcome_user.jsp");
            }
            
        }
        catch(Exception ex) 
        {
            out.println(ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(check_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(check_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
