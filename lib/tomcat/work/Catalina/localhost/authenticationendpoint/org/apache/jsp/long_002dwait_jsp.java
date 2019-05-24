/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.85
 * Generated at: 2019-05-23 18:57:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AdaptiveAuthUtil;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import org.owasp.encoder.Encode;
import org.apache.commons.lang.StringUtils;

public final class long_002dwait_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/localize.jsp", Long.valueOf(1536728342000L));
    _jspx_dependants.put("/init-url.jsp", Long.valueOf(1536728342000L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(), new
            EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

    String identityServerEndpointContextParam = application.getInitParameter("IdentityServerEndpointContextURL");
    String samlssoURL = "../samlsso";
    String commonauthURL = "../commonauth";
    String oauth2AuthorizeURL = "../oauth2/authorize";
    String oidcLogoutURL = "../oidc/logout";
    String openidServerURL = "../openidserver";
    if (StringUtils.isNotBlank(identityServerEndpointContextParam)) {
        samlssoURL = identityServerEndpointContextParam + "/samlsso";
        commonauthURL = identityServerEndpointContextParam + "/commonauth";
        oauth2AuthorizeURL = identityServerEndpointContextParam + "/oauth2/authorize";
        oidcLogoutURL = identityServerEndpointContextParam + "/oidc/logout";
        openidServerURL = identityServerEndpointContextParam + "/oidc/logout";
    }

      out.write('\n');
      out.write('\n');

    String sessionDataKey = Encode.forHtmlAttribute(request.getParameter("sessionDataKey"));

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "wso2.identity.server"));
      out.write("\n");
      out.write("    </title>\n");
      out.write("    \n");
      out.write("    <link rel=\"icon\" href=\"images/favicon.png\" type=\"image/x-icon\"/>\n");
      out.write("    <link href=\"libs/bootstrap_3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/Roboto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/custom-common.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/longwait-loader.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <script language=\"JavaScript\" type=\"text/javascript\" src=\"libs/jquery_1.11.3/jquery-1.11.3.js\"></script>\n");
      out.write("    <script language=\"JavaScript\" type=\"text/javascript\" src=\"libs/bootstrap_3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"loader-wrapper\">\n");
      out.write("    <div id=\"loader\"></div>\n");
      out.write("    <form id=\"toCommonAuth\" action=\"");
      out.print(commonauthURL);
      out.write("\" method=\"POST\" style=\"display:none;\">\n");
      out.write("        <input id=\"sessionDataKey\" type=\"hidden\" name=\"sessionDataKey\" value=\"");
      out.print(sessionDataKey);
      out.write("\">\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var sessionDataKey = '");
      out.print(sessionDataKey);
      out.write("';\n");
      out.write("    var refreshInterval = '");
      out.print(AdaptiveAuthUtil.getRefreshInterval());
      out.write("';\n");
      out.write("    var timeout = '");
      out.print(AdaptiveAuthUtil.getRequestTimeout());
      out.write("';\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        var intervalListener = window.setInterval(function () {\n");
      out.write("            checkLongWaitStatus();\n");
      out.write("        }, refreshInterval);\n");
      out.write("\n");
      out.write("        var timeoutListenerListener = window.setTimeout(function () {\n");
      out.write("            window.clearInterval(intervalListener);\n");
      out.write("            window.location.replace(\"retry.do\");\n");
      out.write("        }, timeout);\n");
      out.write("\n");
      out.write("        function checkLongWaitStatus() {\n");
      out.write("            $.ajax(\"/longwaitstatus\", {\n");
      out.write("                async: false,\n");
      out.write("                data: {waitingId: sessionDataKey},\n");
      out.write("                success: function (res) {\n");
      out.write("                    handleStatusResponse(res);\n");
      out.write("                },\n");
      out.write("                error: function (res) {\n");
      out.write("                    window.clearInterval(intervalListener);\n");
      out.write("                    window.location.replace(\"retry.do\");\n");
      out.write("                },\n");
      out.write("                failure: function (res) {\n");
      out.write("                    window.clearInterval(intervalListener);\n");
      out.write("                    window.location.replace(\"retry.do\");\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function handleStatusResponse(res) {\n");
      out.write("            if (res.status === 'COMPLETED') {\n");
      out.write("                continueAuthentication();\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function continueAuthentication() {\n");
      out.write("            //Redirect to common auth\n");
      out.write("            window.clearInterval(intervalListener);\n");
      out.write("            document.getElementById(\"toCommonAuth\").submit();\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
