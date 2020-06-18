package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Created By CodingNepal -->\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Sidebar Menu with sub-menu | CodingNepal</title>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap');\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                user-select: none;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                font-family: 'Poppins', sans-serif;\n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 15px;\n");
      out.write("                left: 45px;\n");
      out.write("                height: 45px;\n");
      out.write("                width: 45px;\n");
      out.write("                text-align: center;\n");
      out.write("                background: #1b1b1b;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: left 0.4s ease;\n");
      out.write("            }\n");
      out.write("            .btn.click{\n");
      out.write("                left: 260px;\n");
      out.write("            }\n");
      out.write("            .btn span{\n");
      out.write("                color: white;\n");
      out.write("                font-size: 28px;\n");
      out.write("                line-height: 45px;\n");
      out.write("            }\n");
      out.write("            .btn.click span:before{\n");
      out.write("                content: '\\f00d';\n");
      out.write("            }\n");
      out.write("            .sidebar{\n");
      out.write("                position: fixed;\n");
      out.write("                width: 250px;\n");
      out.write("                height: 100%;\n");
      out.write("                left: -250px;\n");
      out.write("                background: #1b1b1b;\n");
      out.write("                transition: left 0.4s ease;\n");
      out.write("            }\n");
      out.write("            .sidebar.show{\n");
      out.write("                left: 0px;\n");
      out.write("            }\n");
      out.write("            .sidebar .text{\n");
      out.write("                color: white;\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                line-height: 65px;\n");
      out.write("                text-align: center;\n");
      out.write("                background: #1e1e1e;\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("            }\n");
      out.write("            nav ul{\n");
      out.write("                background: #1b1b1b;\n");
      out.write("                height: 100%;\n");
      out.write("                width: 100%;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            nav ul li{\n");
      out.write("                line-height: 60px;\n");
      out.write("                border-top: 1px solid rgba(255,255,255,0.1);\n");
      out.write("            }\n");
      out.write("            nav ul li:last-child{\n");
      out.write("                border-bottom: 1px solid rgba(255,255,255,0.05);\n");
      out.write("            }\n");
      out.write("            nav ul li a{\n");
      out.write("                position: relative;\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 18px;\n");
      out.write("                padding-left: 40px;\n");
      out.write("                font-weight: 500;\n");
      out.write("                display: block;\n");
      out.write("                width: 100%;\n");
      out.write("                border-left: 3px solid transparent;\n");
      out.write("            }\n");
      out.write("            nav ul li.active a{\n");
      out.write("                color: cyan;\n");
      out.write("                background: #1e1e1e;\n");
      out.write("                border-left-color: cyan;\n");
      out.write("            }\n");
      out.write("            nav ul li a:hover{\n");
      out.write("                background: #1e1e1e;\n");
      out.write("            }\n");
      out.write("            nav ul ul{\n");
      out.write("                position: static;\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            nav ul .feat-show.show{\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            nav ul .serv-show.show1{\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            nav ul ul li{\n");
      out.write("                line-height: 42px;\n");
      out.write("                border-top: none;\n");
      out.write("            }\n");
      out.write("            nav ul ul li a{\n");
      out.write("                font-size: 17px;\n");
      out.write("                color: #e6e6e6;\n");
      out.write("                padding-left: 80px;\n");
      out.write("            }\n");
      out.write("            nav ul li.active ul li a{\n");
      out.write("                color: #e6e6e6;\n");
      out.write("                background: #1b1b1b;\n");
      out.write("                border-left-color: transparent;\n");
      out.write("            }\n");
      out.write("            nav ul ul li a:hover{\n");
      out.write("                color: cyan!important;\n");
      out.write("                background: #1e1e1e!important;\n");
      out.write("            }\n");
      out.write("            nav ul li a span{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                right: 20px;\n");
      out.write("                transform: translateY(-50%);\n");
      out.write("                font-size: 22px;\n");
      out.write("                transition: transform 0.4s;\n");
      out.write("            }\n");
      out.write("            nav ul li a span.rotate{\n");
      out.write("                transform: translateY(-50%) rotate(-180deg);\n");
      out.write("            }\n");
      out.write("            .content{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%,-50%);\n");
      out.write("                color: #202020;\n");
      out.write("                z-index: -1;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .content .header{\n");
      out.write("                font-size: 45px;\n");
      out.write("                font-weight: 600;\n");
      out.write("            }\n");
      out.write("            .content p{\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-weight: 500;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"btn\">\n");
      out.write("            <span class=\"fas fa-bars\"></span>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"sidebar\">\n");
      out.write("            <div class=\"text\">\n");
      out.write("                Side Menu</div>\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"active\"><a href=\"#\">Dashboard</a></li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" class=\"feat-btn\">Features\n");
      out.write("                        <span class=\"fas fa-caret-down first\"></span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"feat-show\">\n");
      out.write("                        <li><a href=\"#\">Pages</a></li>\n");
      out.write("                        <li><a href=\"#\">Elements</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" class=\"serv-btn\">Services\n");
      out.write("                        <span class=\"fas fa-caret-down second\"></span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"serv-show\">\n");
      out.write("                        <li><a href=\"#\">App Design</a></li>\n");
      out.write("                        <li><a href=\"#\">Web Design</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">Portfolio</a></li>\n");
      out.write("                <li><a href=\"#\">Overview</a></li>\n");
      out.write("                <li><a href=\"#\">Shortcuts</a></li>\n");
      out.write("                <li><a href=\"#\">Feedback</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                Sidebar Menu with sub-menu</div>\n");
      out.write("            <p>\n");
      out.write("                HTML CSS & Javascript (Full Tutorial)</p>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            $('.btn').click(function () {\n");
      out.write("                $(this).toggleClass(\"click\");\n");
      out.write("                $('.sidebar').toggleClass(\"show\");\n");
      out.write("            });\n");
      out.write("            $('.feat-btn').click(function () {\n");
      out.write("                $('nav ul .feat-show').toggleClass(\"show\");\n");
      out.write("                $('nav ul .first').toggleClass(\"rotate\");\n");
      out.write("            });\n");
      out.write("            $('.serv-btn').click(function () {\n");
      out.write("                $('nav ul .serv-show').toggleClass(\"show1\");\n");
      out.write("                $('nav ul .second').toggleClass(\"rotate\");\n");
      out.write("            });\n");
      out.write("            $('nav ul li').click(function () {\n");
      out.write("                $(this).addClass(\"active\").siblings().removeClass(\"active\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
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
