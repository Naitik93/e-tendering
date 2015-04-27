package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\" lang=\"en\">\n");
      out.write("<!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\"/>\n");
      out.write("<!-- Set the viewport width to device width for mobile -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\"/>\n");
      out.write("<title>E-Tendering</title>\n");
      out.write("<!-- CSS Files-->\n");
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
      out.write("\t\t\t\t\t<font face=\"Century gothic\" size=\"+1\">We gain strength,and courage,and confidence by each experience in which we really stop to look fear in the face, we must do that which we think we cannot.</font>\n");
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
      out.write("\t\t<div class=\"eight columns noleftmarg\">\t\t\n");
      out.write("\t\t\t<nav id=\"nav-wrap\">\n");
      out.write("\t\t\t\t<ul class=\"nav-bar sf-menu\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"current\">\n");
      out.write("\t\t\t\t\t<a href=\"index.html\">Home</a>\n");
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
      out.write("\n");
      out.write("                                        <ul>\n");
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
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"contact.html\">Contact</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t</div>\t\n");
      out.write("</div>\n");
      out.write("<div class=\"clear\">\n");
      out.write("</div>\n");
      out.write("<!-- SLIDER \n");
      out.write("================================================== -->\n");
      out.write("<div id=\"ei-slider\" class=\"ei-slider\">\n");
      out.write("\t<ul class=\"ei-slider-large\">\n");
      out.write("\t\t<li>\n");
      out.write("\t\t<img src=\"images\\slider\\image01.jpg\" alt=\"image01\" class=\"responsiveslide\">\n");
      out.write("\t\t<div class=\"ei-title\">\n");
      out.write("\t\t\t<h2><a href=\"login.jsp\">Login</a></h2>\n");
      out.write("                        <h3><a href=\"register.jsp\">Sign Up</a></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t<img src=\"images\\slider\\image02.jpg\" alt=\"image02\" class=\"responsiveslide\">\n");
      out.write("\t\t<div class=\"ei-title\">\n");
      out.write("\t\t\t<h2><a href=\"login.jsp\">Login</a></h2>\n");
      out.write("                        <h3><a href=\"register.jsp\">Sign Up</a></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t<img src=\"images\\slider\\image03.jpg\" alt=\"image03\" class=\"responsiveslide\">\n");
      out.write("\t\t<div class=\"ei-title\">\n");
      out.write("\t\t\t<h2><a href=\"login.jsp\">Login</a></h2>\n");
      out.write("                        <h3><a href=\"register.jsp\">Sign Up</a></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t<img src=\"images/slider/image04.jpg\" alt=\"image04\" class=\"responsiveslide\">\n");
      out.write("\t\t<div class=\"ei-title\">\n");
      out.write("\t\t\t<h2><a href=\"login.jsp\">Login</a></h2>\n");
      out.write("                        <h3><a href=\"register.jsp\">Sign Up</a></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t<img src=\"images/slider/image05.jpg\" alt=\"image05\" class=\"responsiveslide\">\n");
      out.write("\t\t<div class=\"ei-title\">\n");
      out.write("\t\t\t<h2><a href=\"login.jsp\">Login</a></h2>\n");
      out.write("                        <h3><a href=\"register.jsp\">Sign Up</a></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t<img src=\"images/slider/image06.jpg\" alt=\"image06\" class=\"responsiveslide\">\n");
      out.write("\t\t<div class=\"ei-title\">\n");
      out.write("\t\t\t<h2><a href=\"login.jsp\">Login</a></h2>\n");
      out.write("                        <h3><a href=\"register.jsp\">Sign Up</a></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t<img src=\"images/slider/image07.jpg\" alt=\"image07\" class=\"responsiveslide\">\n");
      out.write("\t\t<div class=\"ei-title\">\n");
      out.write("\t\t\t<h2><a href=\"login.jsp\">Login</a></h2>\n");
      out.write("                        <h3><a href=\"register.jsp\">Sign Up</a></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t<img src=\"images/slider/image08.jpg\" alt=\"image08\" class=\"responsiveslide\">\n");
      out.write("\t\t<div class=\"ei-title\">\n");
      out.write("\t\t\t<h2><a href=\"login.jsp\">Login</a></h2>\n");
      out.write("                        <h3><a href=\"register.jsp\">Sign Up</a></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t<img src=\"images/slider/image09.jpg\" alt=\"image09\" class=\"responsiveslide\">\n");
      out.write("\t\t<div class=\"ei-title\">\n");
      out.write("\t\t\t<h2><a href=\"login.jsp\">Login</a></h2>\n");
      out.write("                        <h3><a href=\"register.jsp\">Sign Up</a></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t<img src=\"images/slider/image10.jpg\" alt=\"image10\" class=\"responsiveslide\">\n");
      out.write("\t\t<div class=\"ei-title\">\n");
      out.write("\t\t\t<h2><a href=\"login.jsp\">Login</a></h2>\n");
      out.write("                        <h3><a href=\"register.jsp\">Sign Up</a></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("\t<!-- slider-thumbs -->\n");
      out.write("\t<ul class=\"ei-slider-thumbs\">\n");
      out.write("\t\t<li class=\"ei-slider-element\">Current</li>\n");
      out.write("\t\t<li><a href=\"#\">Slide 1</a><img src=\"images/thumbs/thumb1.jpg\" class=\"slideshowthumb\" alt=\"thumb01\"/></li>\n");
      out.write("\t\t<li><a href=\"#\">Slide 2</a><img src=\"images/thumbs/thumb2.jpg\" class=\"slideshowthumb\" alt=\"thumb02\"/></li>\n");
      out.write("\t\t<li><a href=\"#\">Slide 3</a><img src=\"images/thumbs/thumb3.jpg\" class=\"slideshowthumb\" alt=\"thumb03\"/></li>\n");
      out.write("\t\t<li><a href=\"#\">Slide 4</a><img src=\"images/thumbs/thumb4.jpg\" class=\"slideshowthumb\" alt=\"thumb04\"/></li>\n");
      out.write("\t\t<li><a href=\"#\">Slide 5</a><img src=\"images/thumbs/thumb5.jpg\" class=\"slideshowthumb\" alt=\"thumb05\"/></li>\n");
      out.write("\t\t<li><a href=\"#\">Slide 6</a><img src=\"images/thumbs/thumb6.jpg\" class=\"slideshowthumb\" alt=\"thumb06\"/></li>\n");
      out.write("\t\t<li><a href=\"#\">Slide 7</a><img src=\"images/thumbs/thumb7.jpg\" class=\"slideshowthumb\" alt=\"thumb07\"/></li>\n");
      out.write("\t\t<li><a href=\"#\">Slide 8</a><img src=\"images/thumbs/thumb8.jpg\" class=\"slideshowthumb\" alt=\"thumb08\"/></li>\t\t\n");
      out.write("\t\t<li><a href=\"#\">Slide 9</a><img src=\"images/thumbs/thumb9.jpg\" class=\"slideshowthumb\" alt=\"thumb09\"/></li>\n");
      out.write("\t\t<li><a href=\"#\">Slide 10</a><img src=\"images/thumbs/thumb10.jpg\" class=\"slideshowthumb\" alt=\"thumb10\"/></li>\n");
      out.write("\t</ul>\t\n");
      out.write("</div>\n");
      out.write("<div class=\"minipause\">\n");
      out.write("</div>\n");
      out.write("<!-- SUBHEADER\n");
      out.write("================================================== -->\n");
      out.write("<div id=\"subheader\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"twelve columns\">\n");
      out.write("\t\t\t<p class=\"text-center\">\n");
      out.write("\t\t\t\t \"Vision is the art of seeing what is invisible to others\" - Jonathan Swift\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div class=\"twelve columns\">\n");
      out.write("\t\t<ul class=\"ca-menu\">\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t<span class=\"ca-icon\">F</span>\n");
      out.write("\t\t\t<div class=\"ca-content\">\n");
      out.write("\t\t\t\t<h2 class=\"ca-main\">Responsive<br/> Design</h2>\n");
      out.write("\t\t\t\t<h3 class=\"ca-sub\">Across all major devices</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t<span class=\"ca-icon\">H</span>\n");
      out.write("\t\t\t<div class=\"ca-content\">\n");
      out.write("\t\t\t\t<h2 class=\"ca-main\">Friendly<br/> Documentation</h2>\n");
      out.write("\t\t\t\t<h3 class=\"ca-sub\">Straight to the point</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t<span class=\"ca-icon\">N</span>\n");
      out.write("\t\t\t<div class=\"ca-content\">\n");
      out.write("\t\t\t\t<h2 class=\"ca-main\">Alternate<br/> Home Pages</h2>\n");
      out.write("\t\t\t\t<h3 class=\"ca-sub\">Full slider, boxed or none</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t<span class=\"ca-icon\">K</span>\n");
      out.write("\t\t\t<div class=\"ca-content\">\n");
      out.write("\t\t\t\t<h2 class=\"ca-main\">Filterable<br/> Portofolio</h2>\n");
      out.write("\t\t\t\t<h3 class=\"ca-sub\">Isotop & PrettyPhoto</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- CONTENT \n");
      out.write("================================================== -->\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div class=\"twelve columns\">\n");
      out.write("\t\t<div class=\"centersectiontitle\">\n");
      out.write("\t\t\t<h4>What we do</h4>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"four columns\">\n");
      out.write("\t\t<h5>Photography</h5>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t Swine short ribs meatball irure bacon nulla pork belly cupidatat meatloaf cow. Nulla corned beef sunt ball tip, qui bresaola enim jowl. Capicola short ribs minim salami nulla nostrud pastrami.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t<a href=\"#\" class=\"readmore\">Learn more</a>\n");
      out.write("\t\t</p>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"four columns\">\n");
      out.write("\t\t<h5>Artwork</h5>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t Swine short ribs meatball irure bacon nulla pork belly cupidatat meatloaf cow. Nulla corned beef sunt ball tip, qui bresaola enim jowl. Capicola short ribs minim salami nulla nostrud pastrami.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t<a href=\"#\" class=\"readmore\">Learn more</a>\n");
      out.write("\t\t</p>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"four columns\">\n");
      out.write("\t\t<h5>Logos</h5>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t Swine short ribs meatball irure bacon nulla pork belly cupidatat meatloaf cow. Nulla corned beef sunt ball tip, qui bresaola enim jowl. Capicola short ribs minim salami nulla nostrud pastrami.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t<a href=\"#\" class=\"readmore\">Learn more</a>\n");
      out.write("\t\t</p>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"hr\">\n");
      out.write("</div>\n");
      out.write("<!-- TESTIMONIALS \n");
      out.write("================================================== -->\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div class=\"twelve columns\">\n");
      out.write("\t\t<div id=\"testimonials\">\n");
      out.write("\t\t\t<blockquote>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t \"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis.\" <cite>Martin - NY</cite>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</blockquote>\n");
      out.write("\t\t\t<blockquote>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.\" <cite>Sandra - LA</cite>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</blockquote>\n");
      out.write("\t\t\t<blockquote>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.\" <cite>Jason - MA</cite>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</blockquote>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--end testimonials-->\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- TWITTER\n");
      out.write("================================================== -->\n");
      out.write("<div class=\"tweetarea\">\n");
      out.write("\t<div class=\"tweettext\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"twelve columns\">\n");
      out.write("\t\t\t\t<div class=\"tweet\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
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
      out.write("\t\t<h1 class=\"newsmargin\">FEEDBACK</h1>\n");
      out.write("\t\t<div class=\"row collapse newsletter floatright\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"two mobile-one columns\">\n");
      out.write("\t\t\t\t<a href=\"#\">Click here to give Feedback.</a>\n");
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
      out.write("<script src=\"javascripts/foundation.min.js\"></script>   \n");
      out.write("<script src=\"javascripts/jquery.easing.1.3.js\"></script>\n");
      out.write("<script src=\"javascripts/elasticslideshow.js\"></script>\n");
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
      out.write("</html>\n");
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
