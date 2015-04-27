/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author trainee
 */
@WebServlet(urlPatterns = {"/check_reg_bidder"})
public class check_reg_bidder extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            
            
            
            HttpSession sess=request.getSession(true);
            String f=(String)sess.getAttribute("fn");
            String l=(String)sess.getAttribute("ln");
            String mail=(String)sess.getAttribute("em");
            String un=(String)sess.getAttribute("usr");
            String pwd=(String)sess.getAttribute("pass");
            String phn=(String)sess.getAttribute("no");          
            String cit=(String)sess.getAttribute("city");            
            String ut=(String)sess.getAttribute("type");               
            String des=(String) sess.getAttribute("des");
            String dept=(String) sess.getAttribute("depa");           
            
//            out.println(dept);
                     
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","root");
            Statement st=con.createStatement();
            
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);//retrive req.. data & extract below
            //out.println(isMultipart);
            if (isMultipart)
            {
                
		FileItemFactory factory = new DiskFileItemFactory();
	 	ServletFileUpload upload = new ServletFileUpload(factory);
                List  items = upload.parseRequest(request);
                String paraname[]=new String[10];
		int i=0;
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
			     String fileName = item.getName();// uploadiing file
			     String root = "C:\\Users\\Naitik\\Documents\\NetBeansProjects\\Main Project\\web";//currnet path
                             File path = new File(root + "/cmpfile");// path plus testimage directory
                             if (!path.exists())
			     {
			        boolean status = path.mkdirs();    //if dir! not exists than createe once
                             }
                             File uploadedFile = new File(path + "/" + fileName); /// upload file/image  at path
                            
                             item.write(uploadedFile);//phiscaly write-
                             String q1="insert into company_details (name,pan_no,it_cer,est_date,lic_val,reg_no,address,class) values('"+paraname[0]+"','"+paraname[1]+"','"+fileName+"','"+paraname[2]+"','"+paraname[3]+"','"+paraname[4]+"','"+paraname[5]+"','"+paraname[6]+"')";
                             String query="insert into register (first_name,last_name,mail,username,password,phone,city,type,designation,department) values('"+f+"','"+l+"','"+mail+"','"+un+"','"+pwd+"','"+phn+"','"+cit+"','"+ut+"','"+des+"','"+dept+"');";
                            // out.println(q1);
                            int r=st.executeUpdate(q1);//insert remaing data into table.....
                            int p=st.executeUpdate(query);
                      
                            if(r>0)
                            {
                                response.sendRedirect("login.jsp");
                            }
		 }
            }
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
            Logger.getLogger(check_reg_bidder.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(check_reg_bidder.class.getName()).log(Level.SEVERE, null, ex);
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
