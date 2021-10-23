package it.televisore.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.televisore.model.Televisore;
import it.televisore.service.MyServiceFactory;
import it.televisore.service.televisore.TelevisoreService;

/**
 * Servlet implementation class ExecuteDeleteTelevisoreServlet
 */
@WebServlet("/ExecuteDeleteTelevisoreServlet")
public class ExecuteDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExecuteDeleteTelevisoreServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Long idPerRimozione = Long.parseLong(request.getParameter("idTelevisore"));

		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();

		Televisore result = null;
		int x = 0;
		try {
			result = televisoreServiceInstance.caricaSingolo(idPerRimozione);
			x=televisoreServiceInstance.rimuovi(result);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		if(x==1) {
			String messaggioDaInviareAPagina = "Item rimosso!";
			request.setAttribute("messaggioModificaDb", messaggioDaInviareAPagina);
		}

		RequestDispatcher rd = request.getRequestDispatcher("formRicerca.jsp");
		rd.forward(request, response);
	}

}
