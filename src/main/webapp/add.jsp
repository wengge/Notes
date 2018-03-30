<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/24 0024
  Time: 下午 2:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="commons/commons.jsp"%>
</head>
<body>

<form action="note/add" method="post">
    <h2>添加笔记</h2>
    <table>
        <tr><td>标题：</td><td><input name="title"></td></tr>
        <tr><td>内容：</td><td><input name="content"></td></tr>
        <tr><td>时间：</td><td><input type="date" name="time"></td></tr>
        <tr><td><input type="submit" value="提交"></td><td></td></tr>

    </table>
</form>
</body>
</html>
