/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.85
 * Generated at: 2019-05-23 18:57:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;

public final class cookie_005fpolicy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/localize.jsp", Long.valueOf(1536728342000L));
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(), new
            EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "wso2.identity.server"));
      out.write("</title>\n");
      out.write("\n");
      out.write("    <link rel=\"icon\" href=\"images/favicon.png\" type=\"image/x-icon\"/>\n");
      out.write("    <link href=\"libs/bootstrap_3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/Roboto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/custom-common.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- header -->\n");
      out.write("<header class=\"header header-default\">\n");
      out.write("    <div class=\"container-fluid\"><br></div>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"pull-left brand float-remove-xs text-center-xs\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <img src=\"images/logo-inverse.svg\" alt=\"wso2\" title=\"wso2\" class=\"logo\">\n");
      out.write("                <h1><em>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "identity.server"));
      out.write("\n");
      out.write("                </em></h1>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- page content -->\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12 col-sm-3 col-md-3 col-lg-3 col-sm-offset-1 col-md-offset-1 col-lg-offset-1\">\n");
      out.write("        <div id=\"toc\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-xs-12 col-sm-7 col-md-7 col-lg-7\">\n");
      out.write("        <!-- content -->\n");
      out.write("        <div class=\"container col-xs-12 col-sm-12 col-md-12 col-lg-12 col-centered wr-content wr-login col-centered padding-bottom-100\">\n");
      out.write("            <div>\n");
      out.write("                <h2 class=\"wr-title uppercase blue-bg padding-double white boarder-bottom-blue margin-none\">\n");
      out.write("                    ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "wso2.identity.server"));
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "privacy.policy.cookies"));
      out.write("\n");
      out.write("                </h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"boarder-all \">\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div id=\"cookiePolicy\" class=\"padding-double\">\n");
      out.write("                    <h4><a href=\"http://wso2.org/library/identity-server\"><strong>About WSO2 Identity Server</strong></a></h4>\n");
      out.write("                    <p>WSO2 Identity Server (referred to as &ldquo;WSO2 IS 5.5.0&rdquo; within this policy) is an open source Identity Management and Entitlement Server that is based on open standards and specifications.</p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"cookie-policy\"><strong>Cookie Policy</strong></h2>\n");
      out.write("                    <p>WSO2 IS 5.5.0 uses cookies so that it can provide the best user experience for you and identify you for security purposes. If you disable cookies, some of the services will (most probably) be inaccessible to you. </p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"how-wso2-is-5.5.0-processes-cookies\">How does WSO2 IS 5.5.0 process cookies?</h2>\n");
      out.write("                    <p>WSO2 IS 5.5.0 stores and retrieves information on your browser using cookies. This information is used to provide a better experience. Some cookies serve the primary purposes of allowing a user to log in to the system, maintaining sessions, and keeping track of activities you do within the login session.</p>\n");
      out.write("                    <p>The primary purpose of some cookies used in WSO2 IS 5.5.0 is to personally identify you as this is the main function of the WSO2 Identity Server. However the cookie lifetime ends once your session ends i.e., after you log-out, or after the session expiry time has elapsed.</p>\n");
      out.write("                    <p>Some cookies are simply used to give you a more personalised web experience and these cookies can not be used to personally identify you or your activities.</p>\n");
      out.write("                    <p>This cookie policy is part of the <a href=\"privacy_policy.do\">WSO2 IS 5.5.0 Privacy Policy.</a></p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"what-is-a-cookie\">What is a cookie?</h2>\n");
      out.write("                    <p>A browser cookie is a small piece of data that is stored on your device to help websites and mobile apps remember things about you. Other technologies, including web storage and identifiers associated with your device, may be used for similar purposes. In this policy, we use the term &ldquo;cookies&rdquo; to discuss all of these technologies.</p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"what-does-wso2-is-5.5.0-use-cookies-for\">What does WSO2 IS 5.5.0 use cookies for?</h2>\n");
      out.write("                    <p>Cookies are used for two purposes in WSO2 IS 5.5.0.</p>\n");
      out.write("                    <ol>\n");
      out.write("                        <li>To identify you and provide security (as this is the main function of WSO2 IS).</li>\n");
      out.write("                        <li>To provide a satisfying user experience.</li>\n");
      out.write("                    </ol>\n");
      out.write("                    <div class=\"margin-bottom\"></div>\n");
      out.write("                    <p>WSO2 IS 5.5.0 uses cookies for the following purposes listed below.</p>\n");
      out.write("                    <h3>Preferences</h3>\n");
      out.write("                    <p>WSO2 IS 5.5.0 uses these cookies to remember your settings and preferences, and to auto-fill the form fields to make your interactions with the site easier. </p>\n");
      out.write("                    <p>These cookies can not be used to personally identify you.</p>\n");
      out.write("                    <h3>Security</h3>\n");
      out.write("              <ul>\n");
      out.write("                    <li>WSO2 IS 5.5.0 uses selected cookies to identify and prevent security risks.\n");
      out.write("                     For example, WSO2 IS 5.5.0 may use these cookies to store your session information in order to prevent others from changing your password without your username and password.</li>\n");
      out.write("                </br><li>WSO2 IS 5.5.0 uses session cookies to maintain your active session.</li>\n");
      out.write("                  </br>   <li>WSO2 IS 5.5.0 may use temporary cookies when performing multi-factor authentication and federated authentication.</li>\n");
      out.write("              </br>   <li>WSO2 IS 5.5.0 may use permanent cookies to detect that you have previously used the same device to log in. This is to to calculate the &ldquo;risk level&rdquo; associated with your current login attempt. This is primarily to protect you and your account from possible attack.</li>\n");
      out.write("              </ul>   \n");
      out.write("                    <h3>Performance</h3>\n");
      out.write("                    <p>WSO2 IS 5.5.0 may use cookies to allow &ldquo;Remember Me&rdquo; functionalities.</p>\n");
      out.write("                    <div class=\"margin-bottom\"></div>\n");
      out.write("                    <h3 id=\"analytics\">Analytics</h3>\n");
      out.write("                    <p>WSO2 IS 5.5.0 as a product does not use cookies for analytical purposes.</p>\n");
      out.write("                    <div class=\"margin-bottom\"></div>\n");
      out.write("                    <h3 id=\"third-party-cookies\">Third party cookies</h3>\n");
      out.write("                    <p>Using WSO2 IS 5.5.0 may cause some third-party cookies to be set in your browser. WSO2 IS 5.5.0 has no control over how any of them operate. The third-party cookies that may be set include:</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Any social login sites. For example, third-party cookies may be set when WSO2 IS 5.5.0 is configured to use &ldquo;social&rdquo; or &ldquo;federated&rdquo; login, and you opt to login with your &ldquo;Social Account&rdquo;.</li>\n");
      out.write("                            <li>Any third party federated login.</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </ul>\n");
      out.write("                    <p>WSO2 strongly advises you to refer the respective cookie policy of such sites carefully as WSO2 has no knowledge or use on these cookies.</p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"what-type-of-cookies-does-5.5.0-use\">What type of cookies does WSO2 IS 5.5.0 use?</h2>\n");
      out.write("                    <p>WSO2 IS 5.5.0 uses persistent cookies and session cookies. A persistent cookie helps WSO2 IS 5.5.0 to recognize you as an existing user so that it is easier to return to WSO2 or interact with WSO2 IS 5.5.0 without signing in again. After you sign in, a persistent cookie stays in your browser and will be read by WSO2 IS 5.5.0 when you return to WSO2 IS 5.5.0.</p>\n");
      out.write("                    <p>A session cookie is a cookie that is erased when the user closes the web browser. The session cookie is stored in temporary memory and is not retained after the browser is closed. Session cookies do not collect information from the user's computer.</p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"how-do-i-control-my-cookies\">How do I control my cookies?</h2>\n");
      out.write("                    <p>Most browsers allow you to control cookies through their settings preferences. However, if you limit the given ability for websites to set cookies, you may worsen your overall user experience since it will no longer be personalized to you. It may also stop you from saving customized settings like login information.</p>\n");
      out.write("                    <p>Most likely, disabling cookies will make you unable to use authentication and authorization functionalities offered by WSO2 IS 5.5.0.</p>\n");
      out.write("                    <p>If you have any questions or concerns regarding the use of cookies, please contact the entity or individuals (or their data protection officer, if applicable) of the organization running this WSO2 IS 5.5.0 instance.</p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"what-are-the-cookies-used\">What are the cookies used?</h2>\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                        <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <p><strong>Cookie Name</strong></p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p><strong>Purpose</strong></p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p><strong>Retention</strong></p>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <p>JSESSIONID</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p>To keep your session data in order to give you a good user experience.</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p>Session</p>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <p>MSGnnnnnnnnnn</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p>To keep some messages that are shown to you in order to give you a good user experience.</p>\n");
      out.write("                                <p>The &ldquo;nnnnnnnnnn&rdquo; reference in this coookie represents a random number e.g., MSG324935932.</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p>Session</p>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <p>requestedURI</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p>The URI you are accessing.</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p>Session</p>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <p>current-breadcrumb</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p>To keep your active page in session in order to give you a good user experience.</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p>Session</p>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"disclaimer\">Disclaimer</h2>\n");
      out.write("                    <p>This cookie policy is only for the illustrative purposes of the product WSO2 IS 5.5.0. The content in the policy is technically correct at the time of the product shipment. The organization which runs this WSO2 IS 5.5.0 instance has full authority and responsibility with regard to the effective Cookie Policy. </p>\n");
      out.write("                    <p>WSO2, its employees, partners, and affiliates do not have access to and do not require, store, process or control any of the data, including personal data contained in WSO2 IS 5.5.0. All data, including personal data is controlled and processed by the entity or individual running WSO2 IS 5.5.0.  WSO2, its employees partners and affiliates are not a data processor or a data controller within the meaning of any data privacy regulations.  WSO2 does not provide any warranties or undertake any responsibility or liability in connection with the lawfulness or the manner and purposes for which WSO2 IS 5.5.0 is used by such entities or persons. </p>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /content -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<footer class=\"footer\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <p>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "wso2.identity.server"));
      out.write(" | &copy;\n");
      out.write("            <script>document.write(new Date().getFullYear());</script>\n");
      out.write("            <a href=\"http://wso2.com/\" target=\"_blank\"><i class=\"icon fw fw-wso2\"></i>\n");
      out.write("                ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "inc"));
      out.write("\n");
      out.write("            </a>. ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "all.rights.reserved"));
      out.write("\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script src=\"libs/jquery_1.11.3/jquery-1.11.3.js\"></script>\n");
      out.write("<script src=\"libs/bootstrap_3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/u2f-api.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var ToC = \"<nav role='navigation' class='table-of-contents'>\" + \"<h4>On this page:</h4>\" + \"<ul>\";\n");
      out.write("    var newLine, el, title, link;\n");
      out.write("\n");
      out.write("    $(\"#cookiePolicy h2,#cookiePolicy h3\").each(function() {\n");
      out.write("        el = $(this);\n");
      out.write("        title = el.text();\n");
      out.write("        link = \"#\" + el.attr(\"id\");\n");
      out.write("        if(el.is(\"h3\")){\n");
      out.write("            newLine = \"<li class='sub'>\" + \"<a href='\" + link + \"'>\" + title + \"</a>\" + \"</li>\";\n");
      out.write("        }else{\n");
      out.write("            newLine = \"<li >\" + \"<a href='\" + link + \"'>\" + title + \"</a>\" + \"</li>\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ToC += newLine;\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    ToC += \"</ul>\" + \"</nav>\";\n");
      out.write("\n");
      out.write("    $(\"#toc\").append(ToC);\n");
      out.write("</script>\n");
      out.write("\n");
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
