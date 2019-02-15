<%@ page import="java.util.ArrayList" %>
<%@ page import="it.DTO.UserDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    ArrayList<UserDTO> list = (ArrayList<UserDTO>) request.getAttribute("servletName");
%>
<head>
    <title>ClassificaUser</title>
</head>
<body>
Classifica User:
<table>
    <tbody>
        <% for(int i=0;i<list.size();i++){;
                UserDTO user=new UserDTO();
                user=list.get(i);
        %>
        <tr>
            <td><%=user.getID()%></td>
            <td><%=user.getNome()%></td>
            <td><%=user.getPunteggio()%></td>
        </tr>
        <%
        };
        %>
    </tbody>
</table>
</body>
</html>

