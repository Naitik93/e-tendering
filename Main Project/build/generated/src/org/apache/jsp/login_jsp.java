package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\" class=\"no-js\"> <!--<![endif]-->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <!-- <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">  -->\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login_style.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate-custom.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\t\t\r\n");
      out.write("                <div id=\"container_demo\" >\r\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"toregister\"></a>\r\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"tologin\"></a>\r\n");
      out.write("                    <div id=\"wrapper\">\r\n");
      out.write("                        <div id=\"login\" class=\"animate form\">\r\n");
      out.write("                            <form  action=\"check_login\" method=\"post\"> \r\n");
      out.write("                                <h1>Log in</h1> \r\n");
      out.write("                                <p> \r\n");
      out.write("                                    <label for=\"username\" class=\"uname\" data-icon=\"u\" > Your Username </label>\r\n");
      out.write("                                    <input id=\"username\" name=\"username\" required=\"required\" type=\"text\" placeholder=\"Enter Username\" required=\"required\"/>\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p> \r\n");
      out.write("                                    <label for=\"password\" class=\"youpasswd\" data-icon=\"p\"> Your password </label>\r\n");
      out.write("                                    <input id=\"password\" name=\"password\" required=\"required\" type=\"password\" placeholder=\"Enter Password\" required=\"required\"/> \r\n");
      out.write("                                </p>                                \r\n");
      out.write("                                <p class=\"login button\"> \r\n");
      out.write("                                    <input type=\"submit\" value=\"Login\" /> \r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                                <p class=\"change_link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tNot  Registered yet ?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"register.jsp\">Register</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</body>\r\n");
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
