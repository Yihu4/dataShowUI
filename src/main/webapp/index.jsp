<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<%--
 action : 请求路径
 method : 请求方式：post和get。表单的请求一般都是post
 --%>
<form action="/LoginServlet" method="post">
    <%--
        type = text : 表示这个input项是一个文本框
        name : 给这个input项取一个名称
        <br> : 页面换行
     --%>
    用户名称: <input type="text" name="username" /><br>
    <%-- 密码框 --%>
    用户密码 : <input type="password" name="password" /><br>

    <%-- 多选框 --%>
    擅长运动： <br>
    篮球：<input type="checkbox" name="sport" value="basketball"/>&nbsp&nbsp
    足球：<input type="checkbox" name="sport" value="football"/>&nbsp&nbsp
    乒乓球：<input type="checkbox" name="sport" value="pingpong"/>&nbsp&nbsp<br>

    兴趣爱好： <br>
    吃饭：<input type="checkbox" name="love" value="eat"/>&nbsp&nbsp
    睡觉：<input type="checkbox" name="love" value="sleep"/>&nbsp&nbsp
    打代码：<input type="checkbox" name="love" value="code"/>&nbsp&nbsp<br>

    <%-- 单选框 --%>
    男：<input type="radio" name="gender" value="man"/>&nbsp&nbsp
    女：<input type="radio" name="gender" value="woman" checked />&nbsp&nbsp<br>

    <%-- 下拉列表 --%>
    生日：<select name="date">
    <option value="1999" >1999</option>
    <option value="2000" selected>2000</option>
</select><br>

    <%-- 列表 --%>
    技能：<select name="skill" multiple>
    <option value="sing" >唱歌</option>
    <option value="dance" >跳舞</option>
</select><br>

    <%-- 文本域 --%>
    个人介绍：<br>
    <textarea cols="25" rows="10">

            </textarea><br>

    <%-- 文件上传框 --%>
    文件上传：<input type="file" name="file" /><br>

    <%-- 隐藏框 --%>
    <input type="hidden" name="sb" value="123 2b" />

    <%-- 普通按钮 --%>
    <input type="button" value="我很普通" /><br>
    <%-- 重制按钮 --%>
    <input type="reset" /><br>
    <%-- 表单提交按钮 --%>
    <input type="submit" value="登陆" /><br>

    <%-- 图片提交 --%>
    <input type="image" src="button.png" /><br>
</form>
</body>
</html>