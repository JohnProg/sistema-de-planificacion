package org.apache.jsp.views.PlanOperativo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateActividades_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/static/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/static/css/font-awesome.min.css\">\n");
      out.write("        <title> Plan Operativo </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <button class=\"btn btn-lg btn-danger\"> Salir </button>\n");
      out.write("            <br>\n");
      out.write("            <section class=\"row col-sm-12 col-sm-offset-0\">\n");
      out.write("                <h2 style=\"text-align:center;\"> Plan Operativo</h2>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"col-sm-4 col-sm-offset-1\" id=\"plan-operativo\">\n");
      out.write("                    <form role=\"form\" name=\"form\" method=\"post\" id=\"miFormulario\" >\n");
      out.write("                        <div class=\"form-group\" style=\"width: 300px;\">\n");
      out.write("                            <label for=\"nombre\">Nombre :</label>\n");
      out.write("                            <input id=\"nombre\" type=\"text\" name=\"nombre\" class=\"form-control\" placeholder=\"Nombre\"  required=\"\"/>                  \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"mensaje\">Descripcion :</label>\n");
      out.write("                            <textarea id=\"mensaje\" name=\"mensaje\" class=\"form-control\" placeholder=\"Descripcion\" required=\"\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <button class=\"btn btn-lg btn-info\" id=\"btnCrear\"> Crear Plan Operativo </button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-4 col-sm-offset-1\" id=\"plan-operativo\">\n");
      out.write("                    <br>\n");
      out.write("                    <form role=\"form\" name=\"form\" method=\"post\" id=\"miFormulario\" >\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label> Plan : </label>\n");
      out.write("                            <select class=\"form-control\"  name=\"cboplan\" required=\"\">\n");
      out.write("                                <option value=\"\" selected> ---- Escoga un Plan ---- </option>\n");
      out.write("                                <option> Plan operativo 1</option>\n");
      out.write("                                <option> Plab operativo 2</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label> Linea : </label>\n");
      out.write("                            <select class=\"form-control\" name=\"cbolinea\" required=\"\">\n");
      out.write("                                <option value=\"\" selected> ---- Escoga una Linea ---- </option>\n");
      out.write("                                <option> Linea 1</option>\n");
      out.write("                                <option> Linea 2</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label> Objetivos: </label>\n");
      out.write("                            <select class=\"form-control\" name=\"cboob\" required=\"\">\n");
      out.write("                                <option value=\"\" selected> ---- Escoga un Objetivo ---- </option>\n");
      out.write("                                <option> Objetivo 1</option>\n");
      out.write("                                <option> Objetivo 2</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label> Sub-Objetivos : </label>\n");
      out.write("                            <select class=\"form-control\" name=\"cbosub\" required=\"\">\n");
      out.write("                                <option value=\"\" selected> ---- Escoga un Sub-objetivo ---- </option>\n");
      out.write("                                <option> Sub-Objetivo 1</option>\n");
      out.write("                                <option> Sub-Objetivo 2</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("         </div>\n");
      out.write("            <script src=\"http://code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("            <script src=\"");
      out.print(request.getContextPath());
      out.write("/static/js/ValidacionAldo.js\"></script> \n");
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
