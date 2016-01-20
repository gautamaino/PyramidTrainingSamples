package com.pa;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Map<String , String[]> paramMap = request.getParameterMap() ;
		
		String str = request.getParameter("hello") ; 
		
		HttpSession session = request.getSession(true) ; 
		
		if (str != null ){
			response.getWriter().write("hello " +  str);
		}
		
		response.getWriter().append("<html> <body> <h1> Hello World </h1> ");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("</body> </html>");
		
		// TODO : Create a html form and send to client 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		// TODO handle the form response and send back a hello + name [this name will come from the form]
	}

}
