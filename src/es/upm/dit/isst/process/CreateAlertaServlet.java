package es.upm.dit.isst.process;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.xmpp.JID;
import com.google.appengine.api.xmpp.Message;
import com.google.appengine.api.xmpp.MessageBuilder;
import com.google.appengine.api.xmpp.MessageType;
import com.google.appengine.api.xmpp.SendResponse;
import com.google.appengine.api.xmpp.XMPPService;
import com.google.appengine.api.xmpp.XMPPServiceFactory;

import es.upm.dit.isst.process.dao.TaccDAO;
import es.upm.dit.isst.process.dao.TaccDAOImpl;

public class CreateAlertaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final XMPPService xmppService = XMPPServiceFactory
			.getXMPPService();

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		System.out.println("Creando nueva alerta");

		RequestDispatcher view = req.getRequestDispatcher("Inicio.jsp");
		resp.setHeader("REFRESH", "5");
		view.forward(req, resp);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		String summary = checkNull(req.getParameter("summary"));
		String areaMSG = checkNull(req.getParameter("description"));

		JID recipientJID = new JID(summary);
		Message response = new MessageBuilder()
				.withMessageType(MessageType.NORMAL)
				.withRecipientJids(recipientJID).withBody(areaMSG).build();

		if(areaMSG!=""){// Send the message
		boolean messageSent = false;
		SendResponse status = xmppService.sendMessage(response);
		messageSent = (status.getStatusMap().get(recipientJID) == SendResponse.Status.SUCCESS);
		resp.sendRedirect("/inicio");
		}
	}

	private String checkNull(String s) {
		if (s == null) {
			return "";
		}
		return s;
	}
}
