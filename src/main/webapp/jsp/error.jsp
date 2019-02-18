<%--
  Created by IntelliJ IDEA.
  User: nazario
  Date: 17/02/19
  Time: 23.24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=request.getSession().getAttribute("errore")%>
<br><br><br>
<form action="<%=request.getContextPath()+"/LogIn" %>"method="get">
    <label for="userId">Username</label>
    <input type="text" name="userId" value="">
    <br><br>
    <label for="passwd">Password </label>
    <input type="password" name="passwd" value="">
    <br><br>
    <button type="submit" name="invia">Invia</button>
</form>
</body>
</html>
