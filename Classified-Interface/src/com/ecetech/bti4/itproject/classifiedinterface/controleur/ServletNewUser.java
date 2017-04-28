package com.ecetech.bti4.itproject.classifiedinterface.controleur;

import java.io.IOException;
import java.util.Calendar;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecetech.bti4.itproject.classified.beans.Annonce;
import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.dao.AnnonceDAO;
import com.ecetech.bti4.itproject.classified.dao.ParticulierDAO;
import com.ecetech.bti4.itproject.classifiedinterface.utils.QualityDataQualification;

/**
 * Servlet implementation class ServletNuewUser
 */
@WebServlet("/adduser")
public class ServletNewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String errorString;
	private String VUE = "/WEB-INF/admin/nouvelleAnnonce.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletNewUser() {
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
		String u = request.getParameter("addUserType");
		System.out.println("typeUser" + u);
		if (request.getParameter("addUserType") != null
				&& request.getParameter("addUserType").compareTo("particulier") == 0) {
			VUE = "/WEB-INF/view/inscriptionParticulier.jsp";
		}
		else if (request.getParameter("addUserType") != null
				&& request.getParameter("addUserType").compareTo("addparticulier") == 0) {
			/*if (request.getParameter("nom") != null && request.getParameter("prenom") != null
					&& request.getParameter("numRue") != null && request.getParameter("nomRue") != null
					&& request.getParameter("ville") != null && request.getParameter("codePost") != null
					&& request.getParameter("tel") != null && request.getParameter("email") != null
					&& request.getParameter("password") != null) {*/
				System.out.println("if");
				String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");
				System.out.println(prenom);
				System.out.println(request.getParameter("numRue"));
				//int numRue = Integer.parseInt(request.getParameter("numRue"));
				String nomRue = request.getParameter("nomRue");
				System.out.println(nomRue);
				String ville = request.getParameter("ville");
				System.out.println(request.getParameter("codePost"));
				System.out.println(request.getParameter("tel"));
				//int codePost = Integer.parseInt(request.getParameter("codePost"));
				//int tel = Integer.parseInt(request.getParameter("tel"));
				String email = request.getParameter("email");
				String password = request.getParameter("password");
				
				/*if (QualityDataQualification.verifyEmail(email)) {
					System.out.println("iftoto");
					ParticulierDAO.addPartUser(email, password, "user", nom, prenom, numRue, nomRue, codePost, ville,
							tel);
				}*/
			//}
		} else {
			/*
			 * // @param action String titre = request.getParameter("titre");
			 * String desc = request.getParameter("desc"); String picture = "";
			 * // String picture = request.getParameter("picture"); int zone =
			 * Integer.parseInt(request.getParameter("zone")); String dateF =
			 * request.getParameter("dateF"); int imp = 1; String idUser =
			 * user.getIdUser(); int idCat =
			 * Integer.parseInt(request.getParameter("cat")); int idType =
			 * Integer.parseInt(request.getParameter("type")); java.sql.Date
			 * dateAnnonce = new
			 * java.sql.Date(Calendar.getInstance().getTime().getTime()); float
			 * prix = 0; if (request.getParameter("prix") != null) { prix =
			 * Float.parseFloat(request.getParameter("prix")); } String contact
			 * = request.getParameter("contact");
			 * 
			 * if (QualityDataQualification.verifData(titre) &&
			 * QualityDataQualification.verifData(desc) &&
			 * QualityDataQualification.verifData(zone) &&
			 * QualityDataQualification.verifData(dateF) &&
			 * QualityDataQualification.verifData(idCat) &&
			 * QualityDataQualification.verifData(idType)) {
			 * System.out.println("titre" + titre + " description " + desc +
			 * " picture " + picture + " zone " + zone + "prix " + prix +
			 * "contact" + contact + " dateF " + dateF + "importance " + imp +
			 * " idUser " + idUser + "  idCat " + idCat + " idType" + idType);
			 * Annonce annonce = new Annonce(titre, desc, "", zone, prix,
			 * contact, dateAnnonce,
			 * QualityDataQualification.dateChecker(dateF), imp, dateAnnonce,
			 * idUser, idCat, idType); AnnonceDAO.newAnnonce(annonce); VUE =
			 * "/ServletIndex"; } else { System.out.println("else"); VUE =
			 * "newAnnonce"; errorString =
			 * "tous les champs n'ont pas été replis";
			 * session.setAttribute("sessionUtilisateur", null); }
			 */
		}
		request.setAttribute("errorString", errorString);
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

}
