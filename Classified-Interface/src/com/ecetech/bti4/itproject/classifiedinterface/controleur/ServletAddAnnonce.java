package com.ecetech.bti4.itproject.classifiedinterface.controleur;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.dao.AnnonceDAO;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;
import com.ecetech.bti4.itproject.classifiedinterface.utils.QualityDataQualification;

/**
 * Servlet implementation class ServletAddAnnonce
 */
@WebServlet("/newAnnonce")
public class ServletAddAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String errorString;
	private String VUE = "/WEB-INF/admin/nouvelleAnnonce.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletAddAnnonce() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
		User user = (User) session.getAttribute("sessionUtilisateur");
		response.setContentType("text/html;charset=UTF-8");
		if (request.getParameter("add") != null && request.getParameter("add").compareTo("ok") == 0) {
			VUE = "/WEB-INF/view/nouvelleAnnonce.jsp";
		} else {
			// @param action
			String titre = request.getParameter("titre");
			String desc = request.getParameter("desc");
			String picture = "";
			// String picture = request.getParameter("picture");
			int zone = Integer.parseInt(request.getParameter("zone"));
			String dateF = request.getParameter("dateF");
			int imp = 1;
			String idUser = user.getIdUser();
			int idCat = Integer.parseInt(request.getParameter("cat"));
			int idType = Integer.parseInt(request.getParameter("type"));
			java.sql.Date dateAnnonce = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			float prix = 0;
			if (request.getParameter("prix") != null) {
				prix = Float.parseFloat(request.getParameter("prix"));
			}
			String contact = request.getParameter("contact");

			if (QualityDataQualification.verifData(titre) && QualityDataQualification.verifData(desc)
					&& QualityDataQualification.verifData(zone) && QualityDataQualification.verifData(dateF)
					&& QualityDataQualification.verifData(idCat) && QualityDataQualification.verifData(idType)) {
				System.out.println("titre" + titre + " description " + desc + " picture " + picture + " zone " + zone
						+ "prix " + prix + "contact" + contact + " dateF " + dateF + "importance " + imp + " idUser "
						+ idUser + "  idCat " + idCat + " idType" + idType);
				Annonce annonce = new Annonce(titre, desc, "", zone, prix, contact, dateAnnonce,
						QualityDataQualification.dateChecker(dateF), imp, dateAnnonce, idUser, idCat, idType);
				AnnonceDAO.newAnnonce(annonce);
				VUE = "/ServletIndex";
			} else {
				System.out.println("else");
				VUE = "newAnnonce";
				errorString = "tous les champs n'ont pas été replis";
				session.setAttribute("sessionUtilisateur", null);
			}
		}
		request.setAttribute("errorString", errorString);
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
