<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ricerca Televisore</title>
</head>
<body>
	<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
		
	<% }else if(request.getAttribute("messaggioModificaDb") != null){ %>
	
		<p style="color: blue;"><%=request.getAttribute("messaggioModificaDb") %></p>

	<% }else{ %>
		Inserire dati per la ricerca<br>
	<%}    %>
	
	
	<form action="RicercaServlet" method="post">
		<label for="marcaInputId">Marca:</label><br>
		<input type="text" name="marcaInput" id="marcaInputId">
		<br>
		<input type="submit" value="CERCA">
	</form>
</body>
</html>