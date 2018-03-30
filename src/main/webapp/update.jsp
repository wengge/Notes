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

<form action="note/update" method="post">
    <h2>更改笔记</h2>
    <table>
        <tr><td></td><td><input type="hidden" name="id" value="${note.id}"></td></tr>

        <tr><td>标题：</td><td><input name="title" value="${note.title}"></td></tr>
        <tr><td>内容：</td><td><input name="content" value="${note.content}"></td></tr>
        <tr><td>时间：</td><td><input type="date"  name="time" value="${note.time}"></td></tr>
        <tr><td><input type="submit" value="提交"></td><td></td></tr>

    </table>
</form>
</body>
</html>
