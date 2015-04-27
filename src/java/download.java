
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/download"})
public class download extends HttpServlet {
    private DataInputStream fileStream;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            String id=request.getParameter("param");
            String filename = "data" + id + ".pdf";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","root");
            Statement st=con.createStatement();
            String query="select tender_file from tender where id='"+id+"' ;";
            ResultSet rs=st.executeQuery(query);
            
            String content = null;
            
            while(rs.next())
            {
                content=rs.getString(1);
            }
            byte requestBytes[] = content.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(requestBytes);
            response.reset();
            response.setContentType("application/pdf");
            response.setHeader("cache-control", "no-cache");
            response.setHeader("Content-disposition", "attachment; filename=" + filename);

        byte[] buf = new byte[1024];
        int len;
        while ((len = bis.read(buf)) > 0)
        {
            response.getOutputStream().write(buf, 0, len);
        }
        bis.close();
        response.getOutputStream().flush();
          
//            while(rs.next())
//            {
//                File file = new File(rs.getString(1));
//                response.setHeader("Content-Type", getServletContext().getMimeType(file.getName()));
//                response.setHeader("Content-Length", String.valueOf(file.length()));                
//                response.setHeader("Content-Disposition", "inline; filename=\"5_full.pdf\"");
//                Files.copy(file.toPath(), response.getOutputStream());
//            }
//            out.println("<html> <body>");
//            out.println("<object data=\'${pageContext.request.contextPath}\' type=\'application/pdf\'");            
//            out.println("<a href='${pageContext.request.contextPath}\5_full.pdf'> Download file.pdf </a>");
//            out.println("</object>");
//            out.println("</body> </html>");
        } 
        finally 
        {
            out.close();
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
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
