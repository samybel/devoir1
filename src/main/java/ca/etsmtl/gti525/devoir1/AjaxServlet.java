package ca.etsmtl.gti525.devoir1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3711421857778570708L;
	private Collection col = new Collection();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		if(request.getParameter("listeImages")==null){
			request.setAttribute("collection", col.getImages());
			request.getRequestDispatcher("/collection.jsp").forward(request, response);	
		}else{
			request.setAttribute("image", col.getImage(Integer.parseInt(request.getParameter("listeImages"))));
			request.setAttribute("dossierVignettes", getServletConfig().getInitParameter("dossierVignettes"));
			request.getRequestDispatcher("/details.jsp").forward(request, response);
		}

	}


}
