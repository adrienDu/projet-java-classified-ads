package com.ecetech.bti4.itproject.classifiedinterface.controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecetech.bti4.itproject.classified.beans.User;
import com.ecetech.bti4.itproject.classified.beans.UserSes;
import com.ecetech.bti4.itproject.classified.dao.UserDAO;
import com.ecetech.bti4.itproject.classifiedinterface.utils.QualityDataQualification;

/**
 * Servlet implementation class adminDoLogin
 */
@WebServlet("/adminDoLogin")
public class adminDoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;

	// variables
	public static String VUE = "/WEB-INF/error.jsp";
	public static final String CHAMP_EMAIL = "email";
	public static final String CHAMP_PASS = "motdepasse";
	public static final String ATT_ERREURS = "erreurs";
	public static final String ATT_RESULTAT = "resultat";
	public static final String SESSION_ADMIN = "sessionUtilisateur";

	// ErrorString
	private String errorString = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public adminDoLogin() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		response.setContentType("text/html;charset=UTF-8");

		// @param action
		String log = request.getParameter("log");
		String mail = request.getParameter("inputEmail");
		String pswd = request.getParameter("inputPassword");
		User user = null;

		if (QualityDataQualification.verifData(mail) || QualityDataQualification.verifData(pswd)) {
			if (QualityDataQualification.verifyEmail(mail)) {
				user = UserDAO.getUserByeMail(mail);
				if (user != null) {
					if (QualityDataQualification.validationMDP(user.getMdpUser(), pswd)) {
						VUE = "/WEB-INF/admin/index.jsp";
						session.setAttribute(SESSION_ADMIN, user);

					} else {
						VUE = "/WEB-INF/admin/loginAdmin.jsp";
						errorString = "Mot de passe inccorect";
					}
				} else {
					VUE = "/WEB-INF/admin/loginAdmin.jsp";
					errorString = "Utilisateur innexistant";
				}

			} else {
				VUE = "/WEB-INF/admin/loginAdmin.jsp";
				errorString = "Mail inccorect";
			}

		} else {
			VUE = "/WEB-INF/admin/loginAdmin.jsp";
			errorString = "Mail ou Mot de passe manquant";
			session.setAttribute( SESSION_ADMIN, null );
		}

		request.setAttribute("errorString", errorString);

		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

}
