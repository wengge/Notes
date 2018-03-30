<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/24 0024
  Time: 下午 2:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
    <%@ include file="commons/commons.jsp"%>

</head>
<body>
<h2>笔记列表</h2>
<table cellspacing="0" border="1px">
    <tr><th>编号</th><th>标题</th><th>内容</th><th>时间</th><th>操作</th></tr>
    <c:forEach items="${list}" var="note">
        <tr><td>${note.id}</td> <td>${note.title}</td> <td>${note.content}</td> <td>${note.time}</td> <td><a href="note/delete?id=${note.id}">删除</a>&nbsp;&nbsp;<a href="note/findById?id=${note.id}">更改</a></td></tr>
    </c:forEach>

</table>
</body>
</html>
