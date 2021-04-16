<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id=<%=((Member)request.getAttribute("name")).getId()%></li>
    <li>username=<%=((Member)request.getAttribute("name")).getUsername()%></li>
    <li>age=<%=((Member)request.getAttribute("name")).getAge()%></li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
