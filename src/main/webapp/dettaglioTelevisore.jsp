<%@page import="it.televisore.model.Televisore" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettaglio abitante</title>
</head>
	<body>
		<%Televisore televisore=(Televisore)request.getAttribute("televisoreDaInviareAPaginaDettaglio");%>
		
		Marca: <%=televisore.getMarca()%><br>
		Modello: <%=televisore.getModello()%><br> 
		Pollici: <%=televisore.getPollici()%><br>
		Seriale: <%=televisore.getSeriale()%><br><br>
		
		<form action="RicercaServlet" method="post">
		<input type="hidden" name="marcaInput" value="<%=televisore.getMarca()%>">
		<input type="submit" value="Torna a ricerca Televisore">
		</form>
		
	</body>
</html>