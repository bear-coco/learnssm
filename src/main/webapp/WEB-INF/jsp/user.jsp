<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<jsp:useBean id="user" scope="request" type="top.wangqi2020.ssm.pojo.User"/>--%>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/4/7
  Time: 上午 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html lang="zh-CN">
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎${user.userName}</h1>

<hr>
<table>
    <caption>用户信息表</caption>
    <tr>
        <th id="id">用户ID</th>
        <th id="name">用户名</th>
        <th id="pass">用户密码</th>
        <th id="age">用户年龄</th>
        <th id="cDate">创建时间</th>
        <th id="uDate">修改时间</th>
        <th id="c">操作</th>
        <th id="i"><a href="insert.jsp">插入</a></th>
    </tr>
    <br>
    <c:forEach var="list" items="${list}">
        <tr>
            <td>${list.userId}</td>
            <td>${list.userName}</td>
            <td>${list.userPwd}</td>
            <td>${list.userAge}</td>
            <td>${list.createDate}</td>
            <td>${list.updateDate}</td>
            <td><a href="#" onclick="func1()">修改</a></td>
        </tr>
    </c:forEach>
</table>
<script>
    function func1(){
        alert('改尼玛呢！哼！')
    }
</script>
</body>
</html>
