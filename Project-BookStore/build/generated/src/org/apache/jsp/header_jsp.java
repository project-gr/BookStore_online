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

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
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
      out.write("                    <li class=\"active\"><a href=\"AllBook.jsp\">All Book</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\" class=\"feat-btn\">Category\n");
      out.write("                            <span class=\"fas fa-caret-down first\"></span>\n");
      out.write("                        </a>\n");
      out.write("                        ");
      com.bookstore.dao.CategoryDAO categoryList = null;
      synchronized (request) {
        categoryList = (com.bookstore.dao.CategoryDAO) _jspx_page_context.getAttribute("categoryList", PageContext.REQUEST_SCOPE);
        if (categoryList == null){
          categoryList = new com.bookstore.dao.CategoryDAO();
          _jspx_page_context.setAttribute("categoryList", categoryList, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("                            <ul class=\"feat-show\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('.carousel').carousel({\n");
      out.write("                    interval: 500\n");
      out.write("                })\n");
      out.write("            });\n");
      out.write("            var dropdownOpen = document.\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList.getList()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("category");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                                <li><a href=\"SearchCategory?categoryName=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getCategoryName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getCategoryName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                ");
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
}
