<%@ page import="java.util.ArrayList" %>
<%@ page import="it.DTO.UserDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<%
    ArrayList<UserDTO> list = (ArrayList<UserDTO>) request.getSession().getAttribute("classificaUser");
%>
<head>
    <title>ClassificaUser</title>
</head>
<body>
Classifica User:
<br><br>
<% int i=0;%>
<%
    for (i=0; i<list.size(); i++)
    {
        out.println(list.get(i).getID()); %> &nbsp;&nbsp;
<%        out.println(list.get(i).getNome()); %> &nbsp;&nbsp;
<%        out.println(list.get(i).getPunteggio()); %>

<br>
<%    }
%>
</body>
</html>

