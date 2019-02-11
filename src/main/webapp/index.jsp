<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Home</title>
    <h1>Benvenuto su Master Mind!</h1>
</head>
<body>
<form action="<%=request.getContextPath()+"/Start" %>" method="get">
    <label for="username">Username</label>
    <input type="text" name="username" value="">
    <br>
    <button type="submit" name="invia">Invia</button>
</form>
</body>
</html>
