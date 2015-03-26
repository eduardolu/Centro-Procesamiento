package es.upm.dit.isst.process;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import es.upm.dit.isst.process.dao.TaccDAO;
import es.upm.dit.isst.process.dao.TaccDAOImpl;
import es.upm.dit.isst.process.model.*;



public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws IOException, ServletException {
	
		TaccDAO dao = TaccDAOImpl.getInstance();
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		String url = userService.createLoginURL(req.getRequestURI());
		String urlLinktext = "Login";
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		if (user != null){
			 url = "/inicio";
			}
		req.getSession().setAttribute("user", user);
		req.getSession().setAttribute("url", url);
		RequestDispatcher view = req.getRequestDispatcher("/inicion.jsp");
		view.forward(req, resp);
	}
}