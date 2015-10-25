package ServletDo;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.rmi.server.Dispatcher;


public class ServletLoginOrRegister extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Reponse(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Reponse(request,response);
	}
	private void Reponse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("Submit");
		if(cmd.equals("login")){
			//response.sendRedirect("");
		}else if(cmd.equals("register")){
		//	response.sendRedirect("");
		}else if(cmd.equals("Login")){
			
		}else if(cmd.equals("Register")){
			
		}
	}
}
