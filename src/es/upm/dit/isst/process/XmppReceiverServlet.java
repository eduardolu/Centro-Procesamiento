package es.upm.dit.isst.process;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.google.appengine.api.xmpp.JID;
import com.google.appengine.api.xmpp.Message;
import com.google.appengine.api.xmpp.MessageBuilder;
import com.google.appengine.api.xmpp.MessageType;
import com.google.appengine.api.xmpp.XMPPService;
import com.google.appengine.api.xmpp.XMPPServiceFactory;

import es.upm.dit.isst.process.dao.TaccDAO;
import es.upm.dit.isst.process.dao.TaccDAOImpl;
import es.upm.dit.isst.process.model.Alerta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Handler class for all XMPP messages.
 */
public class XmppReceiverServlet extends HttpServlet {

  private static final XMPPService xmppService =
      XMPPServiceFactory.getXMPPService();

  @Override
  public void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws IOException, ServletException {
	 
	  
    Message message = xmppService.parseMessage(req);

  /*  while(true) {		
    String summary = message.getBody();
	String longDescription = "Correcto";
	String url = "Correcto";
	String deadline = "1/1/1992";*/

	TaccDAO dao = TaccDAOImpl.getInstance();
	dao.addAlerta("Seguridad", message.getBody());

	//view.forward(req, resp);
	//resp.setHeader("REFRESH", "30");
	
  }

}
