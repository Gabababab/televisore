<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<form action="ExecuteInsertTelevisoreServlet" method="post">
		<label for="marcaInputid">Marca:</label><br>
		<input type="text" name="marcaInput" id="marcaInputid">
		<br>
		<label for="modelloInputId">Modello:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId">
		<br>
		<label for="polliciInputId">Pollici:</label><br>
		<input type="text" name="polliciInput" id="polliciInputId">
		<br>
		<label for="serialeInputId">Seriale:</label><br>
		<input type="text" name="serialeInput" id="serialeInputId">
		<br>
		<input type="submit" value="Inserisci">
		</form>
	</body>
</html>