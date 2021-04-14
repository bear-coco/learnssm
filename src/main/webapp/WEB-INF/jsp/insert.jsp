<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/4/9
  Time: 上午 8:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html lang="zh-CN">
<head>
    <title>插入信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/insertUser" method="post">
    <label>账号：<input type="text" name="name"></label><br>
    <label>密码：<input type="password" name="pwd"></label><br>
    <label>年龄：<input type="number" name="age"></label><br>
    <label><input type="submit" value="提交"></label><br>
</form>
</body>
</html>
