package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class reg_005fbidder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\" />\r\n");
      out.write("\t<title></title>\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style2.css\" media=\"all\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/button.css\" media=\"all\" />\r\n");
      out.write("        \r\n");
      out.write("<!--    <script type=\"text/javascript\" src=\"js/jquery_ex.js\"></script>-->\r\n");
      out.write("<!--    <script type=\"text/javascript\" src=\"js/jquery_ex1.js\"></script>-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.inputfocus-0.9.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.main.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t<h1>SIGN UP FOR <span> TENDERING </span> ACCOUNT</h1><br/><br/><br/><br/><br/><br/>\r\n");
      out.write("\t\t\r\n");
      out.write("        <form action=\"check_reg1\" method=\"post\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"second_step\">\r\n");
      out.write("                <fieldset>\r\n");
      out.write("\t\t\t\t<legend align=\"center\">QUALIFICATION DETAILS</legend>\r\n");
      out.write("                <div class=\"form\">\r\n");
      out.write("\t\t\t\t    <label for=\"firstname\">COMPANY NAME</label>\r\n");
      out.write("                    <input type=\"text\" name=\"coname\" id=\"coname\" placeholder=\"Enter Company Name\" required=\"required\"/>\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t<label for=\"lastname\">DESIGNATION</label>\r\n");
      out.write("                    <input type=\"text\" name=\"desig\" id=\"designation\" placeholder=\"Enter Designation\" required=\"required\"/>\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t<label for=\"lastname\">Department</label>\r\n");
      out.write("\t\t\t\t\t<select name=\"dep\">\r\n");
      out.write("\t\t\t\t\t\t");

            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root", "root");
            Statement st=con.createStatement();
            ResultSet rs;
            String query="select name from department";
            rs=st.executeQuery(query);
            while(rs.next())
            {

      out.write("\r\n");
      out.write("<option>");
      out.print( rs.getString(1) );
      out.write("</option>\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\t\t\t\t\t\t\t\t\t\t           \r\n");
      out.write("                    \r\n");
      out.write("                </div>      <!-- clearfix --><div class=\"clear\"></div><!-- /clearfix -->\r\n");
      out.write("                <input class=\"submit\" type=\"submit\" name=\"submit_second\" id=\"submit_second\" value=\"\" />\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("            </div>      \t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
