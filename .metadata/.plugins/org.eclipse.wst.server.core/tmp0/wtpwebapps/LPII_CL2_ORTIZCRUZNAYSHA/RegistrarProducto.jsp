<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.TblProductocl2" %>
<%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar producto</title>
</head>
<body bgcolor="#C0C0C0">
<h1 align="center">Registrar Producto</h1>
<form action="ControladorServletprod" method="post">

<table align="center">
<tr>
<td>Nombre producto</td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td>Precio venta</td>
<td><input type="text" name="precioventa"></td>
</tr>
<tr>
<td>Precio compra</td>
<td><input type="text" name="PrecioCompra"></td>
</tr>
<tr>
<td>Estado</td>
<td>
<select name="estado">
	<option>--Seleccione--</option>
	<option>Vigente</option>
	<option>Agotado</option>
</select>
</td>
</tr>
<tr>
<td>Descripcion</td>
<td><input type="text" name="descrip"></td>
</tr>
<tr >
<td colspan="2" align="center" >
<input type="submit" name="Registra Producto" value="Registrar">
</td>
</tr>
</table>
</form>
<!--  <td><input type="submit" name="Registra Producto"></td>-->

<h1 align="center">Listado de productos</h1>
<table align="center" border="2">
<tr>
<th>Codigo</th>
<th>Nombre</th>
<th>Precio Venta</th>
<th>Precio Compra</th>
<th>Estado</th>
<th>Descripcion</th>

<%
List<TblProductocl2> Listadoproducto=(List<TblProductocl2>)request.getAttribute("listado");
if(Listadoproducto!=null){
	for(TblProductocl2 lis:Listadoproducto){
%>	
<tr>
<td>
<%=lis.getIdproducto() %>
</td>
<td>
<%=lis.getNombrecl2() %>
</td>
<td>
<%=lis.getPrecioventacl2() %>
</td>
<td>
<%=lis.getPreciocompracl2() %>
</td>
<td>
<%=lis.getEstadocl2() %>
</td>
<td>
<%=lis.getDescripcioncl2() %>
</td>
</tr>
<% 

	}
}
%>
</table>

</body>

</html>