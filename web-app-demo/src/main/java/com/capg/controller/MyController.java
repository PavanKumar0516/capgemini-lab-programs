package com.capg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyController
 */
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyController() {
		// TODO Auto-generated constructor stub
	}

	/**
		 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String uName=request.getParameter("uName");
//			RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
//			rd.forward(request, response);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("uName", uName);
			response.sendRedirect("show.jsp");
}
}
