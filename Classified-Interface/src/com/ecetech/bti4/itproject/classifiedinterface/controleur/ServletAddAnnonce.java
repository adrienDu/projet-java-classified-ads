package com.ecetech.bti4.itproject.classifiedinterface.controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;
import com.ecetech.bti4.itproject.classifiedinterface.utils.QualityDataQualification;

/**
 * Servlet implementation class ServletAddAnnonce
 */
@WebServlet("/newAnnonce")
public class ServletAddAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String errorString; 
    private String VUE = "/WEB-INF/admin/NewAnnonce.jsp";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAddAnnonce() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processRequest(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		response.setContentType("text/html;charset=UTF-8");

		// @param action
		String titre = request.getParameter("titre");
		String desc = request.getParameter("desc");
		String picture = "";
		//String picture = request.getParameter("picture");
		String zone = request.getParameter("zone");
		//int zone =Integer.getInteger(Szon);
		String dateF = request.getParameter("dateF");
		int imp =1;
		String idUser = request.getParameter("user");
		//int idCat = Integer.getInteger(request.getParameter("cat"));
		String idCat = request.getParameter("cat");
		//int idType = Integer.getInteger(request.getParameter("type"));
		String idType = request.getParameter("type");

		User user = null;

		if (QualityDataQualification.verifData(titre) && QualityDataQualification.verifData(desc) && QualityDataQualification.verifData(zone) && QualityDataQualification.verifData(dateF) && QualityDataQualification.verifData(idCat) && QualityDataQualification.verifData(idType)) {
		System.out.println("titre" + titre +" description " + desc +" picture " + picture + " zone "+ zone + " dateF "+ "importance " + imp + " idUser " + idUser + "  idCat " + idCat + " idType"  + idType);
		} else {
			VUE = "/WEB-INF/admin/loginAdmin.jsp";
			errorString = "Mail ou Mot de passe manquant";
			session.setAttribute( "sessionUtilisateur", null );
		}

		request.setAttribute("errorString", errorString);

		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
