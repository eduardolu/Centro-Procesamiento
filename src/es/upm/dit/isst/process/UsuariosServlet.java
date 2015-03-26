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
import es.upm.dit.isst.process.model.Usuario;

public class UsuariosServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws IOException, ServletException {
		
		TaccDAO dao = TaccDAOImpl.getInstance();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		usuarios = dao.listUsuarios();
		req.getSession().setAttribute("usuarios", new ArrayList<Usuario>(usuarios));

		RequestDispatcher view = req.getRequestDispatcher("inicio.jsp");
		view.forward(req, resp);
	}
}
