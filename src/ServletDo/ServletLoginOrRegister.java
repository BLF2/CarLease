package ServletDo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbOp.DbRead;
import login.*;


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
			String LoginName = request.getParameter("LoginName");
			String LoginPswd = request.getParameter("LoginPswd");
			LoginFactory lf = new LoginFactory();
			if(lf.setLoginName(LoginName)){
			
				
				//输出用户名不合法
				
				
				
				
				
			}
			lf.setLoginPswd(LoginPswd);
			LoginInfo li = new LoginInfo();
			try{
				li = new DbRead().DbReadLoginInfoByName(lf.getLoginName());
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}else if(cmd.equals("Register")){
			String loginName = request.getParameter("LoginName");
			String loginPswd = request.getParameter("LoginPswd");
			LoginFactory lf = new LoginFactory();
			lf.setLoginName(loginName);
			lf.setLoginPswd(loginPswd);
			lf.setLoginNum(2);
			try{
				lf.getLoginInfo();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
