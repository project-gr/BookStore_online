package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"image.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"slides\">\n");
      out.write("            <input type=\"radio\" name=\"r\" id=\"r1\" checked>\n");
      out.write("            <input type=\"radio\" name=\"r\" id=\"r2\">\n");
      out.write("            <input type=\"radio\" name=\"r\" id=\"r3\">\n");
      out.write("            <input type=\"radio\" name=\"r\" id=\"r4\">\n");
      out.write("            <input type=\"radio\" name=\"r\" id=\"r5\">\n");
      out.write("            <div class=\"slide s1\">\n");
      out.write("                <img src=\"https://www.catdumb.tv/wp-content/uploads/2019/12/hee.jpg\" alt=\"\">\n");
      out.write("            </div> \n");
      out.write("            <div class=\"slide\">\n");
      out.write("                <img src=\"https://livestream.vn/wp-content/uploads/2018/10/p8.jpg\" alt=\"\">\n");
      out.write("            </div> \n");
      out.write("            <div class=\"slide\">\n");
      out.write("                <img src=\"https://www.bestcasinosites.net/wp-content/uploads/2020/03/hating-on-girl-streamers.jpg\" alt=\"\">\n");
      out.write("            </div>                \n");
      out.write("            <div class=\"slide\">\n");
      out.write("                <img src=\"https://i.ytimg.com/vi/GtjYH_66aNY/maxresdefault.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"slide\">\n");
      out.write("                <img src=\"https://archive.org/download/twitch-stream-alinity/twitch-stream-alinity.thumbs/Alinity%202019-11-26%2020_22-36296659632_000054.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"navigation\">\n");
      out.write("            <label for=\"r1\" class=\"bar\"></label>\n");
      out.write("            <label for=\"r2\" class=\"bar\"></label>\n");
      out.write("            <label for=\"r3\" class=\"bar\"></label>\n");
      out.write("            <label for=\"r4\" class=\"bar\"></label>\n");
      out.write("            <label for=\"r5\" class=\"bar\"></label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
