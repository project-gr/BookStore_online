package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\".toggle\").on(\"click\", function () {\n");
      out.write("                    if ($(\".item\").hasClass(\"active\")) {\n");
      out.write("                        $(\".item\").removeClass(\"active\");\n");
      out.write("                    } else {\n");
      out.write("                        $(\".item\").addClass(\"active\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--NavBar-->\n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li class=\"logo\"><a href=\"Home.jsp\"><img src=\"#logo\" alt=\"logo\"></a></li>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <li class=\"button\"><a href=\"#\">About</a></li>\n");
      out.write("                    <li class=\"button\"><a href=\"#\">Category</a></li>\n");
      out.write("                    <li class=\"button\"><a href=\"#\">Services</a></li>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item show\">\n");
      out.write("                    <li class=\"button special dropdown\">\n");
      out.write("                        <a href=\"javascript:void(0)\" class=\"dropbtn\">Sign In <i class=\"fa fa-caret-down\"></i> </a>\n");
      out.write("\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                            <a href=\"StaffLogin.jsp\"> Staff Login </a>\n");
      out.write("                            <a href=\"CustomerLogin.jsp\"> Customer Login </a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <li class=\"toggle\"><span class=\"bars\"></span></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
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
