import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.FileItem;


@WebServlet(urlPatterns = {"/multiple_file"})
public class multiple_file extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","root");
            Statement st=con.createStatement();
            
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);//retrive req.. data & extract below
            //out.println(isMultipart);
            if (isMultipart)
            {
                String fileName[]=new String[5];
		FileItemFactory factory = new DiskFileItemFactory();
	 	ServletFileUpload upload = new ServletFileUpload(factory);
                List  items = upload.parseRequest(request);
                String paraname[]=new String[20];
		int i=0,k=0;
		Iterator iterator = items.iterator();

                while (iterator.hasNext())
                {
                    org.apache.commons.fileupload.FileItem item = (org.apache.commons.fileupload.FileItem) iterator.next();
                    paraname[i]  =item.getString();// one by one tag's values to arrat
                    
	            //out.println(i+"----"+paraname[i]);
	            //out.println("<br>");
                    i++;
                    if (!item.isFormField())// if type=file
                    {
                             
			     fileName[k] = item.getName();// uploadiing file
//                             out.println(fileName[k]);                             
			     String root = "D:\\rushiraj\\Main Project\\web";//currnet path
                             File path = new File(root + "/tender file");// path plus testimage directory
                             if (!path.exists())
			     {
			        boolean status = path.mkdirs();    //if dir! not exists than createe once
                             }
                             File uploadedFile = new File(path + "/" + fileName[k]); /// upload file/image  at path
                             k++;
                             item.write(uploadedFile);//phiscaly write-
                             
//                            
		 }
            }
                String q1 = null;
                
                    q1="insert into tender_bid (tender_name,department,contractor_name,work_name,starting_date,completion_date,net_amount,fee_type,dd_date,bank_details,tfee_paid,solvency,emd_tender,filled_details,vat_certi) values('"+paraname[0]+"','"+paraname[1]+"','"+paraname[2]+"','"+paraname[3]+"','"+paraname[4]+"','"+paraname[5]+"','"+paraname[6]+"','"+paraname[7]+"','"+paraname[8]+"','"+paraname[9]+"','"+fileName[0]+"','"+fileName[1]+"','"+fileName[2]+"','"+fileName[3]+"','"+fileName[4]+"')";
//                    out.println(q1);
                    int r=st.executeUpdate(q1);//insert remaing data into table.....
                            if(r>0)
                            {
                                response.sendRedirect("welcome_bidder.jsp");
			}
	}
        }
        catch(Exception ex) {
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
