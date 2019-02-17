<%@ page import="java.util.ArrayList" %>
<%@ page import="it.DTO.UserDTO" %>
<%@ page import="it.DTO.TentativoDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    ArrayList<TentativoDTO> list = (ArrayList<TentativoDTO>) request.getSession().getAttribute("classificaTentativi");
%>
<head>
    <title>ClassificaUser</title>
</head>
<body>
Classifica Tentativi:
<br><br>
<% int i;%>
<%
    for (i=0; i<list.size(); i++)
    {
          out.println(list.get(i).getIDComb()); %> &nbsp;&nbsp;
<%        out.println(list.get(i).getUser()); %> &nbsp;&nbsp;
<%        out.println(list.get(i).getPosEsatta()); %>&nbsp;&nbsp;
<%        out.println(list.get(i).getNumEsatto()); %>&nbsp;&nbsp;
<%        out.println(list.get(i).getSoluzione()); %>&nbsp;&nbsp;
<%        out.println(list.get(i).getInput()); %>&nbsp;&nbsp;
<%        out.println(list.get(i).getnTentativi()); %>
<br><br>
<%    }
%>
</body>
</html>

