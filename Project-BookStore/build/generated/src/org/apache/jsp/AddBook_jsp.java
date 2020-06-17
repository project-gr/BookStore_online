package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public final class AddBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Book Store</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\"></button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"Home.jsp\">Hehe Book Store</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <form class=\"navbar-form navbar-left\" method=\"post\" action=\"SearchControl\">\r\n");
      out.write("\r\n");
      out.write("                        <ol type=\"circle\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"searchBox\">\r\n");
      out.write("                                <input class=\"form-control\" name=\"search\" id=\"search\" size=\"40\" type=\"text\" placeholder=\"Search\">\r\n");
      out.write("\r\n");
      out.write("                                <select class=\"form-control\" name=\"type\">\r\n");
      out.write("                                    <option value=\"Book\"> Book </option>\r\n");
      out.write("                                    <option value=\"Author\"> Author </option>\r\n");
      out.write("                                    <option value=\"Category\"> Category </option>\r\n");
      out.write("                                </select> \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"./Login.jsp\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"> <span class=\"caret\"></span>Sign in</a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                                <li><a href=\"./CustomerAccount.jsp\">Account</a></li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"./logout.jsp\">Logout</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Admin<span class=\"caret\"></span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                                <li><a href=\"./generateReports\">View Reports</a></li>\r\n");
      out.write("                                <li><a href=\"./AddBook.jsp\">Add Book</a></li>\r\n");
      out.write("                                <li><a href=\"./UserLookup\">View Users</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"./Check.jsp\">Cart</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div style=\"padding: 70px 15px; text-align: center;\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"AddBookServlet\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <center>\r\n");
      out.write("                <h1>Add Book</h1>\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class =\"color_text\">ISBN:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"isbn\" id=\"isbn\" placeholder=\"ISBN\" required></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class =\"color_text\">Title:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"title\" id=\"title\" placeholder=\"Title\" required></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class =\"color_text\">Price:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"price\" id=\"price\" placeholder=\"Price\" required></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class =\"color_text\">Publisher:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"publisher\" id=\"publisher\" placeholder=\"Publisher\" required></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class =\"color_text\">Category ID:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"categoryid\" id=\"categoryid\" placeholder=\"Category ID\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class =\"color_text\">Category: </td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"category\" id=\"genre\" placeholder=\"Category\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class =\"color_text\">Author ID:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"authorid\" id=\"authorid\" placeholder=\"Author ID\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class =\"color_text\">Author:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"author\" id=\"author\" placeholder=\"Author\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class =\"color_text\">Inventory:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"inventory\" id=\"inventory\" placeholder=\"Inventory\" required></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class =\"color_text\">Book Description:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"description\" id=\"description\" placeholder=\"Book Description\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class = \"color_text\">Submit a Cover Image</td>\r\n");
      out.write("                        <td><input type=\"file\" placeholder=\"Cover Image\" name=\"coverImage\" id=\"coverImage\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                <button class=\"button\" type=\"submit\">Add Book</button> &nbsp;&nbsp;&nbsp;\r\n");
      out.write("                <button class=\"button\" type=\"reset\">Cancel</button>\r\n");
      out.write("            </center>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
