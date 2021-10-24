/**
 * @author: Yihu4
 * @create: 2021-10-22 16:45
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//1. 接受的到传递过来的用户名称和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //System.out.println(username + "     " + password);

        //2. 校验
        boolean isLogin = false;
        if (username.trim().equals("admin") && password.trim().equals("123456")) {
            isLogin = true;
        }

        //3. 校验, 根据结果跳转到不同的页面
        /**
         * 1. 请求转发 ：1.只产生一次请求。跳转页面。2.地址栏不变。3. 基于客户端请求
         * 2. 重定向 ：1.会产生多次请求。跳转页面。2.地址栏会发生变化。3. 基于服务端响应
         */
        if (isLogin) {
            response.sendRedirect("/success.jsp"); // 重定向
        }else { // 失败:请求转发
            request.getRequestDispatcher("/error.jsp").forward(request, response); // 请求转发
        }
    }
}
