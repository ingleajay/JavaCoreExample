package com.jstltags;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CoutTag extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = "Ajay";
		request.setAttribute("label",name);
		RequestDispatcher rd=request.getRequestDispatcher("tagcout.jsp");  
        rd.forward(request, response);
	}

}
