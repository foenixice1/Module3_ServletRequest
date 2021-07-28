<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: iU LOVE
  Date: 7/28/2021
  Time: 8:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Welcome</h1>
<%
    String username = request.getParameter("username");
    Date loginTime = (Date) request.getAttribute("loginTime");
%>

<h3>Hello  <%=username%>
</h3>
<h3>Login time : <%=loginTime%>
</h3>

</body>
</html>
