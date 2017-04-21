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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
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

		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();

		VUE = "/WEB-INF/error.jsp";

		// @param forward page vers laquelle la requette est dispatché

		// @param action
		String log = request.getParameter("log");
		String mail = request.getParameter("inputEmail");
		String pswd = request.getParameter("inputPassword");
		User user = null;
		VUE = "/WEB-INF/error.jsp";

		if (QualityDataQualification.verifData(mail) || QualityDataQualification.verifData(pswd)) {
			if(QualityDataQualification.verifyEmail(mail)){
				user= UserDAO.getUserByeMail(mail);
				if(user != null){
					if(QualityDataQualification.validationMDP(user.getMdpUser(), pswd)){
						System.out.println("login");
				}
					else { System.out.println("mauvais mdp");
					}
			}
		
		}
	}
	}
}
