

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/check"})
public class check extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            String f=request.getParameter("fname");
            String l=request.getParameter("lname");
            String mail=request.getParameter("email");
            String un=request.getParameter("username");
            String pwd=request.getParameter("password");
            String phn=request.getParameter("phone");            
            String cit=request.getParameter("city");
            String st=request.getParameter("state");
            String ut=request.getParameter("utype");
            String add1=request.getParameter("add1");
            String add2=request.getParameter("add2");
            String add3=request.getParameter("add3");
            String addr=add1+" "+add2+" "+add3;
        try{    
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","root");
            Statement sta=con.createStatement();
            String query="select username from register where username='"+un+"';";
            ResultSet rs=sta.executeQuery(query);
            while(rs.next())
            {
                if(un.equals(rs.getString(1)))
                {
                    out.println("<html><script type='text/javascript'> alert('Username not available');</script></html>");
                    response.sendRedirect("register.jsp");
                }
            }
        }
        catch(ClassNotFoundException cc){}
        catch(SQLException ss){}
            
            HttpSession ses=request.getSession();
            ses.setAttribute("fn",f);
            ses.setAttribute("ln", l);
            ses.setAttribute("em", mail);
            ses.setAttribute("usr", un);
            ses.setAttribute("pass", pwd);
            ses.setAttribute("no", phn);
            ses.setAttribute("city", cit);
            ses.setAttribute("type", ut);
            ses.setAttribute("add", addr);
            
            if(ut.equals("seller"))
            {
                response.sendRedirect("reg_seller.jsp");
            return;
            }
            
                RequestDispatcher rd=request.getRequestDispatcher("reg_bidder.jsp");
                rd.forward(request, response);
                //response.sendRedirect("reg_bidder.jsp");
            
        
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
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
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
