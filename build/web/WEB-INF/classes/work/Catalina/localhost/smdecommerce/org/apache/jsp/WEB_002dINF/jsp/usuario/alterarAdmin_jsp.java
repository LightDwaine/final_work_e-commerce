/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-11-23 06:00:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import usuario.modelo.Usuario;

public final class alterarAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/template/cabecalho_dados.jsp", Long.valueOf(1700702907555L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("usuario.modelo.Usuario");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Shopmon</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\r\n");
      out.write("        \r\n");
      out.write("        <link href=\"style/cabecalho.css\" rel=\"stylesheet\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg fixed-top border-bottom\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">\r\n");
      out.write("                    <img src=\"img/ShopmonFinal.png\" alt=\"\" height class=\"d-inline-block align-text-top img-logo\">\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            ");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Shopmon</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        <link href=\"style/cabecalho.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <div class=\"form-cadastro\">\n");
      out.write("        <h1>Alterar seus dados</h1>\n");
      out.write("        ");
 Usuario usuario = (Usuario) session.getAttribute("usuario"); 
      out.write("\n");
      out.write("        <form action=\"AlterarAdmin\" method=\"post\">\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"inputNome\" class=\"form-label\">Nome completo</label>\n");
      out.write("                <input type=\"text\" name=\"nome\" class=\"form-control\" id=\"inputNome\" aria-describedby=\"nomeHelp\" value=\"");
      out.print( usuario.getNome());
      out.write("\">\n");
      out.write("                <div id=\"nomeHelp\" class=\"form-text\">Campo obrigatório.</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"inputEndereco\" class=\"form-label\">Endereço</label>\n");
      out.write("                <input type=\"text\" name=\"endereco\" class=\"form-control\" id=\"inputEndereco\" aria-describedby=\"enderecoHelp\" value=\"");
      out.print( usuario.getEndereco());
      out.write("\">\n");
      out.write("                <div id=\"enderecoHelp\" class=\"form-text\">Campo obrigatório.</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"inputEmail\" class=\"form-label\">E-mail</label>\n");
      out.write("                <input type=\"email\" name=\"email\" class=\"form-control\" id=\"inputEmail\" aria-describedby=\"emailHelp\" value=\"");
      out.print( usuario.getEmail());
      out.write("\">\n");
      out.write("                <div id=\"emailHelp\" class=\"form-text\">Campo obrigatório.</div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"inputLogin\" class=\"form-label\">Login</label>\n");
      out.write("                <input type=\"text\" name=\"login\" class=\"form-control\" id=\"inputLogin\" aria-describedby=\"loginHelp\" value=\"");
      out.print( usuario.getLogin());
      out.write("\">\n");
      out.write("                <div id=\"loginHelp\" class=\"form-text\">Campo obrigatório.</div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"inputSenha\" class=\"form-label\">Senha</label>\n");
      out.write("                <input type=\"text\" name=\"senha\" class=\"form-control\" id=\"inputSenha\" aria-describedby=\"senhaHelp\" value=\"");
      out.print( usuario.getSenha());
      out.write("\">\n");
      out.write("                <div id=\"senhaHelp\" class=\"form-text\">Campo obrigatório.</div>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-dark \">Atualizar</button>\n");
      out.write("             <p >Não quer alterar? <a href=\"index.jsp\">Sair</a></p>\n");
      out.write("        </form>\n");
      out.write("       </div>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
