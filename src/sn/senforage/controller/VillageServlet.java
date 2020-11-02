 package sn.senforage.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senforage.dao.IVillage;
import sn.senforage.dao.Villageimpl;
import sn.senforage.entities.Village;

/**
 * Servlet implementation class Village
 */
@WebServlet(urlPatterns = {"/Village", "/ListeVillage"})
public class VillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IVillage villagedao;
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		villagedao = new Villageimpl();
	}
    public VillageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getServletPath().equalsIgnoreCase("/Village")) {
    	request.getRequestDispatcher("WEB-INF/view/village/ajout.jsp").forward(request, response);
		}
		
		else if(request.getServletPath().equalsIgnoreCase("/ListeVillage")) {
	    	
    		request.setAttribute("ListeVillage", villagedao.list());
    	   	
    	request.getRequestDispatcher("WEB-INF/view/village/liste.jsp").forward(request, response);
    	}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom").toString();
		
		Village village = new Village();
		village.setNom(nom);
		
		int ajout = villagedao.add(village);
		response.getWriter().println("Village ajoute avec succes");
		
	}

}
