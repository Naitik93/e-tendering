/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author trainee
 */
@WebServlet(urlPatterns = {"/check_reg1"})
public class check_reg1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
            String des=request.getParameter("desig");
            String dept=request.getParameter("dep");
           
            HttpSession sess=request.getSession(true);
            String f=(String)sess.getAttribute("fn");
            String l=(String)sess.getAttribute("ln");
            String mail=(String)sess.getAttribute("em");
            String un=(String)sess.getAttribute("usr");
            String address=(String)sess.getAttribute("add");
            String pwd=(String)sess.getAttribute("pass");
            String phn=(String)sess.getAttribute("no");          
            String cit=(String)sess.getAttribute("city");            
            String ut=(String)sess.getAttribute("type");               
            
            
            try
            {
                    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                Statement st=con.createStatement();
            
            String query="insert into register (first_name,last_name,mail,username,password,phone,address,city,type,designation,department) values('"+f+"','"+l+"','"+mail+"','"+un+"','"+pwd+"','"+phn+"','"+address+"','"+cit+"','"+ut+"','"+des+"','"+dept+"');";
              
            st.executeUpdate(query);
            RequestDispatcher rd=request.getRequestDispatcher("reg_bidder1.jsp");
            rd.forward(request, response);
            }
            catch(Exception ex)
            {
                out.println(ex);
            }
//            response.sendRedirect("reg_bidder1.jsp");
            
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
        processRequest(request, response);
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
        processRequest(request, response);
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
