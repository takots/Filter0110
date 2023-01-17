package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
* This class is used as a filter.
* @author w3spoint
*/
public class CalFilter implements Filter {
	private static final long serialVersionUID = 1L;
 
	public void init(FilterConfig filterConfig)  throws ServletException {
 
	}  
 
      public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
	                throws IOException, ServletException {  
 
			response.setContentType("text/html"); 
	    	PrintWriter out = response.getWriter();
			 
	    	//get parameters from request object.
			String num1 = request.getParameter("num1").trim();
			String num2 = request.getParameter("num2").trim();
			 
			Pattern pattern = Pattern.compile("[0-9.-]+");
			if(num1 == null || num1.equals("") || 
			   num2 == null || num2.equals("")){
				out.print("Please enter both num1 and num2. <br/><br/>");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/calculate.html");
				requestDispatcher.include(request, response);
			}else if(pattern.matcher(num1).matches() && pattern.matcher(num2).matches()){
				chain.doFilter(request, response);
			}else {
				out.print("Sorry wrong type. <br/><br/>");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/calculate.html");
				requestDispatcher.include(request, response);
			}
     }  
 
    public void destroy() {
 
    }  
}