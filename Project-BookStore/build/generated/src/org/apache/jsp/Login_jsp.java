package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bookstore.bean.UserBean;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\"></button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"Home.jsp\">Hehe Book Store</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                    <form class=\"navbar-form navbar-left\" method=\"post\" action=\"SearchControl\">\n");
      out.write("\n");
      out.write("                        <ol type=\"circle\">\n");
      out.write("\n");
      out.write("                            <div class=\"searchBox\">\n");
      out.write("                                <input class=\"form-control\" name=\"search\" id=\"search\" size=\"40\" type=\"text\" placeholder=\"Search\">\n");
      out.write("\n");
      out.write("                                <select class=\"form-control\" name=\"type\">\n");
      out.write("                                    <option value=\"Book\"> Book </option>\n");
      out.write("                                    <option value=\"Author\"> Author </option>\n");
      out.write("                                    <option value=\"Category\"> Category </option>\n");
      out.write("                                </select> \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </ol>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("                        ");

                            UserBean ubean = (UserBean) session.getAttribute("userBean");

                            if (ubean == null) {
                                // đã login
                        
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"./Login.jsp\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"> <span class=\"caret\"></span>Sign in</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");

                        } else {
                            // chưa login
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"./Logout.jsp\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"> <span class=\"caret\"></span>Logout</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Admin<span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <li><a href=\"./generateReports\">View Reports</a></li>\n");
      out.write("                                <li><a href=\"./AddBook.jsp\">Add Book</a></li>\n");
      out.write("                                <li><a href=\"./UserLookup\">View Users</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"./Check.jsp\">Cart</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div style=\"padding: 70px 15px; text-align: center;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato&display=swap\">\n");
      out.write("        <script src=\"checkSignUp.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"cont\">\n");
      out.write("                <form action=\"LoginControl\" method=\"post\">\n");
      out.write("                    <div class=\"form sign-in\">\n");
      out.write("                        <h2>Sign In</h2>\n");
      out.write("                        <label>\n");
      out.write("                            <span>Username</span>\n");
      out.write("                            <input type=\"username\" name=\"username\">\n");
      out.write("                        </label>\n");
      out.write("                        <label>\n");
      out.write("                            <span>Password</span>\n");
      out.write("                            <input type=\"password\" name=\"password\">\n");
      out.write("                        </label>\n");
      out.write("                        <button class=\"submit\" type=\"submit\">Sign In</button>\n");
      out.write("                        <p class=\"forgot-pass\">Forgot Password ?</p>\n");
      out.write("\n");
      out.write("                        <div class=\"social-media\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\" class=\"social\"><i class=\"fab fa-facebook-square\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\" class=\"social\"><i class=\"fab fa-twitter-square\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\" class=\"social\"><i class=\"fab fa-youtube-square\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"sub-cont\">\n");
      out.write("                    <div class=\"img\">\n");
      out.write("                        <div class=\"img-text m-up\">\n");
      out.write("                            <h2>New here?</h2>\n");
      out.write("                            <br>\n");
      out.write("                            <p>Sign up and discover great amount of new opportunities!</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"img-text m-in\">\n");
      out.write("                            <h2>One of us?</h2>\n");
      out.write("                            <br>\n");
      out.write("                            <p>If you already has an account, just sign in. We've missed you!</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"img-btn\">\n");
      out.write("                            <span class=\"m-up\">Sign Up</span>\n");
      out.write("                            <span class=\"m-in\">Sign In</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <form action=\"SignUpServlet\" method=\"post\" class=\"form-signup\" enctype=\"multipart/form-data\">\n");
      out.write("                        <div class=\"form sign-up\">\n");
      out.write("                            <h2>Sign Up</h2>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Full Name</span>\n");
      out.write("                                <input type=\"text\" class=\"fullname\" name=\"fName\" id=\"fName\">\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Username</span>\n");
      out.write("                                <input type=\"text\" class=\"username\" name=\"username\" id=\"username\">\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Password</span>\n");
      out.write("                                <input type=\"password\" class=\"password\" name=\"pass\" id=\"pass\">\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Confirm Password</span>\n");
      out.write("                                <input type=\"password\" class=\"confirm_password\" id=\"confirm_password\">\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Address</span>\n");
      out.write("                                <input type=\"text\" class=\"address\" name=\"address\" id=\"address\">\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Phone</span>\n");
      out.write("                                <input type=\"text\" class=\"phone\" name=\"phone\" id=\"phone\">\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Email</span>\n");
      out.write("                                <input type=\"email\" class=\"email\" name=\"email\" id=\"email\">\n");
      out.write("                            </label>\n");
      out.write("                            <button type=\"submit\" class=\"submit\" onclick=\"getCheck()\">Sign Up Now</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"testjs.js\"></script>\n");
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
