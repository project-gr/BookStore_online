package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bookstore.dao.UserDAO;
import com.bookstore.bean.BookBean;
import com.bookstore.bean.UserBean;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Book Store</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"newcss1.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write(" \n");
      out.write("        <style>\n");
      out.write("            .navbar-inner {\n");
      out.write("                min-height: 0px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-brand,\n");
      out.write("            .navbar-nav li a {\n");
      out.write("                line-height: 70px;\n");
      out.write("                height: 70px;\n");
      out.write("                padding-top: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                            <span class=\"sr-only\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"Home.jsp\"><img src=\"logo3.png\" alt=\"\" class=\"logo\" style=\"width: 70px; height: 70px;\"></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <form class=\"navbar-form navbar-left\" method=\"post\" action=\"SearchControl\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input name=\"search\" id=\"search\" type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("\n");
      out.write("                                <select class=\"form-control\" name=\"type\">\n");
      out.write("                                    <option value=\"Book\"> Book </option>\n");
      out.write("                                    <option value=\"Author\"> Author </option>\n");
      out.write("                                    <option value=\"Category\"> Category </option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Account<span class=\"caret\"></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("\n");
      out.write("                                    <li><a href=\"Login.jsp\">Sign In</a></li>\n");
      out.write("                                    <li><a href=\"CustomerAccount.jsp\">Information</a></li>\n");
      out.write("                                    <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"Logout.jsp\">Sign Out</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">Abut us</a></li>\n");
      out.write("                            <li><a href=\"Check.jsp\">Cart</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div>\n");
      out.write("            <div class=\"btn-menu\">\n");
      out.write("                <span class=\"fas fa-bars\"></span>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"sidebar\">\n");
      out.write("                <div class=\"text\">\n");
      out.write("                    Side Menu</div>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"#\">Dashboard</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\" class=\"feat-btn\">Features\n");
      out.write("                            <span class=\"fas fa-caret-down first\"></span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"feat-show\">\n");
      out.write("                            <li><a href=\"#\">Pages</a></li>\n");
      out.write("                            <li><a href=\"#\">Elements</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\" class=\"serv-btn\">Services\n");
      out.write("                            <span class=\"fas fa-caret-down second\"></span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"serv-show\">\n");
      out.write("                            <li><a href=\"#\">App Design</a></li>\n");
      out.write("                            <li><a href=\"#\">Web Design</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Portfolio</a></li>\n");
      out.write("                    <li><a href=\"#\">Overview</a></li>\n");
      out.write("                    <li><a href=\"#\">Shortcuts</a></li>\n");
      out.write("                    <li><a href=\"#\">Feedback</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <script>\n");
      out.write("                $('.btn').click(function () {\n");
      out.write("                    $(this).toggleClass(\"click\");\n");
      out.write("                    $('.sidebar').toggleClass(\"show\");\n");
      out.write("                });\n");
      out.write("                $('.feat-btn').click(function () {\n");
      out.write("                    $('nav ul .feat-show').toggleClass(\"show\");\n");
      out.write("                    $('nav ul .first').toggleClass(\"rotate\");\n");
      out.write("                });\n");
      out.write("                $('.serv-btn').click(function () {\n");
      out.write("                    $('nav ul .serv-show').toggleClass(\"show1\");\n");
      out.write("                    $('nav ul .second').toggleClass(\"rotate\");\n");
      out.write("                });\n");
      out.write("                $('nav ul li').click(function () {\n");
      out.write("                    $(this).addClass(\"active\").siblings().removeClass(\"active\");\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <form action=\"AddBookServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <center>\n");
      out.write("                <h1>Add Book</h1>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class =\"color_text\">ISBN:</td>\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"isbn\" id=\"isbn\" placeholder=\"ISBN\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class =\"color_text\">Title:</td>\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"title\" id=\"title\" placeholder=\"Title\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class =\"color_text\">Price:</td>\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"price\" id=\"price\" placeholder=\"Price\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td class =\"color_text\">Publisher:</td>\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"publisher\" id=\"publisher\" placeholder=\"Publisher\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class =\"color_text\">Category ID:</td>\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"categoryid\" id=\"categoryid\" placeholder=\"Category ID\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td class =\"color_text\">Category: </td>\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"category\" id=\"genre\" placeholder=\"Category\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td class =\"color_text\">Author ID:</td>\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"authorid\" id=\"authorid\" placeholder=\"Author ID\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td class =\"color_text\">Author:</td>\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"author\" id=\"author\" placeholder=\"Author\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class =\"color_text\">Inventory:</td>\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"inventory\" id=\"inventory\" placeholder=\"Inventory\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class =\"color_text\">Book Description:</td>\n");
      out.write("                        <td><input class=\"form-control\" type=\"text\" name=\"description\" id=\"description\" placeholder=\"Book Description\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class = \"color_text\">Submit a Cover Image</td>\n");
      out.write("                        <td><input class=\"form-control\" type=\"file\" placeholder=\"Cover Image\" name=\"coverImage\" id=\"coverImage\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <button class=\"button\" type=\"submit\">Add Book</button> &nbsp;&nbsp;&nbsp;\n");
      out.write("                <button class=\"button\" type=\"reset\">Cancel</button>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
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
