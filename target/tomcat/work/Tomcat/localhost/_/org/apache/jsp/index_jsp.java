/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-10-22 08:57:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<form action=\"/LoginServlet\" method=\"post\">\n");
      out.write("    ");
      out.write("\n");
      out.write("    用户名称: <input type=\"text\" name=\"username\" /><br>\n");
      out.write("    ");
      out.write("\n");
      out.write("    用户密码 : <input type=\"password\" name=\"password\" /><br>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    擅长运动： <br>\n");
      out.write("    篮球：<input type=\"checkbox\" name=\"sport\" value=\"basketball\"/>&nbsp&nbsp\n");
      out.write("    足球：<input type=\"checkbox\" name=\"sport\" value=\"football\"/>&nbsp&nbsp\n");
      out.write("    乒乓球：<input type=\"checkbox\" name=\"sport\" value=\"pingpong\"/>&nbsp&nbsp<br>\n");
      out.write("\n");
      out.write("    兴趣爱好： <br>\n");
      out.write("    吃饭：<input type=\"checkbox\" name=\"love\" value=\"eat\"/>&nbsp&nbsp\n");
      out.write("    睡觉：<input type=\"checkbox\" name=\"love\" value=\"sleep\"/>&nbsp&nbsp\n");
      out.write("    打代码：<input type=\"checkbox\" name=\"love\" value=\"code\"/>&nbsp&nbsp<br>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    男：<input type=\"radio\" name=\"gender\" value=\"man\"/>&nbsp&nbsp\n");
      out.write("    女：<input type=\"radio\" name=\"gender\" value=\"woman\" checked />&nbsp&nbsp<br>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    生日：<select name=\"date\">\n");
      out.write("    <option value=\"1999\" >1999</option>\n");
      out.write("    <option value=\"2000\" selected>2000</option>\n");
      out.write("</select><br>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    技能：<select name=\"skill\" multiple>\n");
      out.write("    <option value=\"sing\" >唱歌</option>\n");
      out.write("    <option value=\"dance\" >跳舞</option>\n");
      out.write("</select><br>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    个人介绍：<br>\n");
      out.write("    <textarea cols=\"25\" rows=\"10\">\n");
      out.write("\n");
      out.write("            </textarea><br>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    文件上传：<input type=\"file\" name=\"file\" /><br>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <input type=\"hidden\" name=\"sb\" value=\"123 2b\" />\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <input type=\"button\" value=\"我很普通\" /><br>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <input type=\"reset\" /><br>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <input type=\"submit\" value=\"登陆\" /><br>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <input type=\"image\" src=\"button.png\" /><br>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
