<%--
  Created by IntelliJ IDEA.
  User: 24725
  Date: 2017/8/21
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <h1>Hello!</h1>
                    <%--使用JSTL表达式来获取HellServlet里传递过来的currentTime请求属性--%>
    <h2>当前时间：${currentTime}</h2>
</body>
</html>
