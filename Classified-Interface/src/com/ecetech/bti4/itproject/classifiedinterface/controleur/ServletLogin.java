package com.ecetech.bti4.itproject.classifiedinterface.controleur;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SESSION_USER = "sessionUtilisateur";
	public static String VUE = "/WEB-INF/error.jsp";
	private String error = null;

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
						VUE = "/WEB-INF/view/index.jsp";
						session.setAttribute(SESSION_USER, user);

					} else {
						VUE = "/WEB-INF/ConnexionInscription.jsp";
						
					}
				} else {
					VUE = "/WEB-INF/ConnexionInscription.jsp";
					
				}

			} else {
				VUE = "/WEB-INF/ConnexionInscription.jsp";
				
			}

		} else {
			VUE = "/WEB-INF/ConnexionInscription.jsp";
			error = "Mail ou Mot de passe manquant";
			session.setAttribute( SESSION_USER, null );
		}

		request.setAttribute("errorString", error);

		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 try {
				processRequest(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     } 	//response.getWriter().append("Served at: ").append(request.getContextPath());

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
