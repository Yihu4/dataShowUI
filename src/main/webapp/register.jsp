<%--
  Created by IntelliJ IDEA.
  User: meteora
  Date: 2021/10/22
  Time: 5:18 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<form action="/RegisterServlet" method="post">
用户名称: <input type="text" name="username" /><br>
用户密码 : <input type="password" name="password" /><br>
<%-- 表单提交按钮 --%>
<input type="submit" value="登陆" /><br>
</form>
</body>
</html>
