package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->\n");
      out.write("<!--[if lt IE 7]> <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>    <html class=\"no-js lt-ie9 lt-ie8\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>    <html class=\"no-js lt-ie9\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!-->\n");
      out.write("<html class=\"no-js\" lang=\"en\">\n");
      out.write("<!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\"/>\n");
      out.write("<!-- Set the viewport width to device width for mobile -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\"/>\n");
      out.write("<title>E-Tendering</title>\n");
      out.write("<!-- Included CSS Files-->\n");
      out.write("<link rel=\"stylesheet\" href=\"stylesheets/style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"stylesheets/homepage.css\"><!-- homepage stylesheet -->\n");
      out.write("<link rel=\"stylesheet\" href=\"stylesheets/skins/teal.css\"><!-- skin color -->\n");
      out.write("<link rel=\"stylesheet\" href=\"stylesheets/responsive.css\">\n");
      out.write("<!-- IE Fix for HTML5 Tags -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("    <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("  <![endif]-->    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- HIDDEN PANEL \n");
      out.write("================================================== -->\n");
      out.write("<div id=\"panel\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"twelve columns\">\n");
      out.write("\t\t\t<img src=\"images/info.png\" class=\"pics\" alt=\"info\">\n");
      out.write("\t\t\t<div class=\"infotext\">\n");
      out.write("\t\t\t\t<font face=\"Century gothic\" size=\"+1\">We gain strength,and courage,and confidence by each experience in which we really stop to look fear in the face, we must do that which we think we cannot.</font>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<p class=\"slide\">\n");
      out.write("\t<a href=\"#\" class=\"btn-slide\"></a>\n");
      out.write("</p>\n");
      out.write("<!-- HEADER\n");
      out.write("================================================== -->\n");
      out.write("<div class=\"row\">\t\n");
      out.write("\t\t<div class=\"four columns\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<a href=\"index.html\"><h4>e-Tendering</h4></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"eight  columns noleftmarg\">\t\t\n");
      out.write("\t\t\t<nav id=\"nav-wrap\">\n");
      out.write("\t\t\t\t<ul class=\"nav-bar sf-menu\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"current\">\n");
      out.write("\t\t\t\t\t<a href=\"index2.html\">Home</a>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">Tenders</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"portofolio2.html\">Road and Building</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"portofolio3.html\">Narmada(NWRWS)</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"portofolio4.html\">Industries and Mines</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"portofoliodetail.html\">Education</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Urban Development</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Tribal Development</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Woman and Child Development</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">Blog</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"blogpage1.html\">Blog page style 1</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"blogpage2.html\">Blog page style 2</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"blogpage3.html\">Blog page style 3</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"blogsinglepost.html\">Single post</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">About Us</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about.html\">Activities and Vision</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"services.html\">Team</a></li>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"contact.html\">Contact</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">Mr. ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ln}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("                                                    <li><a href=\"edit_profile.jsp\">Profile</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"logout.jsp\">Logout</a></li>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t</div>\t\n");
      out.write("</div>\n");
      out.write("<div class=\"clear\">\n");
      out.write("</div>\n");
      out.write("<!-- SUBHEADER\n");
      out.write("================================================== -->\n");
      out.write("<div id=\"subheader\" class=\"subheadertext\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"twelve columns\">\n");
      out.write("\t\t\t<div class=\"noslide\">\n");
      out.write("\t\t\t\t <h1>WELCOME</h1>\n");
      out.write("\t\t\t\t<h3>NAME</h3>\n");
      out.write("\t\t\t\t<h3>DESIGNATION</h3>\n");
      out.write("\t\t\t<div class=\"minipause\"></div><br/>\n");
      out.write("\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- ANIMATED COLUMNS \n");
      out.write("================================================== -->\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div class=\"twelve columns\">\n");
      out.write("\t\t<ul class=\"ca-menu\">\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <a href=\"upload_tender.jsp\">\n");
      out.write("\t\t\t<span class=\"ca-icon\">F</span>\n");
      out.write("\t\t\t<div class=\"ca-content\">\n");
      out.write("\t\t\t\t<h2 class=\"ca-main\">Upload<br/> Tender</h2>\n");
      out.write("\t\t\t\t<h3 class=\"ca-sub\">Upload new Tender</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t<span class=\"ca-icon\">H</span>\n");
      out.write("\t\t\t<div class=\"ca-content\">\n");
      out.write("\t\t\t\t<h2 class=\"ca-main\">Update<br/> Tender</h2>\n");
      out.write("\t\t\t\t<h3 class=\"ca-sub\">Update exsisting Tender</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t<span class=\"ca-icon\">F</span>\n");
      out.write("\t\t\t<div class=\"ca-content\">\n");
      out.write("\t\t\t\t<h2 class=\"ca-main\">View <br/> Tenders</h2>\n");
      out.write("\t\t\t\t<h3 class=\"ca-sub\">View the full Tenders</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t<span class=\"ca-icon\">K</span>\n");
      out.write("\t\t\t<div class=\"ca-content\">\n");
      out.write("\t\t\t\t<h2 class=\"ca-main\">Check<br/> Tenders</h2>\n");
      out.write("\t\t\t\t<h3 class=\"ca-sub\">Check the bided Tenders</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- FOOOTER \n");
      out.write("================================================== -->\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t<footer class=\"row\">\n");
      out.write("\t<p class=\"back-top floatright\">\n");
      out.write("\t\t<a href=\"#top\"><span></span></a>\n");
      out.write("\t</p>\n");
      out.write("\t<div class=\"four columns\">\n");
      out.write("\t\t<h1>ABOUT US</h1>\n");
      out.write("\t\t Our goal is to keep clients satisfied!\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"four columns\">\n");
      out.write("\t\t<h1>GET SOCIAL</h1>\n");
      out.write("\t\t<div class=\"social facebook\">\n");
      out.write("\t\t\t<a href=\"#\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"social twitter\">\n");
      out.write("\t\t\t<a href=\"#\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"social deviantart\">\n");
      out.write("\t\t\t<a href=\"#\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"social flickr\">\n");
      out.write("\t\t\t<a href=\"#\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"social dribbble\">\n");
      out.write("\t\t\t<a href=\"#\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"four columns\">\n");
      out.write("\t\t<h1 class=\"newsmargin\">NEWSLETTER</h1>\n");
      out.write("\t\t<div class=\"row collapse newsletter floatright\">\n");
      out.write("\t\t\t<div class=\"ten mobile-three columns\">\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"nomargin\" placeholder=\"Enter your e-mail address...\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"two mobile-one columns\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"postfix button expand\">GO</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</footer>\n");
      out.write("</div>\n");
      out.write("<div class=\"copyright\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"six columns\">\n");
      out.write("\t\t\t &copy;<span class=\"small\"> Copyright 2013 Your Agency Name</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"six columns\">\n");
      out.write("\t\t\t<span class=\"small floatright\"> Purchase \"Studio Francesca\" - WowThemes.net</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- JAVASCRIPTS \n");
      out.write("================================================== -->\n");
      out.write("<!-- Javascript files placed here for faster loading -->\n");
      out.write("<script src=\"javascripts/foundation.min.js\"></script> \n");
      out.write("<script src=\"javascripts/jquery.carouFredSel-6.0.5-packed.js\"></script>\n");
      out.write("<script src=\"javascripts/jquery.cycle.js\"></script>\n");
      out.write("<script src=\"javascripts/app.js\"></script>\n");
      out.write("<script src=\"javascripts/modernizr.foundation.js\"></script>\n");
      out.write("<script src=\"javascripts/slidepanel.js\"></script>\n");
      out.write("<script src=\"javascripts/scrolltotop.js\"></script>\n");
      out.write("<script src=\"javascripts/hoverIntent.js\"></script>\n");
      out.write("<script src=\"javascripts/superfish.js\"></script>\n");
      out.write("<script src=\"javascripts/responsivemenu.js\"></script>\n");
      out.write("<script src=\"javascripts/jquery.tweet.js\"></script>\n");
      out.write("<script src=\"javascripts/twitterusername.js\"></script>\n");
      out.write("</body>\n");
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
