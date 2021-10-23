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

		MODIFICA TELEVISORE<br>
		Dettagli:<br>
		<%Televisore televisore=(Televisore)request.getAttribute("televisoreDaInviareAPaginaModifica");%>
		<form action="ExecuteModificaTelevisoreServlet" method="post">
			
			<label for="marcaInputid">Nome:</label><br>
			<input type="text" name="marcaInput" value="<%=televisore.getMarca()%>" id="marcaInputid"><br>
	
			<label for="modelloInputId">Modello:</label><br>
			<input type="text" name="modelloInput" value="<%=televisore.getModello()%>" id="modelloInputId"><br>
			
			<label for="polliciInputId">Pollici: </label><br>
			<input type="text" name="polliciInput" value="<%=televisore.getPollici()%>" id="polliciInputId"><br>
			
			<label for="serialeInputId">Età: </label><br>
			<input type="text" name="serialeInput" value="<%=televisore.getSeriale()%>" id="serialeInputId"><br>
					
			<input type="hidden" name="idTelevisore" value="<%=televisore.getId()%>">
			<input type="submit" value="Conferma modifica">
		</form>
	</body>
</html>