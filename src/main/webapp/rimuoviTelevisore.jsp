<%@page import="it.televisore.model.Televisore" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<%Televisore televisoreRemove=(Televisore)request.getAttribute("televisoreDaInviareAPaginaRimuovi");%>
		Confermi di voler rimuovere il televisore?<br>
		Dettagli:<br>
		<form action="ExecuteDeleteTelevisoreServlet" method="post">
		<label for="nomeInputid">Marca: <%=televisoreRemove.getMarca()%></label><br>
		
		<label for="cognomeInputId">Modello: <%=televisoreRemove.getModello()%></label><br>
		
		<label for="cfInputId">Pollici: <%=televisoreRemove.getPollici()%></label><br>
		
		<label for="etaInputId">Seriale: <%=televisoreRemove.getSeriale()%></label><br>
		
		<input type="hidden" name="idTelevisore" value="<%=televisoreRemove.getId()%>">
		<input type="submit" value="Conferma eliminazione">
		</form>
	</body>
</html>