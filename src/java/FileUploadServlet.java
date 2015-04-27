import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


@WebServlet("/FileUploadServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
                 maxFileSize=1024*1024*30,      // 10MB
                 maxRequestSize=1024*1024*50)

public class FileUploadServlet extends HttpServlet {
    private static final String SAVE_DIR="rushiraj\\Main Project\\web\\file\\";
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String savePath = "D:" + File.separator + SAVE_DIR;
                File fileSaveDir=new File(savePath);
                if(!fileSaveDir.exists()){
                    fileSaveDir.mkdir();
                }
            String Name=request.getParameter("name");
            String dept=request.getParameter("dept");
            String date=request.getParameter("stdate");
            Part part=request.getPart("file");
           String fileName=extractFileName(part);
          //  String fileName= fileSaveDir.getName();
           File fnm=new File(fileName);
          // System.out.println(fnm.getName()+"---------------------");
           // System.out.println(fileSaveDir + fileName);
            File sf=new File(fileSaveDir, fnm.getName());
            System.out.println(sf.getName() + sf.getAbsolutePath());
            part.write(savePath + File.separator + sf.getName());
           /* 
            //You need this loop if you submitted more than one file
            for (Part part : request.getParts()) {
            String fileName = extractFileName(part);
            part.write(savePath + File.separator + fileName);
        }*/
            try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","root");
	            String query="INSERT INTO tender (name, department,date, tender_file) values (?,?, ?, ?)";
	           
	                PreparedStatement pst;
	                pst=con.prepareStatement(query);
	                pst.setString(1, Name);
	                pst.setString(2,dept);
                        pst.setString(3, date);
	                String filePath=sf.getAbsolutePath() ;
	                pst.setString(4,filePath);
	                pst.executeUpdate();
                        response.sendRedirect("welcome_user.jsp");
			} catch (Exception e) {
				// TODO Auto-generated catch block
                                out.println(e);
			}
            
    }
    // file name of the upload file is included in content-disposition header like this:
    //form-data; name="dataFile"; filename="PHOTO.JPG"
    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        System.out.println(contentDisp);
        String[] items = contentDisp.split(";");
        for (String s : items) {
        	System.out.println(s);
            if (s.trim().startsWith("filename")) {
            	String str=s.substring(s.indexOf("=") + 2, s.length()-1);
            	System.out.println(str);
                return str;
            }
        }
        return "";
    }
}