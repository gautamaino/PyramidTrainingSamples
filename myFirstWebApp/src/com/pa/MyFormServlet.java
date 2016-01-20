package com.pa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyFormServlet
 */
@WebServlet("/MyFormServlet")
public class MyFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        
        writer.write("<html><body>");
        writer.write("<form action=MyFormServlet?form=true>");
        writer.write("<input type=text name=\"hello\" />");
        writer.write("<input type=submit name=\"submit\" />");
        writer.write("</form>");
        writer.write("</body></html>");
        
        String str =  (request.getParameter("hello"));
        
        HttpSession session = request.getSession(true);
        List<String> nameList = (List<String>)session.getAttribute("nameList");
        
        if (nameList == null){
              nameList = new ArrayList<String>();
              session.setAttribute("nameList" , nameList);
        }
        
        if (str!=null){
              nameList.add(str);
        }
        
        for (String name: nameList ){
              writer.write("<h2> " + name);
        }
        writer.flush();
        writer.close();
  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

}
