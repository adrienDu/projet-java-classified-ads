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
 * Servlet implementation class ServletSignIn
 */
@WebServlet("/signin")
public class ServletSignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	public static final String ATT_ERREURS = "erreurs";
	public static final String ATT_RESULTAT = "resultat";
	public static final String SESSION_USER = "sessionUtilisateur";
	public static String VUE = "/WEB-INF/error.jsp";
	private String errorString = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletSignIn() {
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
		try {
			processRequest(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		response.setContentType("text/html;charset=UTF-8");
		if (request.getParameter("connexion") != null && request.getParameter("connexion").compareTo("submit") == 0) {
			System.out.println("if");
			// @param action
			String log = request.getParameter("log");
			String mail = request.getParameter("inputEmail");
			String pswd = request.getParameter("inputPassword");
			System.out.println("mail" + mail);
			System.out.println("passwd" +pswd);
			User user = null;
			if (QualityDataQualification.verifData(mail) || QualityDataQualification.verifData(pswd)) {
				if (QualityDataQualification.verifyEmail(mail)) {
					user = UserDAO.getUserByeMail(mail);
					if (user != null) {
						if (QualityDataQualification.validationMDP(user.getMdpUser(), pswd)) {
							VUE = "/ServletIndex";
							session.setAttribute(SESSION_USER, user);
							System.out.println("logué");

						} else {
							VUE = "/WEB-INF/view/signIn.jsp";
							errorString = "Mot de passe inccorect";
						}
					} else {
						VUE = "/WEB-INF/view/signIn.jsp";
						errorString = "Utilisateur innexistant";
					}

				} else {
					VUE = "/WEB-INF/view/signIn.jsp";
					errorString = "Mail inccorect";
				}

			} else {
				VUE = "/WEB-INF/view/signIn.jsp";
				errorString = "Mail ou Mot de passe manquant";
				session.setAttribute(SESSION_USER, null);
			}
			request.setAttribute("errorString", errorString);
		}

		else {
			VUE = "/WEB-INF/view/signIn.jsp";
		}
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
