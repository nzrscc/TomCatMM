<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>
Posizione corretta: <%= request.getAttribute("PosEsa")%>
Posizione sbagliata: <%= request.getAttribute("PosErr")%>
<br> <br> <br>

    <form action="<%=request.getContextPath()+"/Game" %>" method="post">
        <select name="scelta">
        <option name="SI">SI</option>
        <option name="NO">NO</option>
        </select>
        <button type="submit" name="invia">Invia</button>
    </form>

</body>
</html>
