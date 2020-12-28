package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            html {\n");
      out.write("                overflow-y: scroll;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                font-family: \"Poppins\", sans-serif;\n");
      out.write("                overflow: hidden;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: flex-end;\n");
      out.write("                min-height: 100vh;\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4\" style=\"background-color:lavender;\">\n");
      out.write("                        <h2>About Us</h2>\n");
      out.write("                        <p>\n");
      out.write("                            This is a website for students finding house to rent. It has a lot of houses\n");
      out.write("                            in many different place for students choose based on their favorite.\n");
      out.write("                        </p>\n");
      out.write("                        <ul class=\"sci\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fab fa-instagram\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fab fa-youtube\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-4\" style=\"background-color:lavenderblush;\">\n");
      out.write("                        <h2>Quick Links</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">About Us</a></li>\n");
      out.write("                            <li><a href=\"#\">FAQ</a></li>\n");
      out.write("                            <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                            <li><a href=\"#\">Help</a></li>\n");
      out.write("                            <li><a href=\"#\">Terms & Consitions</a></li>\n");
      out.write("                            <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-4\" style=\"background-color:lavender;\">\n");
      out.write("                        <h2>Contact Info</h2>\n");
      out.write("                        <ul class=\"info\">\n");
      out.write("                            <li>\n");
      out.write("                                <span><i class=\"fas fa-map-marker-alt\"></i></span>\n");
      out.write("                                <span>\n");
      out.write("                                    123 Phan Xich Long Street<br>\n");
      out.write("                                    01 Ward, Binh Thanh District,<br>\n");
      out.write("                                    Ho Chi Minh City\n");
      out.write("                                </span>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <span><i class=\"fas fa-phone-alt\"></i></span>\n");
      out.write("                                <p>\n");
      out.write("                                    <a href=\"tel:1234567890\">+1 234 567 890</a><br>\n");
      out.write("                                    <a href=\"tel:1234567890\">+1 234 567 890</a>\n");
      out.write("                                </p>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <span><i class=\"far fa-envelope\"></i></span>\n");
      out.write("                                <p>\n");
      out.write("                                    <a href=\"mailto:abc@gmail.com\">abc@gmail.com</a><br>\n");
      out.write("                                    <a href=\"mailto:abc@gmail.com\">abc@gmail.com</a>\n");
      out.write("                                </p>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <div class=\"copyrightText\">\n");
      out.write("            <p>Copyright © 2020 Online Renting House. All Rights Reversed.</p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
