package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" media=\"all\" />\r\n");
      out.write("\t\r\n");
      out.write("<!--    <script type=\"text/javascript\" src=\"js/jquery_ex.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery_ex1.js\"></script>-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.inputfocus-0.9.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.main.js\"></script>    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t<h1>SIGN UP FOR <span> TENDERING </span> ACCOUNT</h1><br/><br/><br/><br/><br/><br/>\r\n");
      out.write("\t\t\r\n");
      out.write("        <form action=\"check\" method=\"post\">\r\n");
      out.write("\t\r\n");
      out.write("            <!-- #first_step -->\r\n");
      out.write("            <div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("                <fieldset>\r\n");
      out.write("\t\t<legend align=\"center\">PERSONAL DETAILS</legend>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <div class=\"form\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<label for=\"cpassword\">FIRST NAME</label>\r\n");
      out.write("                    <input type=\"text\" name=\"fname\" id=\"fname\" placeholder=\"Enter FirstName\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"cpassword\">LAST NAME</label>\r\n");
      out.write("                    <input type=\"text\" name=\"lname\" id=\"lname\" placeholder=\"Enter LastName\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"email\">EMAIL</label>\r\n");
      out.write("                    <input type=\"email\" name=\"email\" id=\"email\" placeholder=\"Enter email id\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t <label for=\"username\">USERNAME</label>\r\n");
      out.write("                    <input type=\"text\" name=\"username\" id=\"username\" placeholder=\"Enter username\" required />\r\n");
      out.write("                    \r\n");
      out.write("                              \r\n");
      out.write("                    <label for=\"password\">PASSWORD</label>\r\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\" placeholder=\" password\" required pattern=\"(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\"/></br>\r\n");
      out.write("        <h5>UpperCase,LowerCase,Number/SpecialChar and min 8 Chars</h5>\r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("                    <label for=\"cpassword\">CONFIRM PASSWORD</label>\r\n");
      out.write("                    <input type=\"password\" name=\"cpassword\" id=\"cpassword\" placeholder=\" password\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"phone\">PHONE</label>\r\n");
      out.write("                                        <input type=\"number\" name=\"phone\" id=\"phone\" placeholder=\"Contact no\" required=\"required\"  />\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"addr\">ADDRESS</label>\r\n");
      out.write("                    <input type=\"text\" name=\"addr\" id=\"addr\" placeholder=\"Enter Address\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"city\">CITY</label>\r\n");
      out.write("                    <input type=\"text\" name=\"city\" id=\"city\" placeholder=\"Enter City\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"state\">STATE</label>\r\n");
      out.write("                    <input type=\"text\" name=\"state\" id=\"state\" placeholder=\"Enter State\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"state\">USER-TYPE</label>\r\n");
      out.write("                                        <select name=\"utype\">\r\n");
      out.write("\t\t\t\t\t<option value=\"bidder\">BIDDER</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"seller\">SELLER</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    \r\n");
      out.write("                  \r\n");
      out.write("                                        <input class=\"submit\" type=\"submit\" value=\"\"/>\r\n");
      out.write("                  </div> \r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\t</div>\r\n");
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
