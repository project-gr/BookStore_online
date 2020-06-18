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
import com.bookstore.dao.BookDAO;
import com.bookstore.bean.BookBean;
import java.util.*;
import java.text.NumberFormat;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
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
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"Home.jsp\"><img src=\"logo3.png\" alt=\"\" class=\"logo\" style=\"width: 70px; height: 70px;\"></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <form class=\"navbar-form navbar-left\" role=\"search\"  method=\"post\" action=\"SearchControl\">\n");
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
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Account<span class=\"caret\"></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"Login.jsp\">Sign In</a></li>\n");
      out.write("                                    <li><a href=\"CustomerAccount.jsp\">Information</a></li>\n");
      out.write("                                    <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"Logout.jsp\">Sign Out</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">About us</a></li>\n");
      out.write("                            <li><a href=\"Check.jsp\">Cart</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
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
      out.write("                $('.btn-menu').click(function () {\n");
      out.write("                    $(this).toggleClass(\"click\");\n");
      out.write("                    $('.sidebar').toggleClass(\"show\");\n");
      out.write("                });\n");
      out.write("                $('.feat-btn').click(function () {\n");
      out.write("                    $('.sidebar ul .feat-show').toggleClass(\"show\");\n");
      out.write("                    $('.sidebar ul .first').toggleClass(\"rotate\");\n");
      out.write("                });\n");
      out.write("                $('.serv-btn').click(function () {\n");
      out.write("                    $('.sidebar ul .serv-show').toggleClass(\"show1\");\n");
      out.write("                    $('.sidebar ul .second').toggleClass(\"rotate\");\n");
      out.write("                });\n");
      out.write("                $('.sidebar ul li').click(function () {\n");
      out.write("                    $(this).addClass(\"active\").siblings().removeClass(\"active\");\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("\r\n");
      out.write("        <!--Css link-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!--Bootstrap 4-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                background-color: black;\r\n");
      out.write("            }\r\n");
      out.write("            h1{\r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            h5{\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      com.bookstore.dao.BookDAO bookList = null;
      synchronized (request) {
        bookList = (com.bookstore.dao.BookDAO) _jspx_page_context.getAttribute("bookList", PageContext.REQUEST_SCOPE);
        if (bookList == null){
          bookList = new com.bookstore.dao.BookDAO();
          _jspx_page_context.setAttribute("bookList", bookList, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        <center>\r\n");
      out.write("          \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"side\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"main\">\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                        <ol class=\"carousel-indicators\">\r\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                        <div class=\"carousel-inner\">\r\n");
      out.write("                            <div class=\"item active\" id=\"slide1\">\r\n");
      out.write("                                <div class=\"carousel-caption\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"item\" id=\"slide2\">\r\n");
      out.write("                                <div class=\"carousel-caption\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"item\" id=\"slide3\">\r\n");
      out.write("                                <div class=\"carousel-caption\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
      out.write("                            <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                            <span class=\"sr-only\">Next</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <h1>All BOOKS</h1>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h1>BEST SELLER</h1>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h1>RECOMMEND FOR YOU</h1>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"column\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </center>\r\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cssFooter.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss5.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/ajax/releases/v5.6.3/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <button id=\"back-to-top-btn\" onclick=\"backToTop()\"><i class=\"fas fa-angle-double-up\"></i></button>\n");
      out.write("            <div class=\"footer-container\">\n");
      out.write("                <div class=\"left-col\">\n");
      out.write("                    <img src=\"lg.png\" alt=\"\" class=\"logo\">\n");
      out.write("                    <div class=\"social-media\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"rights-text\">© 2020 Created By Lulu & Crows All Rights Reserved.</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"right-col\">\n");
      out.write("                    <h1 style=\"color: black\">Our Newsletter</h1>\n");
      out.write("                    <div class=\"border\"></div>\n");
      out.write("                    <p>Enter your email to get our sales and events.</p>\n");
      out.write("                    <form action=\"\" class=\"newsletter-form\">\n");
      out.write("                        <input type=\"text\" class=\"txtb\" placeholder=\"Your email...\">\n");
      out.write("                        <input type=\"submit\" class=\"btn\" value=\"Send\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <script type=\"text/javascript\" src=\"backToTop.js\"></script>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookList.getList()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("book");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"col-md-4\" style=\"padding: 5px;\">\r\n");
          out.write("                            <div style=\"margin:3px; padding:10px; background-color: #E5E8E8 ;\">\r\n");
          out.write("                                <div class=\"row\">\r\n");
          out.write("                                    <div class=\"col-md-4\">\r\n");
          out.write("                                        <img src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getCoverImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"max-height: 130px; max-width: 110px;\">\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"col-md-8\" style=\"text-align: left; padding-left:10px;\">\r\n");
          out.write("\r\n");
          out.write("                                        <a href=\"BookLookUp?isbn=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getIsbn()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                            <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("                                        </a>\r\n");
          out.write("                                        <h5> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getIsbn()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </h5>\r\n");
          out.write("                                        <h5> $ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </h5>\r\n");
          out.write("                                        &nbsp;\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookList.getRandom()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("book");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"col-md-4\" style=\"padding: 5px;\">\r\n");
          out.write("                            <div style=\"margin:3px; padding:10px; background-color: #E5E8E8;\">\r\n");
          out.write("                                <div class=\"row\">\r\n");
          out.write("                                    <div class=\"col-md-4\">\r\n");
          out.write("                                        <img src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getCoverImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"max-height: 130px; max-width: 110px;\">\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"col-md-8\" style=\"text-align: left; padding-left:10px;\">\r\n");
          out.write("\r\n");
          out.write("                                        <a href=\"BookLookUp?isbn=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getIsbn()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                            <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("                                        </a>\r\n");
          out.write("                                        <h5> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getIsbn()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </h5>\r\n");
          out.write("                                        <h5> $ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </h5>\r\n");
          out.write("                                        &nbsp;\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookList.getRandom()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("book");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"col-md-4\" style=\"padding: 5px;\">\r\n");
          out.write("                            <div style=\"margin:3px; padding:10px; background-color: #E5E8E8;\">\r\n");
          out.write("                                <div class=\"row\">\r\n");
          out.write("                                    <div class=\"col-md-4\">\r\n");
          out.write("                                        <img src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getCoverImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"max-height: 130px; max-width: 110px;\">\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"col-md-8\" style=\"text-align: left; padding-left:10px;\">\r\n");
          out.write("\r\n");
          out.write("                                        <a href=\"BookLookUp?isbn=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getIsbn()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                            <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("                                        </a>\r\n");
          out.write("                                        <h5> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getIsbn()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </h5>\r\n");
          out.write("                                        <h5> $ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </h5>\r\n");
          out.write("                                        &nbsp;\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
