package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head        \r\n");
      out.write("   \r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\r\n");
      out.write("    <title>login</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("      \r\n");
      out.write("   \r\n");
      out.write("\t<div class=\"container-login100\">\r\n");
      out.write("\t<div class=\"wrap-login100\">\r\n");
      out.write("\t\r\n");
      out.write("            <form class=\"login100-form validate-form\" method=\"post\" action=\"LoginServlet\" name=\"login_form\" id=\"login_form\" onsubmit=\"return validateForm()\">\r\n");
      out.write("                \r\n");
      out.write("                <span class=\"login100-form-title p-b-34 p-t-27\">\r\n");
      out.write("\t\t\tAccommodation Complaints\r\n");
      out.write("                </span>\r\n");
      out.write("                <div class=\"wrap-input100 validate-input\">\r\n");
      out.write("                    <label for=\"category\">Category:</label>\r\n");
      out.write("                    <select class=\"form-control\" id=\"category\" name=\"category\">\r\n");
      out.write("                        <option>Admin</option>\r\n");
      out.write("                        <option>Student</option>\r\n");
      out.write("                        <option>Halls Officer</option>\r\n");
      out.write("                        <option>Custodian</option>\r\n");
      out.write("                        <option>Mason</option>\r\n");
      out.write("                        <option>Carpenter</option>\r\n");
      out.write("                        <option>Security</option>\r\n");
      out.write("                        <option>Plumber</option>\r\n");
      out.write("                        <option>Electrician</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                  <div class=\"wrap-input100 validate-input\">\r\n");
      out.write("                    <label for=\"regNo\">RegNo/Staff No:</label>\r\n");
      out.write("                    <input type=\"text\" class=\"input100\" name=\"regNo\" id=\"regNo\" placeholder=\"RegNo/StaffNo\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"wrap-input100 validate-input\">\r\n");
      out.write("                    <label for=\"password\">Password:</label>\r\n");
      out.write("                    <input type=\"password\" class=\"input100\" name=\"password\" id=\"password\" placeholder=\"Password\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <button type=\"submit\" class=\"login100-form-btn\">Login</button>\r\n");
      out.write("            </form>\r\n");
      out.write("\t\t\t\t<!-- Form End-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t function validateForm()                                    \r\n");
      out.write("     { \r\n");
      out.write("         var regNo = document.forms[\"login_form\"][\"regNo\"];               \r\n");
      out.write("         var password = document.forms[\"login_form\"][\"password\"];\r\n");
      out.write("        \r\n");
      out.write("         if (regNo.value == \"\")                                  \r\n");
      out.write("         { \r\n");
      out.write("             window.alert(\"Please enter your Regno/StaffNo.\"); \r\n");
      out.write("             regNo.focus(); \r\n");
      out.write("             return false; \r\n");
      out.write("         } \r\n");
      out.write("\r\n");
      out.write("         if (password.value == \"\")                                  \r\n");
      out.write("         { \r\n");
      out.write("             window.alert(\"Please enter your Password.\"); \r\n");
      out.write("             password.focus(); \r\n");
      out.write("             return false; \r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("         return true; \r\n");
      out.write("     }\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
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
