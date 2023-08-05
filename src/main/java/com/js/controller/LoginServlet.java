package com.js.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.CustomerCRUD;
@WebServlet("/rrr")
public class LoginServlet  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("mail");
		int password=Integer.parseInt(req.getParameter("pwd"));
		
		
		boolean res=CustomerCRUD.validatecustomer(email, password);
		
		if(res)
		{
			
			
			
			RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		}
		else
		{
			PrintWriter pw=resp.getWriter();
			pw.write("<html>\r\n" + 
					"<head>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"<h1>Email and Password Wrong</h1>\r\n" + 
					"</body>\r\n" + 
					"</html>");
			
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			rd.include(req, resp);
		}
		
	}

}
