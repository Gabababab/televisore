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
 * Servlet implementation class PreparaRimozioneServlet
 */
@WebServlet("/PreparaRimozioneServlet")
public class PreparaRimozioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PreparaRimozioneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id= Long.parseLong(request.getParameter("idDaInviareComeParametro"));
		
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		Televisore result = null;
		try {
			result = televisoreServiceInstance.caricaSingolo(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("televisoreDaInviareAPaginaRimuovi", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("rimuoviTelevisore.jsp");
		rd.forward(request, response);
	}


}
