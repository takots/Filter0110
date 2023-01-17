package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PlusServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
   //no-argument constructor
    public PlusServlet() {
    	super();
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
    	response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        int num1 = Integer.parseInt(request.getParameter("num1").trim());
        int num2 = Integer.parseInt(request.getParameter("num2").trim());
        out.print("<h1>You NumPlus is " + num1 + num2 + "</h1>");  
        out.close();  
    }
}
