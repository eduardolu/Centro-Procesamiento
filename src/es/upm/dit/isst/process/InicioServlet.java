package es.upm.dit.isst.process;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.process.dao.TaccDAO;
import es.upm.dit.isst.process.dao.TaccDAOImpl;
import es.upm.dit.isst.process.model.Alerta;

public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws IOException, ServletException {
		
		System.out.println("Inicio servlet");
		TaccDAO dao = TaccDAOImpl.getInstance();
		List<Alerta> alertas = new ArrayList<Alerta>();
		
		String geturl = req.getRequestURI();
		System.out.println(geturl);
		String chat = "/alertallega";
		
	
		alertas = dao.listAlertas();

		req.getSession().setAttribute("alertas", new ArrayList<Alerta>(alertas));
		
		RequestDispatcher view = req.getRequestDispatcher("Inicio.jsp");
		view.forward(req, resp);
		
		
		
	}
	
	
}
