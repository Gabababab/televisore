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
 * Servlet implementation class ExecuteInsertTelevisoreServlet
 */
@WebServlet("/ExecuteInsertTelevisoreServlet")
public class ExecuteInsertTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExecuteInsertTelevisoreServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		String destinazione=null;
		
		String marcaDaServlet = request.getParameter("marcaInput");
		String modelloDaServlet = request.getParameter("modelloInput");
		int polliciDaServlet = Integer.parseInt(request.getParameter("polliciInput"));
		String serialeDaServlet = request.getParameter("serialeInput");
		
		Televisore televisoreInsert = new Televisore(marcaDaServlet, modelloDaServlet,
				polliciDaServlet, serialeDaServlet);
		
		int x = 0;


			try {
				x=televisoreServiceInstance.inserisciNuovo(televisoreInsert);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		if(x==1) {
			String messaggioDaInviareAPagina = "Item aggiunto!";
			request.setAttribute("messaggioModificaDb", messaggioDaInviareAPagina);
			destinazione = "formRicerca.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);

	}

}
