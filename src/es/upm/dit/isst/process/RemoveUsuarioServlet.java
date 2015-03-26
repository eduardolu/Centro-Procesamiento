package es.upm.dit.isst.process;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.process.dao.TaccDAO;
import es.upm.dit.isst.process.dao.TaccDAOImpl;

public class RemoveUsuarioServlet extends HttpServlet {

private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws IOException {
		
	System.out.println("Borrando usuarios");
	
	TaccDAO dao = TaccDAOImpl.getInstance();
	/*dao.remove(Long.parseLong("5066549580791808"));
	dao.remove(Long.parseLong("5629499534213120"));*/
	dao.delete();
	System.out.println("se han borrado");
	resp.sendRedirect("/usuarios");

	}
}
