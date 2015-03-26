package es.upm.dit.isst.process;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.process.dao.TaccDAO;
import es.upm.dit.isst.process.dao.TaccDAOImpl;

public class RemoveAlertaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
				
		System.out.println("Borrando alerta");
		
		String id = req.getParameter("id");
		TaccDAO dao = TaccDAOImpl.getInstance();
		dao.removeAlerta(Long.parseLong(id));
		

		resp.sendRedirect("/inicio");

		}
}
