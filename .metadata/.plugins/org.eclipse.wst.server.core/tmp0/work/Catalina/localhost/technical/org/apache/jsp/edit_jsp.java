/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-09-04 06:12:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1598842774271L));
    _jspx_dependants.put("jar:file:/D:/projects/java/java%20web/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/technical/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425958870000L));
    _jspx_dependants.put("/Header.jsp", Long.valueOf(1598843717929L));
    _jspx_dependants.put("/Footer.jsp", Long.valueOf(1598934449517L));
    _jspx_dependants.put("jar:file:/D:/projects/java/java%20web/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/technical/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/sql.tld", Long.valueOf(1425958870000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.release();
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("    \r\n");
      out.write("        <title>Technical Blogs</title>\r\n");
      out.write("        <meta content=\"\" name=\"descriptison\">\r\n");
      out.write("        <meta content=\"\" name=\"keywords\">\r\n");
      out.write("    \r\n");
      out.write("        <!-- Favicons -->\r\n");
      out.write("        <link href=\"img/favicon.png\" rel=\"icon\">\r\n");
      out.write("        <link href=\"img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\r\n");
      out.write("    \r\n");
      out.write("        <!-- Google Fonts -->\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
      out.write("            <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\r\n");
      out.write("    \r\n");
      out.write("        <!-- Vendor CSS Files -->\r\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"vendor/icofont/icofont.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"vendor/owl.carousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"vendor/animate.css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"vendor/aos/aos.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("        <!-- Template Main CSS File -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("        <!-- =======================================================\r\n");
      out.write("      * Template Name: Mentor - v2.0.0\r\n");
      out.write("      * Template URL: https://bootstrapmade.com/mentor-free-education-bootstrap-theme/\r\n");
      out.write("      * Author: BootstrapMade.com\r\n");
      out.write("      * License: https://bootstrapmade.com/license/\r\n");
      out.write("      ======================================================== -->\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
 response.setHeader("Cache-Control" ,"no-cache ,no-store ,must-revalidate"); // HTTP 1.1
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0
		response.setHeader("Expires" ,"0"); // Proxies
		if(session.getAttribute("username")==null){
			response.sendRedirect("login.jsp");
		}
		
      out.write("\r\n");
      out.write("<header id=\"header\" class=\"fixed-top\">\r\n");
      out.write("  <div class=\"container d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("    <h1 class=\"logo mr-auto\"><a href=\"index.html\">Technical Blogs</a></h1>\r\n");
      out.write("    <!-- Uncomment below if you prefer to use an image logo -->\r\n");
      out.write("    <!-- <a href=\"index.html\" class=\"logo mr-auto\"><img src=\"assets/img/logo.png\" alt=\"\" class=\"img-fluid\"></a>-->\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"nav-menu d-none d-lg-block\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li class=\"active\"><a href=\"/\">Home</a></li>\r\n");
      out.write("        <li><a href=\"/about\">About</a></li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"/contact\">Contact</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav><!-- .nav-menu -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</header><!-- End Header -->\r\n");
      out.write("   \r\n");

int id=Integer.parseInt(request.getParameter("id"));
request.setAttribute("id", id);

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_sql_005fsetDataSource_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_sql_005fquery_005f0(_jspx_page_context))
        return;
      out.write(' ');
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("<hr>\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("    <!-- ======= Footer ======= -->\r\n");
      out.write("    <footer id=\"footer\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 footer-contact\">\r\n");
      out.write("                        <h3>Technical Blogs</h3>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            L.D College of engineering,<br>120, Circular Road,<br> University Area, Ahmedabad,<br> Gujarat 380015<br>\r\n");
      out.write("                            <strong>Phone:</strong> 9157911555<br>\r\n");
      out.write("                            <strong>Email:</strong> yourprofit@gmail.com<br>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-lg-2 col-md-6 footer-links\">\r\n");
      out.write("                        <h4>Useful Links</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"About.jsp\">About us</a></li>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"Contact.jsp\">Contact us</a></li>\r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container d-md-flex py-4\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"mr-md-auto text-center text-md-left\">\r\n");
      out.write("                <div class=\"copyright\">\r\n");
      out.write("                    &copy; Copyright <strong><span>Technical Blogs</span></strong>. All Rights Reserved\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"social-links text-center text-md-right pt-3 pt-md-0\">\r\n");
      out.write("                <a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a>\r\n");
      out.write("                <a href=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a>\r\n");
      out.write("                <a href=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a>\r\n");
      out.write("                <a href=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a>\r\n");
      out.write("                <a href=\"#\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer><!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("    <a href=\"#\" class=\"back-to-top\"><i class=\"bx bx-up-arrow-alt\"></i></a>\r\n");
      out.write("    <div id=\"preloader\"></div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Vendor JS Files -->\r\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/jquery.easing/jquery.easing.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("    <script src=\"vendor/waypoints/jquery.waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/counterup/counterup.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/owl.carousel/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/aos/aos.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Main JS File -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("    <script src=\"js/form.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_sql_005fsetDataSource_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_005fsetDataSource_005f0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    boolean _jspx_th_sql_005fsetDataSource_005f0_reused = false;
    try {
      _jspx_th_sql_005fsetDataSource_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sql_005fsetDataSource_005f0.setParent(null);
      // /edit.jsp(40,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fsetDataSource_005f0.setVar("db");
      // /edit.jsp(40,0) name = driver type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fsetDataSource_005f0.setDriver("com.mysql.jdbc.Driver");
      // /edit.jsp(40,0) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fsetDataSource_005f0.setUrl("jdbc:mysql://localhost:3306/technicalblogs");
      // /edit.jsp(40,0) name = user type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fsetDataSource_005f0.setUser("root");
      // /edit.jsp(40,0) name = password type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fsetDataSource_005f0.setPassword("");
      int _jspx_eval_sql_005fsetDataSource_005f0 = _jspx_th_sql_005fsetDataSource_005f0.doStartTag();
      if (_jspx_th_sql_005fsetDataSource_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fuser_005furl_005fpassword_005fdriver_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
      _jspx_th_sql_005fsetDataSource_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sql_005fsetDataSource_005f0, _jsp_getInstanceManager(), _jspx_th_sql_005fsetDataSource_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sql_005fquery_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_005fquery_005f0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    boolean _jspx_th_sql_005fquery_005f0_reused = false;
    try {
      _jspx_th_sql_005fquery_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sql_005fquery_005f0.setParent(null);
      // /edit.jsp(41,1) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fquery_005f0.setVar("rs");
      // /edit.jsp(41,1) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sql_005fquery_005f0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_sql_005fquery_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sql_005fquery_005f0 = _jspx_th_sql_005fquery_005f0.doStartTag();
        if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            _jspx_push_body_count_sql_005fquery_005f0[0]++;
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_sql_005fquery_005f0);
          }
          do {
            out.write("select * from posts where id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            int evalDoAfterBody = _jspx_th_sql_005fquery_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
            _jspx_push_body_count_sql_005fquery_005f0[0]--;
          }
        }
        if (_jspx_th_sql_005fquery_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sql_005fquery_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sql_005fquery_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sql_005fquery_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.reuse(_jspx_th_sql_005fquery_005f0);
      _jspx_th_sql_005fquery_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sql_005fquery_005f0, _jsp_getInstanceManager(), _jspx_th_sql_005fquery_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /edit.jsp(42,0) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/edit.jsp(42,0) '${rs.rows}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${rs.rows}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /edit.jsp(42,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("post");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("<section style=\"padding-top: 100px;\">\r\n");
            out.write("\r\n");
            out.write("  <div class=\"col-md-10 mt-5 mx-auto\">\r\n");
            out.write("    <div class=\"container mx-auto\">\r\n");
            out.write("      \r\n");
            out.write("      <form action=\"edit?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" method=\"post\" >\r\n");
            out.write("\r\n");
            out.write("      \r\n");
            out.write("     \r\n");
            out.write("     \r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <textarea class=\"form-control\" name=\"title\" rows=\"5\" data-rule=\"required\"\r\n");
            out.write("            data-msg=\"Please write something for us\" >");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</textarea>\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <input type=\"text\" class=\"form-control\" name=\"slug\" id=\"subject\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.slug }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" data-rule=\"minlen:4\"\r\n");
            out.write("            data-msg=\"Please enter at least 8 chars of subject\" />\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("\r\n");
            out.write("        <!-- 0 -->\r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("\r\n");
            out.write("          \r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <textarea class=\"form-control\" name=\"content1\" rows=\"5\" colums=\"200\" data-rule=\"required\"\r\n");
            out.write("            data-msg=\"Please write something for us\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.content1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</textarea>\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("        \r\n");
            out.write("        \r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <textarea class=\"form-control\" name=\"content2\" rows=\"5\" colums=\"200\" data-rule=\"required\"\r\n");
            out.write("            data-msg=\"Please write something for us\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.content2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</textarea>\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("        \r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <textarea class=\"form-control\" name=\"content3\" rows=\"5\" colums=\"200\" data-rule=\"required\"\r\n");
            out.write("            data-msg=\"Please write something for us\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.content3}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</textarea>\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("        \r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <textarea class=\"form-control\" name=\"content4\" rows=\"5\" colums=\"200\" data-rule=\"required\"\r\n");
            out.write("            data-msg=\"Please write something for us\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.content4}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</textarea>\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("        \r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <textarea class=\"form-control\" name=\"content5\" rows=\"5\" colums=\"200\" data-rule=\"required\"\r\n");
            out.write("            data-msg=\"Please write something for us\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.content5}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</textarea>\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("        \r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <textarea class=\"form-control\" name=\"content6\" rows=\"5\" colums=\"200\" data-rule=\"required\"\r\n");
            out.write("            data-msg=\"Please write something for us\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.content6}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</textarea>\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("        \r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <textarea class=\"form-control\" name=\"content7\" rows=\"5\" colums=\"200\" data-rule=\"required\"\r\n");
            out.write("            data-msg=\"Please write something for us\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.content7}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</textarea>\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("        \r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <textarea class=\"form-control\" name=\"content8\" rows=\"5\" colums=\"200\" data-rule=\"required\"\r\n");
            out.write("            data-msg=\"Please write something for us\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.content8}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</textarea>\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("        \r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <textarea class=\"form-control\" name=\"content9\" rows=\"5\" colums=\"200\" data-rule=\"required\"\r\n");
            out.write("            data-msg=\"Please write something for us\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.content9}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</textarea>\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("        \r\n");
            out.write("        <div class=\"form-group\">\r\n");
            out.write("          <textarea class=\"form-control\" name=\"content10\" rows=\"5\" colums=\"200\" data-rule=\"required\"\r\n");
            out.write("            data-msg=\"Please write something for us\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.content10}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</textarea>\r\n");
            out.write("          <div class=\"validate\"></div>\r\n");
            out.write("        </div>\r\n");
            out.write("                            <button onclick=\"myfunc2()\" class=\"btn btn-submit btn-block\"\r\n");
            out.write("                              style=\"background-color: #5f86cf;\" type=\"submit\">Post edited post</button>\r\n");
            out.write("      </form>\r\n");
            out.write("    </div>\r\n");
            out.write("  </div>\r\n");
            out.write("</section>\r\n");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
