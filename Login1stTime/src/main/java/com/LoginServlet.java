package com;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	public LoginServlet() 
	{
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		PrintWriter X=response.getWriter();
		response.setContentType("text/html");
		String username=request.getParameter("fname");
		String password=request.getParameter("password");
		RequestDispatcher rd=null;
		//		X.print(username);
		//		X.print(password);
		//		System.out.println(username+" "+password);
		//		RequestDispatcher rd=request.getRequestDispatcher(username,password);
		if(username.equals("admin")&& password.equals("admin"))
		{
			X.println("<script type=\"text/javascript\">");
			X.println("alert('User or password correct');");
			X.println("</script>");
			X.print("<h1>Login done</h1>");
			rd=request.getRequestDispatcher("Joogle");
			rd.forward(request, response);
		}
		else
		{
			//			response.sendRedirect("index.html");  
			//			X.print("<h1>Login failed</h1>");
			X.print("<h1>Login Failed</h1>");
			rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
//			X.println("<script type=\"text/javascript\">");
//			X.println("alert('User or password incorrect');");
//			X.println("location='index.html';");
//			X.println("</script>");

		}

	}

}
