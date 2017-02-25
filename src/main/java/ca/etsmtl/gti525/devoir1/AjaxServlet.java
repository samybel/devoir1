package ca.etsmtl.gti525.devoir1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3711421857778570708L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("Hello World");
		out.close();
	}
}
