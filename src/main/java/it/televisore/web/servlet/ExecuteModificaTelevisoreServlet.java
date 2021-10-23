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
 * Servlet implementation class ExecuteModificaTelevisoreServlet
 */
@WebServlet("/ExecuteModificaTelevisoreServlet")
public class ExecuteModificaTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExecuteModificaTelevisoreServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long idPerModifica = Long.parseLong(request.getParameter("idTelevisore"));

		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();

		String marcaDaServlet = request.getParameter("marcaInput");
		String modelloDaServlet = request.getParameter("modelloInput");
		int polliciDaServlet = Integer.parseInt(request.getParameter("polliciInput"));
		String serialeDaServlet = request.getParameter("serialeInput");
		Televisore televisoreModifica = new Televisore(idPerModifica, marcaDaServlet, modelloDaServlet,
				polliciDaServlet, serialeDaServlet);
		
		int x = 0;
		try {
	
				x = televisoreServiceInstance.modifica(televisoreModifica);

			
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		if (x == 1) {
			String messaggioDaInviareAPagina = "Item modificato!";
			request.setAttribute("messaggioModificaDb", messaggioDaInviareAPagina);
		}

		RequestDispatcher rd = request.getRequestDispatcher("formRicerca.jsp");
		rd.forward(request, response);
	}

}
