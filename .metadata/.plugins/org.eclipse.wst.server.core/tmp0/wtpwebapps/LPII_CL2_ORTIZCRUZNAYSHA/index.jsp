<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ventana Usuario</title>
</head>
<body bgcolor="#C0C0C0">
<h2 align="center">Ingresar al sistema</h2>

<form action="ControladorServlet" method="post">

<table align="center" border="3">
<tr>
<td>Usuario</td>
<td><input type="text" name="usuario"></td>
</tr>
<tr>
<td>Contraseņa</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Ingresar">
</td>
</tr>

</table>
</form>

</form>
</body>
</html>
