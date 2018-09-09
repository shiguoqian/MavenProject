<%--
  Created by IntelliJ IDEA.
  User: sgq
  Date: 2018/9/1
  Time: 下午3:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/bookUser/login" method="post">
    <table>
        <tr aria-colspan="2"><th>登录图书管理系统</th></tr>
        <tr><td>用户名：</td><td><input type="text" id="bookUserName" name="bookUserName"/></td></tr>
        <tr><td>密码：</td><td><input type="password" id="bookUserPass" name="bookUserPass"/></td></tr>
        <tr aria-colspan="2"><td style="text-align: center;"><input type="submit" value="登录"/></td></tr>
        <tr><td><span style="color: red">${error}</span></td></tr>
    </table>
</form>
</body>
</html>
