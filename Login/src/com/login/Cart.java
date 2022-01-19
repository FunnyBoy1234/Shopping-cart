package com.login;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item1 = request.getParameter("item1");
		String item2 = request.getParameter("item2");
		String value2 = request.getParameter("value2");
		String value1 = request.getParameter("value1");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("item1", item1);
		session.setAttribute("item2", item2);
		session.setAttribute("value1", value1);
		session.setAttribute("value2", value2);
		
		response.sendRedirect("cart.jsp");
	}

}
