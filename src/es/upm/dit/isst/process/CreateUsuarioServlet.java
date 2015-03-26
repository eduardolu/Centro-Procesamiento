package es.upm.dit.isst.process;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.process.dao.TaccDAO;
import es.upm.dit.isst.process.dao.TaccDAOImpl;


public class CreateUsuarioServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws IOException {
		
	System.out.println("Creando nuevo usuario");
	
	String nombre = "Juan Carlos";
	String primApellido = "Yelmo";
	String segApellido = "Garcia";
	TaccDAO dao = TaccDAOImpl.getInstance();
	dao.add(nombre, primApellido, segApellido, segApellido, segApellido, segApellido,
			segApellido, segApellido, segApellido, segApellido, segApellido, segApellido,
			segApellido, segApellido, segApellido, segApellido, segApellido, segApellido,
			segApellido, segApellido, segApellido, segApellido);
	resp.sendRedirect("/");

	}

}